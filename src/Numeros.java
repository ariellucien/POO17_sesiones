/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador1
 */
public class Numeros {
    //atributos
    private int[] primeList;
    private int[] perfectNaturalList;
    
    //métodos
    public int[] getNPrimes(int num)
    {
        return null;
    }
    
    public int getPrimeN(int n)
    {
        return 0;
    }
    
    public void reservaPrimeList(int num)
    {
        //reservar espacio para un arreglo
        primeList = new int[num];
    }
    
    public void reservarPerfectNaturalList(int num)
    {
        //reservar espacio para un arreglo
        perfectNaturalList = new int[num];
    }
    
    public void llenarPrimeList()
    {
        System.out.println("el tamaño de primeList es "+ primeList.length);
    }
    
    public static void main(String[] args) {
        //Crear instancia de una clase
        //Numeros miInstancia = new Numeros();
        Numeros miInstancia;
        miInstancia = new Numeros();
        
        //ejecutar un método de clase a través de instancia
        miInstancia.reservaPrimeList(1000);
        miInstancia.reservarPerfectNaturalList(3000);
        
        miInstancia.llenarPrimeList();
    }    
}
