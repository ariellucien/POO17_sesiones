/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;

/**
 *
 * @author administrador1
 */
class ZeroDivision extends RuntimeException{    

    @Override
    public String getMessage() {
        return "No se hay divisiones entre cero"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
