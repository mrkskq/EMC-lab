package mk.ukim.finki.emclab.repository;

import mk.ukim.finki.emclab.model.views.BookView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// lab2 - 4. za database view
@Repository
public interface BookViewRepository extends JpaRepository<BookView, Long> {
}
