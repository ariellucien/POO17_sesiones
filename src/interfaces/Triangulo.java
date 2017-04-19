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
public class Triangulo implements FigurasG
{
    protected double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void quienSoy() {
        System.out.println("hola, soy un triángulo");
    }

    @Override
    public double getArea() {        
        return (base*altura)/2;
    }   
}
