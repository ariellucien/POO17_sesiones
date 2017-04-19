/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author administrador1
 */
public class ThrowsNotFundsException {
    public void retirarDinero() throws NotFundsException
    {
        System.out.println("hola"); 
        throw new NotFundsException();
    }
    public static void main(String[] args) {
        ThrowsNotFundsException t = new ThrowsNotFundsException();
        try
        {
            t.retirarDinero();
        }
        catch(NotFundsException e)
        {
            System.out.println(e.toString());
        }
   }
}
