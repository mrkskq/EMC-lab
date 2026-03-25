package mk.ukim.finki.emclab.model.projection;

// lab2 - 2. za projections

/*
projection за краток приказ на книга, кој ќе содржи:
id
name
category
state
availableCopies
 */

import mk.ukim.finki.emclab.model.enumeration.BookCategory;
import mk.ukim.finki.emclab.model.enumeration.BookState;

public interface BookShortProjection {
    Long getId();
    String getName();
    BookCategory getCategory();
    BookState getState();
    Integer getAvailableCopies();
}
