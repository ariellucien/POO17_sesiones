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
public class AlmacenDonas {
    private Dona [] almacen;
    private FabricaDonas fabrica;
    private int numeroDonasGuardadas;

    public Dona[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Dona[] almacen) {
        this.almacen = almacen;
    }
    
    public void surtir(int n, int tipo, String sabor, float precio)
    {
        for (int i = 0; i < n; i++) 
        {
            almacen[numeroDonasGuardadas] = fabrica.crearDona(tipo, sabor, precio);
            numeroDonasGuardadas++;
        }
    }
    
    public int cuantasDonasHay()
    {
        System.out.println("Hay almancenadas " + numeroDonasGuardadas);
        return numeroDonasGuardadas;
    }
    
    public void incializaAlmacen()
    {        
        almacen = new Dona[5000];
        fabrica = new FabricaDonas();
        numeroDonasGuardadas = 0;
    }        
    
    public static void main(String[] args) {
        AlmacenDonas store;
        store = new AlmacenDonas();
        
        store.incializaAlmacen();
        
        store.surtir(15, 1, "fresa", 14);
        store.surtir(10, 2, "cajeta", 12);
        store.surtir(5, 3, "frambuesa", 12);
 
        store.cuantasDonasHay();
        
        for (int i = 0; i < store.cuantasDonasHay(); i++) {
            store.getAlmacen()[i].printDona();
        }
    }
}
