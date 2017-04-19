/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author administrador1
 */
public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(12.0, 3.0);   
        t.quienSoy();
        System.out.println("el área es: " +  t.getArea());
        
        System.out.println("PI es " + FigurasG.PI);
        
    }
}
