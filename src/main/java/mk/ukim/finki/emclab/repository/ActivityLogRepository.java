package mk.ukim.finki.emclab.repository;

import mk.ukim.finki.emclab.model.domain.ActivityLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// lab2 - 9. evidencija na aktivnosti
public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {
    Page<ActivityLog> findAll(Pageable pageable);
}
