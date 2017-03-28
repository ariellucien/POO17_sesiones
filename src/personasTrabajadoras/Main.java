/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personasTrabajadoras;

/**
 *
 * @author administrador1
 */
public class Main {
    public static void main(String[] args) {
        Titular t = new Titular("ariel", "garcia", 3);
        t.print();
     
        VoluntarioExterno v = new VoluntarioExterno("José", "Garza", 10);
        v.print();
    }
}
