package mk.ukim.finki.emclab.events;

import mk.ukim.finki.emclab.model.domain.Book;

// lab2 - 7. za event handling pri iznajmuvanje kniga
public record BookRentedEvent(Book book, String rentedBy) {
}
