/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author administrador1
 */
public class Fresa implements Comparable<Fresa>
{

    @Override
    public int compareTo(Fresa o) {
        if(frescuraDeLaFruta.ordinal() > o.frescuraDeLaFruta.ordinal())
        {
            return 1;
        }
        else
        {
            if(frescuraDeLaFruta.ordinal() < o.frescuraDeLaFruta.ordinal())
            {
                return -1;
            }
            else
                return 0;
        }
    }
    public enum Frescura{VERDE, ALPUNTO, MADURA};
    
    protected Frescura frescuraDeLaFruta;

    public Frescura getFrescuraDeLaFruta() {
        return frescuraDeLaFruta;
    }

    public void setFrescuraDeLaFruta(Frescura frescuraDeLaFruta) {
        this.frescuraDeLaFruta = frescuraDeLaFruta;
    }
}
