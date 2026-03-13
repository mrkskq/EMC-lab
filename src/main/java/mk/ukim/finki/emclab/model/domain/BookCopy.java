package mk.ukim.finki.emclab.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mk.ukim.finki.emclab.model.enumeration.BookState;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "book_copies")
public class BookCopy extends BaseAuditableEntity{
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BookState state;

    @Column(nullable = false)
    private Boolean available;

    public BookCopy(Book book, BookState state) {
        this.book = book;
        this.state = state;
        this.available = true;
    }
}

