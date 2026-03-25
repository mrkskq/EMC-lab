package mk.ukim.finki.emclab.web.controller;

import mk.ukim.finki.emclab.model.dto.DisplayBookStatsViewDto;
import mk.ukim.finki.emclab.service.application.BookStatsViewApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books-stats-view")
public class BookStatsViewController {

    private final BookStatsViewApplicationService bookStatsViewApplicationService;

    public BookStatsViewController(BookStatsViewApplicationService bookStatsViewApplicationService) {
        this.bookStatsViewApplicationService = bookStatsViewApplicationService;
    }

    // lab2 - 5. za materialized view
    @GetMapping("/")
    public ResponseEntity<List<DisplayBookStatsViewDto>> findAll(){
        return ResponseEntity.ok(bookStatsViewApplicationService.findAllStats());
    }
}