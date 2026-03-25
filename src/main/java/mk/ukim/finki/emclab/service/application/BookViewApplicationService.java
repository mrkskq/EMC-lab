package mk.ukim.finki.emclab.service.application;

import mk.ukim.finki.emclab.model.dto.DisplayBookViewDto;

import java.util.List;

// lab2 - 4. za database view
public interface BookViewApplicationService {
    List<DisplayBookViewDto> findAll();
}
