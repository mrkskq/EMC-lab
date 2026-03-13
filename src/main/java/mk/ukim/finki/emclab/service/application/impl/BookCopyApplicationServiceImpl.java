package mk.ukim.finki.emclab.service.application.impl;

import mk.ukim.finki.emclab.model.dto.DisplayBookCopyDto;
import mk.ukim.finki.emclab.service.application.BookCopyApplicationService;
import mk.ukim.finki.emclab.service.domain.BookCopyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCopyApplicationServiceImpl implements BookCopyApplicationService {

    private final BookCopyService bookCopyService;

    public BookCopyApplicationServiceImpl(BookCopyService bookCopyService) {
        this.bookCopyService = bookCopyService;
    }

    @Override
    public List<DisplayBookCopyDto> findAll() {
        return DisplayBookCopyDto.from(bookCopyService.findAll());
    }

    @Override
    public DisplayBookCopyDto borrowCopy(Long bookId) {
        return DisplayBookCopyDto.from(bookCopyService.borrowCopy(bookId));
    }

    @Override
    public void returnCopy(Long copyId) {
        bookCopyService.returnCopy(copyId);
    }

    @Override
    public int availableCopies(Long bookId) {
        return bookCopyService.availableCopies(bookId);
    }
}
