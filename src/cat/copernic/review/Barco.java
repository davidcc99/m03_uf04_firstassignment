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
public abstract class Barco implements EnCasoDeIncendioInterface,EnCasoDeAbordajeInterface {
    
    //Protected visible para las subclases    Public visible en todas las clases
    //protected String nombre = "Sin nombre";
    
    //Composición: Utilizamos una clase en otra
    //Private no visible fuera de la clase
    private Motor motor;
    private double eslora;
    private double manga;
    private int velocidad;
    private int peso;

    public Barco(Motor motor, double eslora, double manga, int velocidad, int peso) {
        this.motor = motor;
        this.eslora = eslora;
        this.manga = manga;
        this.velocidad = velocidad;
        this.peso = peso;
    }

    public Motor getMotor() {
        return motor;
    }

    public double getEslora() {
        return eslora;
    }

    public double getManga() {
        return manga;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Barco{" + "motor=" + motor + ", eslora=" + eslora + ", manga=" + manga + ", velocidad=" + velocidad + ", peso=" + peso + '}';
    }
    
    abstract void arranca();
    
    abstract void atraca();
    
}
