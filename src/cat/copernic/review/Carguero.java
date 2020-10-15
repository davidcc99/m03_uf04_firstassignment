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
public class Carguero extends BarcoDeMercancias {
    private int numeroPaquetes;

    public Carguero(int numeroPaquetes, int numeroCarga, Motor motor, double eslora, double manga, int velocidad, int peso) {
        super(numeroCarga, motor, eslora, manga, velocidad, peso);
        this.numeroPaquetes = numeroPaquetes;
    }
    
    
    
}
