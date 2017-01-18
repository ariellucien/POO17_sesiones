/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador1
 */
public class ArregloAlumnos {
    // aquí defino los atributos (fields, class variables)
    private String[]alumnos;
    private int contador;
    
    public void inicializaArreglo(int size)
    {
        alumnos = new String[size];
        contador = 0;
    }
    
    public void agregarNombre(String nombre)
    {
        alumnos[contador] = nombre;
        //contador++
        contador = contador + 1;
    }
    
    public void imprimirArreglo()
    {
        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre " + (i+1) + alumnos[i]);
        }        
    }
    
    public static void main(String[] args) {
        //declaro una variable de tipo clase ArregloAlumnos
        ArregloAlumnos alumnosUdla;
        //reservo espacio para la instancia
        alumnosUdla = new ArregloAlumnos();        
        alumnosUdla.inicializaArreglo(10);
        alumnosUdla.agregarNombre("Pedrito");
        alumnosUdla.agregarNombre("Rodrigo");
        alumnosUdla.agregarNombre("Roberto");
        alumnosUdla.imprimirArreglo();
    }
}
