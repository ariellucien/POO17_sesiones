/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author administrador1
 */
public class Library {
    protected Item [] books;
    protected int countBooks;
    protected int maxBooks;

    public Library() 
    {
        maxBooks = 100;
        books = new Item[maxBooks];
        countBooks = 0;        
    }
    
    public void addItem(Item book)
    {
        if(countBooks < maxBooks)
        {
            books[countBooks] = book;
            countBooks++;  
        }
        else
        {
            System.out.println("No hay espacio en la libreria");
        }
    }
    
    public int getBookCount()
    {
        return countBooks;
    }
}
