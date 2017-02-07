/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiones;

/**
 *
 * @author administrador1
 */
public class Computadora {
    private int capacidadDisco;
    private int capacidadRAM;
    private float velProcesadorGhz;

    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    public void setCapacidadRAM(int capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }

    public void setVelProcesadorGhz(float velProcesadorGhz) {
        this.velProcesadorGhz = velProcesadorGhz;
    }

    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    public int getCapacidadRAM() {
        return capacidadRAM;
    }

    public float getVelProcesadorGhz() {
        return velProcesadorGhz;
    }     
}
