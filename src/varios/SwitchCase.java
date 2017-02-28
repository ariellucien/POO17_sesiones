/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varios;

import java.util.Scanner;

/**
 *
 * @author administrador1
 */
public class SwitchCase {
    public static void main(String[] args) 
    {
        int opcion = 0;
        Scanner s = new Scanner(System.in);
        opcion = s.nextInt();
        
        switch(opcion)
        {
            case 1:
                System.out.println("tecleaste el 1");
                break;
            case 2:
                System.out.println("tecleaste el 2");
                break;
            case 3:
                System.out.println("tecleaste el 3");
                break;
            case 4:
                System.out.println("tecleaste el 4");
                break;
            default:
                System.out.println("Imprimiste otra cosa");
                break;
        }
        
        System.out.println("ya terminamos");
    }    
}
