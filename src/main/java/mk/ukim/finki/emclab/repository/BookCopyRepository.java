package mk.ukim.finki.emclab.repository;

import mk.ukim.finki.emclab.model.domain.BookCopy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookCopyRepository extends JpaRepository<BookCopy, Long> {

    Optional<BookCopy> findFirstByBookIdAndAvailableTrue(Long bookId);

    int countByBookIdAndAvailableTrue(Long bookId);

}
