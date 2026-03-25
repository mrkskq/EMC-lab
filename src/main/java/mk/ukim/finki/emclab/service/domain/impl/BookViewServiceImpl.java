package mk.ukim.finki.emclab.service.domain.impl;

import mk.ukim.finki.emclab.model.views.BookView;
import mk.ukim.finki.emclab.repository.BookViewRepository;
import mk.ukim.finki.emclab.service.domain.BookViewService;
import org.springframework.stereotype.Service;

import java.util.List;

// lab2 - 4. za database view
@Service
public class BookViewServiceImpl implements BookViewService {

    private final BookViewRepository bookViewRepository;

    public BookViewServiceImpl(BookViewRepository bookViewRepository) {
        this.bookViewRepository = bookViewRepository;
    }

    @Override
    public List<BookView> findAll() {
        return bookViewRepository.findAll();
    }
}
