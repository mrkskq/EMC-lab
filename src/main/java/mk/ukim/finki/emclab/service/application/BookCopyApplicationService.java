package mk.ukim.finki.emclab.service.application;

import mk.ukim.finki.emclab.model.dto.DisplayBookCopyDto;

import java.util.List;

public interface BookCopyApplicationService {
    List<DisplayBookCopyDto> findAll();

    DisplayBookCopyDto borrowCopy(Long bookId);

    void returnCopy(Long copyId);

    int availableCopies(Long bookId);
}
