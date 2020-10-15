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
public class Destructor extends BarcoDeGuerra {
    private int torpedos;

    public Destructor(int torpedos, int cañones, Motor motor, double eslora, double manga, int velocidad, int peso) {
        super(cañones, motor, eslora, manga, velocidad, peso);
        this.torpedos = torpedos;
    }
    
    
    
}
