/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesAbstractas;

/**
 *
 * @author administrador1
 */
public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(3.0, 2.0);
        
        t.quienSoy();
        
        System.out.println(t.getArea());
        
        System.out.println(FigurasG.PI);
    }
}
