package mk.ukim.finki.emclab.service.application;

import mk.ukim.finki.emclab.model.dto.DisplayBookStatsViewDto;

import java.util.List;

// lab2 - 5. za materialized view
public interface BookStatsViewApplicationService {
    List<DisplayBookStatsViewDto> findAllStats();
}
