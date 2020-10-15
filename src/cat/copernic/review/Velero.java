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
public class Velero extends BarcoDePasajeros {
    private int velas;

    public Velero(int velas, int camarotes, int pasajeros, Motor motor, double eslora, double manga, int velocidad, int peso) {
        super(camarotes, pasajeros, motor, eslora, manga, velocidad, peso);
        this.velas = velas;
    }
    
    @Override
    public void abandonenElBarco() {
        System.out.println("Abandono el barco con clase");
    }
    
}
