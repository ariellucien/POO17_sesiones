/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradores;

import java.util.Scanner;

/**
 *
 * @author administrador1
 */
public class Enumeradores {
    private MES mesNacimiento;
    
    public enum MES
    {
        enero,febrero,marzo,abril,mayo,junio,julio,agosto,septiembre,octubre,nomviembre,diciembre
    }
    
    public enum DIA
    {
        lunes, martes, miercoles, jueves, viernes, sabado, domingo
    }
    
    public void seleccionaMesDeNacimiento(MES mes)
    {
        this.mesNacimiento = mes;
    }
    
    public MES getMesNacimiento()
    {
        return this.mesNacimiento;
    }
    
    public static void main(String[] args) {
        Enumeradores e = new Enumeradores();    
        Scanner s = new Scanner(System.in);
        e.seleccionaMesDeNacimiento(MES.enero);
        
        System.out.println("Mi mes de nacimiento es:");
        System.out.println(e.getMesNacimiento());
    }
}
