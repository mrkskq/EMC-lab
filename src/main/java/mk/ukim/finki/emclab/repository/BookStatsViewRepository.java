package mk.ukim.finki.emclab.repository;

import mk.ukim.finki.emclab.model.views.BookStatsView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStatsViewRepository extends JpaRepository<BookStatsView, Long> {
    // lab2 - 6. za schedule event za materialized view
    @Modifying
    @Query(value = "refresh materialized view books_stats_mv", nativeQuery = true)
    void refresh();
}
