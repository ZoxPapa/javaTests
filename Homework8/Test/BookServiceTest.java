import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.fourth.book.Book;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class BookServiceTest {
    BookRepository bookRepository;
    BookService bookService;
    Book testBook;
    @BeforeEach
    void mockPreparing(){
        this.bookRepository = mock(BookRepository.class);
        this.bookService = new BookService(bookRepository);
        this.testBook = new Book("123", "TestBookname", "TestAuthor");
    }
    @Test
    void findBookByIdTest(){
        when(bookRepository.findById("123")).thenReturn(testBook);
        Book resultBook = bookService.findBookById("123");

        Assertions.assertEquals(testBook, resultBook);
        verify(bookRepository, times(1)).findById("123");
    }
    @Test
    void findAllBooksTest(){
        List<Book> books = new ArrayList<>();
        books.add(testBook);
        books.add(testBook);
        books.add(testBook);
        when(bookRepository.findAll()).thenReturn(books);
        List<Book> resultBooksList = bookService.findAllBooks();

        verify(bookRepository, times(1)).findAll();
        Assertions.assertEquals(books, resultBooksList);
    }

}
