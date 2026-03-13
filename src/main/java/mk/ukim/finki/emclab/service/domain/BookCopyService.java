package mk.ukim.finki.emclab.service.domain;

import mk.ukim.finki.emclab.model.domain.BookCopy;

import java.util.List;
import java.util.Optional;

public interface BookCopyService {
    List<BookCopy> findAll();

    BookCopy borrowCopy(Long bookId);

    void returnCopy(Long copyId);

    int availableCopies(Long bookId);
}
