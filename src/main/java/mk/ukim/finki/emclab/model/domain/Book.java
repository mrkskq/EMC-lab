package mk.ukim.finki.emclab.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mk.ukim.finki.emclab.model.enumeration.BookCategory;
import mk.ukim.finki.emclab.model.enumeration.BookState;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "books")
public class Book extends BaseAuditableEntity{
    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BookCategory category;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false)
//    private BookState state;

//    @Column(nullable = false)
//    private Integer availableCopies;

    @OneToMany(mappedBy = "book")
    private List<BookCopy> bookCopies = new ArrayList<>();


    public Book(String name, BookCategory category, Author author) {
        this.name = name;
        this.category = category;
        this.author = author;
    }
}
