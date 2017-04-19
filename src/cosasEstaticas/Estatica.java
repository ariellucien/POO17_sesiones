/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosasEstaticas;

/**
 *
 * @author administrador1
 */
public class Estatica {
    public int entero;
    public static double value;
    
    public int getEntero()
    {
        System.out.println(Estatica.value);
        return entero;
    }
    public static double getValue()
    {           
        return value;
    }
    
    public static void main(String[] args) {        
        Estatica.value = 22.0;
        System.out.println("el valor es" + Estatica.getValue());
    }
}
