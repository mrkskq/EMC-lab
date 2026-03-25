package mk.ukim.finki.emclab.model.dto;

import mk.ukim.finki.emclab.model.domain.Book;
import mk.ukim.finki.emclab.model.enumeration.BookCategory;
import mk.ukim.finki.emclab.model.enumeration.BookState;

// lab2 - 1. za pagination
public record DisplayBookListDto(
        Long id,
        String name,
        BookCategory category,
        BookState state,
        Integer availableCopies,
        String authorFullName
) {
    public static DisplayBookListDto from(Book book) {
        return new DisplayBookListDto(
                book.getId(),
                book.getName(),
                book.getCategory(),
                book.getState(),
                book.getAvailableCopies(),
                book.getAuthor().getName() + " " + book.getAuthor().getSurname()
        );
    }
}
