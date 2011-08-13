package com.dm.lab.ebook.db.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Daniel Mroczka daniel.mroczka@gmail.com
 * Created: 2011-08-13 20:49:35
 * 
 */
@Entity
public class Book {
    @Id
    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
