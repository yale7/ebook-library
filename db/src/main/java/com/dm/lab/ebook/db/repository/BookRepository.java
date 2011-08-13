/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dm.lab.ebook.db.repository;

import com.dm.lab.ebook.db.model.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author daniel
 */
//@Transactional(readOnly = true)
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query("from Book b")
    List<Book> listAllBooks();
}
