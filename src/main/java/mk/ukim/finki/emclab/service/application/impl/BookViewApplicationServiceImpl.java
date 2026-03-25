package mk.ukim.finki.emclab.service.application.impl;

import mk.ukim.finki.emclab.model.dto.DisplayBookViewDto;
import mk.ukim.finki.emclab.service.application.BookViewApplicationService;
import mk.ukim.finki.emclab.service.domain.BookViewService;
import org.springframework.stereotype.Service;

import java.util.List;

// lab2 - 4. za database view
@Service
public class BookViewApplicationServiceImpl implements BookViewApplicationService {

    private final BookViewService bookViewService;

    public BookViewApplicationServiceImpl(BookViewService bookViewService) {
        this.bookViewService = bookViewService;
    }

    @Override
    public List<DisplayBookViewDto> findAll() {
        return DisplayBookViewDto.from(bookViewService.findAll());
    }
}
