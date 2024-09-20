package springbootmongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootmongodb.model.Book;
import springbootmongodb.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(String id) {
        return bookRepository.findById(id);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(String id, Book bookDetails) {
        Optional<Book> bookOptional = bookRepository.findById(id);

        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            book.setbookTitle(bookDetails.getbookTitle());
            book.setauthorName(bookDetails.getauthorName());
            book.setIsbn(bookDetails.getIsbn());
            book.setCategory(bookDetails.getCategory());
            book.setPrice(bookDetails.getPrice());
            book.setQuantity(bookDetails.getQuantity());
            book.setDescription(bookDetails.getDescription());
            book.setPublicationYear(bookDetails.getPublicationYear());
            book.setImg(bookDetails.getImg());

            return bookRepository.save(book);
        } else {
            return null;
        }
    }

    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }
}
