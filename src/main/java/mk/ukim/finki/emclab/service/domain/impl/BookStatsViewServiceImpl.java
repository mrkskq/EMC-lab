package mk.ukim.finki.emclab.service.domain.impl;

import mk.ukim.finki.emclab.model.views.BookStatsView;
import mk.ukim.finki.emclab.repository.BookStatsViewRepository;
import mk.ukim.finki.emclab.service.domain.BookStatsViewService;
import org.springframework.stereotype.Service;

import java.util.List;

// lab2 - 5. za materialized view
@Service
public class BookStatsViewServiceImpl implements BookStatsViewService {

    private final BookStatsViewRepository bookStatsViewRepository;

    public BookStatsViewServiceImpl(BookStatsViewRepository bookStatsViewRepository) {
        this.bookStatsViewRepository = bookStatsViewRepository;
    }

    @Override
    public List<BookStatsView> findAllStats() {
        return bookStatsViewRepository.findAll();
    }
}
