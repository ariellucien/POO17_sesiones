/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author administrador1
 */
public class Test {
    public static void main(String[] args) {
        FiguraG [] arreglo = new FiguraG[2];
        
        Rectangulo r = new Rectangulo(10, 2);
        Circulo c = new Circulo(22.0);
        
        arreglo[0] = r;
        arreglo[1] = c;
        
        for(int i=0; i<2; i++)
        {
            System.out.println("el área es: "+ arreglo[i].getArea());
        }
        
    }
}
