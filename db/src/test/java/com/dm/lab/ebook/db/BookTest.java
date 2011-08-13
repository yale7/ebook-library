package com.dm.lab.ebook.db;

import com.dm.lab.ebook.db.model.Book;
import com.dm.lab.ebook.db.repository.BookRepository;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Mroczka
 * Created: 2011-08-13 21:19:42
 * 
 */
@ContextConfiguration("classpath:application-context.xml")
public class BookTest {

    @Autowired
    BookRepository bookRepository;
    
    @Test
    public void findsCustomersAccounts() throws Exception {

        List<Book> list = bookRepository.listAllBooks();
        

        assertFalse(false);
    }
}
