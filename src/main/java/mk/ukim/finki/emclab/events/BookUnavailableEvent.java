package mk.ukim.finki.emclab.events;

import mk.ukim.finki.emclab.model.domain.Book;

// lab2 - 8. za listener za nedostapni knigi
public record BookUnavailableEvent(Book book, String rentedBy) {
}
