package com.example.demo.Models;
import javax.persistence.*;
import java.util.*;

@Entity
public class Book {
    @Id
    private long isbn;

    @Column
    private String title;

    @Column
    private String summary;

    @Column
    private Date publishing;


    public long getISBN() { return isbn;}

    public void setISBN(long isbn){
        this.isbn=isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary){
        this.summary=summary;
    }

    public Date getPublishing() {
        return publishing;
    }

    public void setPublishing(Date publishing){
        this.publishing=publishing;
    }

}


