package mk.ukim.finki.emclab.model.projection;

// lab2 - 2. za projections

/*
projection за проширен приказ на книга, кој ќе содржи:
id
name
category
state
availableCopies
име и презиме на авторот
држава на авторот
 */

import mk.ukim.finki.emclab.model.domain.Country;
import mk.ukim.finki.emclab.model.enumeration.BookCategory;
import mk.ukim.finki.emclab.model.enumeration.BookState;

public interface BookDetailedProjection {
    Long getId();
    String getName();
    BookCategory getCategory();
    BookState getState();
    Integer getAvailableCopies();

    String getAuthorName();
    String getAuthorSurname();
    Country getAuthorCountry();
}
