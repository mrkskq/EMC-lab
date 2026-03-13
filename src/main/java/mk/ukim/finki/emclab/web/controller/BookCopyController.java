package mk.ukim.finki.emclab.web.controller;

import mk.ukim.finki.emclab.model.dto.DisplayBookCopyDto;
import mk.ukim.finki.emclab.service.application.BookCopyApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book-copies")
public class BookCopyController {

    private final BookCopyApplicationService bookCopyApplicationService;

    public BookCopyController(BookCopyApplicationService bookCopyApplicationService) {
        this.bookCopyApplicationService = bookCopyApplicationService;
    }

    @GetMapping
    public ResponseEntity<List<DisplayBookCopyDto>> findAll(){
        return ResponseEntity.ok(bookCopyApplicationService.findAll());
    }

    @PostMapping("/{bookId}/borrow")
    public ResponseEntity<DisplayBookCopyDto> borrow(@PathVariable Long bookId) {
        DisplayBookCopyDto bookCopyDto = bookCopyApplicationService.borrowCopy(bookId);
        return ResponseEntity.ok(bookCopyDto);
    }

    @PostMapping("/{copyId}/return")
    public ResponseEntity<Void> returnCopy(@PathVariable Long copyId) {
        bookCopyApplicationService.returnCopy(copyId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{bookId}/available")
    public ResponseEntity<Integer> availableCopies(@PathVariable Long bookId) {
        int count = bookCopyApplicationService.availableCopies(bookId);
        return ResponseEntity.ok(count);
    }
}
