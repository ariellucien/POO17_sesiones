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
public class Persona {
    protected String name;
    protected String apellido;
    protected int horasTrabajadas;

    public Persona(String name, String apellido, int horasTrabajadas) {
        this.name = name;
        this.apellido = apellido;
        this.horasTrabajadas = horasTrabajadas;
    }        
    
    public void print()
    {
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + apellido);
        System.out.println("Horas trabajadas: "+ horasTrabajadas);
    }
}
