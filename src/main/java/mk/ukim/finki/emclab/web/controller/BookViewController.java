package mk.ukim.finki.emclab.web.controller;

import mk.ukim.finki.emclab.model.dto.DisplayBookViewDto;
import mk.ukim.finki.emclab.service.application.BookViewApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books-view")
public class BookViewController {

    private final BookViewApplicationService bookViewApplicationService;

    public BookViewController(BookViewApplicationService bookViewApplicationService) {
        this.bookViewApplicationService = bookViewApplicationService;
    }

    // lab2 - 4. za database view
    @GetMapping("/")
    public ResponseEntity<List<DisplayBookViewDto>> findAll(){
        return ResponseEntity.ok(bookViewApplicationService.findAll());
    }
}

