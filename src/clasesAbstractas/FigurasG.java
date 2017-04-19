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
public abstract class FigurasG {
    //No tienen instancias
    // En las clases abstractas puede colocar 
    // atributos normales o constantes
    public static final double PI = 3.1416;
    protected double area;
    
    //clase abstracta puede tener metodos abstractos
    public abstract double getArea();
    
    //clase abstracta tiene métodos normales
    public double getPi()
    {
        return PI;
    }
    
    //clase abstracta con método parcialmente implemenado
    public void quienSoy()
    {
        System.out.println("soy una figura geométrica");
    }
}
