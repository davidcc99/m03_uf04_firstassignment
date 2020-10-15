/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author david
 */
public class PortaAviones extends BarcoDeGuerra {
    private int Aviones;

    public PortaAviones(int Aviones, int cañones, Motor motor, double eslora, double manga, int velocidad, int peso) {
        super(cañones, motor, eslora, manga, velocidad, peso);
        this.Aviones = Aviones;
    }
    
    
    
}
