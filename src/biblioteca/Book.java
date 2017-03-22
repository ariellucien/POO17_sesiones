/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import varios.Date;

/**
 *
 * @author administrador1
 */
public class Book extends Item
{
    private String ISBN;
    private String autor;    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setEditorial(String publisher) {
        this.publisher = publisher;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setFechaPublicacion(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Book(String title, String ISBN, String autor) {
        this.title = title;
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public Book(String title, String ISBN, String autor, String editorial, Date fechaPublicacion) {
        this.title = title;
        this.ISBN = ISBN;
        this.autor = autor;
        this.publisher = publisher;
        this.pubDate = pubDate;
    }
}
