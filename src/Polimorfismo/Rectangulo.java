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
public class Rectangulo implements FiguraG {
    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }        
    
    @Override
    public double getArea() 
    {
        return base*altura;
    }
    
}
