package mk.ukim.finki.emclab.jobs;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import mk.ukim.finki.emclab.repository.BookStatsViewRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// lab2 - 6. za schedule event za materialized view
@Component
@Slf4j
public class MaterializedViewRefreshScheduler {

    private final BookStatsViewRepository bookStatsViewRepository;

    public MaterializedViewRefreshScheduler(BookStatsViewRepository bookStatsViewRepository) {
        this.bookStatsViewRepository = bookStatsViewRepository;
    }

    @Scheduled(cron = "0 * * * * *") // na sekoja minuta
    @Transactional
    public void refreshBooksStatsView() {
        log.info("Refreshing BOOKS_STATS_MV...");

        bookStatsViewRepository.refresh();

        log.info("BOOKS_STATS_MV successfully refreshed.");
    }
}