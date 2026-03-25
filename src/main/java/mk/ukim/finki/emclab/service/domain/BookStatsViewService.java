package mk.ukim.finki.emclab.service.domain;

import mk.ukim.finki.emclab.model.views.BookStatsView;

import java.util.List;

// lab2 - 5. za materialized view
public interface BookStatsViewService {
    List<BookStatsView> findAllStats();
}
