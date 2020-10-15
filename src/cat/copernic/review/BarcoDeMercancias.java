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
public abstract class BarcoDeMercancias extends Barco {
    private int numeroCarga;

    public BarcoDeMercancias(int numeroCarga, Motor motor, double eslora, double manga, int velocidad, int peso) {
        super(motor, eslora, manga, velocidad, peso);
        this.numeroCarga = numeroCarga;
    }
    
    @Override
    public void arranca() {
        //Comportamiento común para todos los barcos de mercancias
        System.out.println("Arrancando barco de mercancias");
    }
    
    @Override
    public void atraca() {
        //Comportamiento común para todos los barcos de mercancias
        System.out.println("Atracando barco de mercancias");
    }
    
    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonan el barco intentando salvar la carga que puedan");
    }
    @Override
    public void comportamiento() {
        System.out.println("Algunos defienden la carga y otros huyen");
    }
}
