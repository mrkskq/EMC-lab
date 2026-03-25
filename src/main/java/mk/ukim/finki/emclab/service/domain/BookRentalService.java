package mk.ukim.finki.emclab.service.domain;

// lab2 - 7. za event handling pri iznajmuvanje kniga
public interface BookRentalService {
    void rentBook(Long bookId, String rentedBy);
}
