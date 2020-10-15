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
public class Yate extends BarcoDePasajeros {
    private boolean helipuerto;

    public Yate(boolean helipuerto, int camarotes, int pasajeros, Motor motor, double eslora, double manga, int velocidad, int peso) {
        super(camarotes, pasajeros, motor, eslora, manga, velocidad, peso);
        this.helipuerto = helipuerto;
        //this.nombre = "Santa Maria";
    }
    
    @Override
    public void arranca() {
        //Comportamiento común para todos los yates
        System.out.println("Arrancando yate");
    }
    
    @Override
    public void atraca() {
        //Comportamiento común para todos los yates
        System.out.println("Atracando yate");
    }
    
    
}
