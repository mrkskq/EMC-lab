package mk.ukim.finki.emclab.service.application.impl;

import mk.ukim.finki.emclab.model.dto.DisplayBookStatsViewDto;
import mk.ukim.finki.emclab.service.application.BookStatsViewApplicationService;
import mk.ukim.finki.emclab.service.domain.BookStatsViewService;
import org.springframework.stereotype.Service;

import java.util.List;

// lab2 - 5. za materialized view
@Service
public class BookStatsViewApplicationServiceImpl implements BookStatsViewApplicationService {

    private final BookStatsViewService bookStatsViewService;

    public BookStatsViewApplicationServiceImpl(BookStatsViewService bookStatsViewService) {
        this.bookStatsViewService = bookStatsViewService;
    }

    @Override
    public List<DisplayBookStatsViewDto> findAllStats() {
        return DisplayBookStatsViewDto.from(bookStatsViewService.findAllStats());
    }
}
