package mk.ukim.finki.emclab.model.dto;

import mk.ukim.finki.emclab.model.domain.BookCopy;
import mk.ukim.finki.emclab.model.enumeration.BookState;

import java.util.List;

public record DisplayBookCopyDto(
        Long id,
        Long bookId,
        String bookName,
        BookState state,
        Boolean available
) {
    public static DisplayBookCopyDto from(BookCopy bookCopy) {
        return new DisplayBookCopyDto(
                bookCopy.getId(),
                bookCopy.getBook().getId(),
                bookCopy.getBook().getName(),
                bookCopy.getState(),
                bookCopy.getAvailable()
        );
    }

    public static List<DisplayBookCopyDto> from(List<BookCopy> bookCopies) {
        return bookCopies.stream()
                .map(DisplayBookCopyDto::from)
                .toList();
    }
}

