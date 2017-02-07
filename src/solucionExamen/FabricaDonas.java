/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionExamen;

/**
 *
 * @author administrador1
 */
public class FabricaDonas {
    private Dona d;
    
    public Dona crearDona(int tipo, String sabor, float precio)
    {
        d = new Dona();
        d.setTipoDona(tipo);
        d.setSabor(sabor);
        d.setPrecio(precio);        
        amasar();
        mezclarIngredientes();
        hornear();
        return d;
    }

    private void amasar() {
        System.out.println("Amasando una dona de " + d.getTipoDona());
    }

    private void mezclarIngredientes() {
        System.out.println("mezclando ingredientes para dona de sabor "+d.getSabor());
    }

    private void hornear() {
        System.out.println("Hornenado la dona");
    }
    
    public Dona [] empaquetar(int n, int tipo, String sabor, float precio)
    {
        Dona [] paquete;
        paquete = new Dona[n];
        
        for (int i = 0; i < n; i++) {
            paquete[i] = crearDona(tipo, sabor, precio);
        }               
        
        System.out.println("El costo total es: $" + (n*precio));
        return paquete;
    }
    
    public static void main(String[] args) {
        FabricaDonas factory;
        factory = new FabricaDonas();
        
        factory.empaquetar(6, 1, "frambuesa",12);
    }            
}
