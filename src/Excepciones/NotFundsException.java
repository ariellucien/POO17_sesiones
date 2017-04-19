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
public class NotFundsException extends RuntimeException {    
    @Override
    public String getMessage() {
        return "no tienes dinero";
    }    

    @Override
    public String toString() {
        return "te quedaste sin dinero";
    }
}
