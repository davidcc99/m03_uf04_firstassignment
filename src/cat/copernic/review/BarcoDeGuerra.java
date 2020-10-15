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
public abstract class BarcoDeGuerra extends Barco {
    private int cañones;

    public BarcoDeGuerra(int cañones, Motor motor, double eslora, double manga, int velocidad, int peso) {
        super(motor, eslora, manga, velocidad, peso);
        this.cañones = cañones;
    }
    
    @Override
    public void arranca() {
        //Comportamiento común para todos los barcos de guerra
        System.out.println("Arrancando barco de guerra");
    }
    
    @Override
    public void atraca() {
        //Comportamiento común para todos los barcos de guerra
        System.out.println("Atracando barco de guerra");
    }

    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonan el barco ordenadamente");
    }
    @Override
    public void comportamiento() {
        System.out.println("Se lian a cañonazos");
    }
    
    
}
