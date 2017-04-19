/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author administrador1
 */
public class DetenerElTiempo {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
            System.out.println("terminé ");
        } catch (InterruptedException ex) {
            Logger.getLogger(DetenerElTiempo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
