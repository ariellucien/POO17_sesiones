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
public class Triangulo extends FigurasG{
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
                
    @Override
    public double getArea() {
        return (base*altura)/2;
    }
    
    @Override
    public void quienSoy()
    {
        super.quienSoy();
        System.out.println("específicamente soy un triángulo");
    }
    
}
