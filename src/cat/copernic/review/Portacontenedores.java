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
public class Portacontenedores extends BarcoDeMercancias{
    private int numeroContenedores;

    public Portacontenedores(int numeroContenedores, int numeroCarga, Motor motor, double eslora, double manga, int velocidad, int peso) {
        super(numeroCarga, motor, eslora, manga, velocidad, peso);
        this.numeroContenedores = numeroContenedores;
    }
    @Override
    public void arranca() {
        //Comportamiento común para todos los barcos de mercancias
        System.out.println("Arrancando Portacontenedores");
    }
    
    @Override
    public void atraca() {
        //Comportamiento común para todos los barcos de mercancias
        System.out.println("Atracando Portacontenedores");
    }
    
    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonan el barco intentando salvar los contenedores que pueden");
    }
}
