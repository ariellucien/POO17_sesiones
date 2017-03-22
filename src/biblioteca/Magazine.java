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
public class Magazine extends Item 
{
    public Magazine(String title, String publisher, Date pubDate) 
    {
        this.title = title;
        this.publisher = publisher;
        this.pubDate = pubDate;
    }       
    
    protected int volume;
    
    public void printTitle()
    {
        System.out.println("Título: " + title);
    }
}
