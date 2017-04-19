/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import com.sun.corba.se.impl.io.TypeMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author administrador1
 */
public class BasicException {
    public static void main(String[] args) {        
        int numero=0;
        int [] arreglo = new int[]{1,2,3,4,5};                
        while(true)
        {
            try
            {                
                System.out.println("Escribe un número del 1 al 10");        
                Scanner s = new Scanner(System.in);
                numero = s.nextInt();                
                System.out.println("posicion 5" +  arreglo[5]);
                
                break;
            }
            catch(TypeMismatchException e)
            {
                System.out.println("valor introducido incorrecto");
                System.out.println("vuelve a intentarlo");                
            }
            catch(InputMismatchException e)
            {
                System.out.println("excepción atrapada");
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println("estas fuera de los índices del arreglo");
                System.out.println(e.toString());
            }
            finally
            {
                System.out.println("Este es el final");
            }
        }        
    }
}
