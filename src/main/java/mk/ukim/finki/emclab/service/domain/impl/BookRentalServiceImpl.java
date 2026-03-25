package mk.ukim.finki.emclab.service.domain.impl;

import jakarta.transaction.Transactional;
import mk.ukim.finki.emclab.events.BookRentedEvent;
import mk.ukim.finki.emclab.events.BookUnavailableEvent;
import mk.ukim.finki.emclab.model.domain.Book;
import mk.ukim.finki.emclab.model.exception.BookNotAvailableException;
import mk.ukim.finki.emclab.model.exception.BookNotFoundException;
import mk.ukim.finki.emclab.repository.BookRepository;
import mk.ukim.finki.emclab.service.domain.BookRentalService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

// lab2 - 7. za event handling pri iznajmuvanje kniga
@Service
public class BookRentalServiceImpl implements BookRentalService {

    private final BookRepository bookRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    public BookRentalServiceImpl(BookRepository bookRepository, ApplicationEventPublisher applicationEventPublisher) {
        this.bookRepository = bookRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    @Transactional
    public void rentBook(Long bookId, String rentedBy) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException(bookId));

        if (book.getAvailableCopies() <= 0) {
            throw new BookNotAvailableException(bookId);
        }

        book.setAvailableCopies(book.getAvailableCopies() - 1);
        bookRepository.save(book);

        // lab2 - 7. za event handling pri iznajmuvanje kniga
        applicationEventPublisher.publishEvent(new BookRentedEvent(book, rentedBy));

        // lab2 - 8. za listener za nedostapni knigi
        if (book.getAvailableCopies() == 0){
            applicationEventPublisher.publishEvent(new BookUnavailableEvent(book, rentedBy));
        }
    }
}