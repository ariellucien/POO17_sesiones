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
public class Circulo implements FiguraG
{
    protected double radio;
    
    public Circulo(double radio)
    {
        this.radio = radio;
    }
    
    @Override
    public double getArea() 
    {
        return pi*radio*radio;
    }

}
