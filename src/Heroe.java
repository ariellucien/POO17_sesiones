/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador1
 */
public class Heroe {
    private String nombre;
    private int [] listaVidas;
    private String [] listaAmigos;
    private String [] listaEnemigos;
    
    public void salvarPrincesa()
    {
        System.out.println("Salvando a la princesa");
        atacarVillano(10);
        System.out.println("ya salvé a la princesa");
    }
    
    public void atacarVillano(int fuerza)
    {
        System.out.println("atacando villano");
        System.out.println("usando una fuerza de " + fuerza);
    }
    
    //Crear un main
    //dentro del main crear instancia de Héroe
    //ejecutar el método salvar princesa
    public static void main(String[] args) {
        Heroe miHeroe;
        miHeroe = new Heroe();        
        miHeroe.salvarPrincesa();
        
    }
}
