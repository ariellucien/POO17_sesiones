/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;
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
    
    public int max(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    public int min(int a, int b)
    {
        if(a < b)
        {
            return a;        
        }
        else
        {
            return b;
        }
    }
    
    public int valorAbsoluto(int numero)
    {
        if(numero < 0)
        {
            return (numero*-1);
        }
        else
        {
            return numero;
        }
    }
    
    public double potencia(double num, double pot)
    {
        return Math.pow(num, pot);
    }
    
    public double raizCuadrada(double num)
    {
        return Math.sqrt(num);
    }
    
    public static void main(String[] args) 
    {
        //Definir la variable de instancia
        Numeros nombreInstancia;
        //reservar espacio para la instancia
        nombreInstancia = new Numeros();
                
        // definir y reservar espacio para un double
        double temporal;
        
        //ejecutar método de una instancia y asignar el resultado
        temporal = nombreInstancia.raizCuadrada(92);
        
        //imprimir resultado
        System.out.println("el resultado es: " + temporal);
        
        // ------------------------------------------
        double temp = nombreInstancia.potencia(8, 22);
        System.out.println("el res de la pot es: " + temp);
        
        
        //Crear instancia de una clase
        //Numeros miInstancia = new Numeros();
        /*
        Numeros miInstancia;
        miInstancia = new Numeros();
        
        //ejecutar un método de clase a través de instancia
        miInstancia.reservaPrimeList(1000);
        miInstancia.reservarPerfectNaturalList(3000);
        
        miInstancia.llenarPrimeList();
        */                        
    }    
}
