package mk.ukim.finki.emclab.service.domain.impl;

import mk.ukim.finki.emclab.model.domain.BookCopy;
import mk.ukim.finki.emclab.repository.BookCopyRepository;
import mk.ukim.finki.emclab.service.domain.BookCopyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCopyServiceImpl implements BookCopyService {

    private final BookCopyRepository bookCopyRepository;

    public BookCopyServiceImpl(BookCopyRepository bookCopyRepository) {
        this.bookCopyRepository = bookCopyRepository;
    }

    @Override
    public List<BookCopy> findAll() {
        return bookCopyRepository.findAll();
    }

    @Override
    public BookCopy borrowCopy(Long bookId) {
        BookCopy bookCopy = bookCopyRepository
                .findFirstByBookIdAndAvailableTrue(bookId)
                .orElseThrow(() -> new RuntimeException("No available copies!"));

        bookCopy.setAvailable(false);
        return bookCopyRepository.save(bookCopy);
    }

    @Override
    public void returnCopy(Long copyId) {
        BookCopy bookCopy = bookCopyRepository.findById(copyId)
                .orElseThrow(() -> new RuntimeException("Copy not found!"));

        bookCopy.setAvailable(true);
        bookCopyRepository.save(bookCopy);
    }

    @Override
    public int availableCopies(Long bookId) {
        return bookCopyRepository.countByBookIdAndAvailableTrue(bookId);
    }
}
