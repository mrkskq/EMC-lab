package mk.ukim.finki.emclab.model.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

// lab2 - 5. za materialized view
@Entity
@Getter
@Immutable
@Table(name = "books_stats_mv")
public class BookStatsView {
    @Id
    private String category; // ne BookCategory category, deka vo Book imame Enum.TYPE=String

    private Long totalBooks;

    private Long totalAvailableCopies;

    private Long notGoodConditionBooks;
}
