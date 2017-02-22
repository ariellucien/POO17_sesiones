/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author administrador1
 */
public class MarcaTexto {
    private String color;
    private char size;

    public void setSize(char size) {
        this.size = size;
    }

    public char getSize() {
        return size;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public MarcaTexto() 
    {
        color = "negro";
        size = 's';
    }

    public MarcaTexto(String color) {
        this.color = color;
        size = 's';
    }
    
    public MarcaTexto(String color, char size) {
        this.color = color;
        this.size = size;
    }
    
    public static void main(String[] args) {
        MarcaTexto m1;
        m1 = new MarcaTexto("Verde");        
        System.out.println(m1.getColor());
        
        MarcaTexto m2;
        m2 = new MarcaTexto();
        System.out.println(m2.getColor());
        m2.setColor("amarillo");
        System.out.println(m2.getColor());
        m2.setSize('L');                        
    }
}
