package mk.ukim.finki.emclab.service.domain;

import mk.ukim.finki.emclab.model.views.BookView;

import java.util.List;

// lab2 - 4. za database view
public interface BookViewService {
    List<BookView> findAll();
}
