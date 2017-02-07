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
public class FabricaCompus {
    Computadora c;
    
    public void ensamblarHardware()
    {
        System.out.println("Estoy ensamblando el Hardware:");
        System.out.println("RAM: " + c.getCapacidadRAM());
        System.out.println("HHD: " + c.getCapacidadDisco());
        System.out.println("Procesador: " + c.getVelProcesadorGhz());
    }
    
    public void instalarSoftware()
    {
        System.out.println("Instalando Sistema operativo Windows");
    }
    
    public void configurar()
    {
        System.out.println("Configurando Windows");
    }
    
    public void embalar()
    {
        System.out.println("Empaquetando computadora");        
    }
    
    public Computadora crearComputadora(int capDisco, int capRAM, float velProc)
    {
        c = new Computadora();
        c.setCapacidadDisco(capDisco);
        c.setCapacidadRAM(capRAM);
        c.setVelProcesadorGhz(velProc);
        ensamblarHardware();
        instalarSoftware();
        configurar();
        embalar();
        System.out.println("La computadora está lista para ser entregada");
        return c;
    }
    
    public static void main(String[] args) {
        FabricaCompus f;
        f = new FabricaCompus();
        
        Computadora miCompu = f.crearComputadora(1000, 16, 2.9f);
    }
    
}
