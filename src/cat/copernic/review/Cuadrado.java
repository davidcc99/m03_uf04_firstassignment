/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class Cuadrado {
    
    private double lado;

    public Cuadrado(double lado) throws Exception {
        if (lado <= 0) throw new Exception("El lado tiene que ser positivo: " + lado);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    

    // devuelve el area de este cuadrado lado * lado
    public double area() {
        return Math.pow(lado, 2.0); // lado * lado
    }
    
    // devuelve el valor del perimetro de este cuadrado 4 * lado
    public double perimetro() {
        return 4 * lado;
    }
    
    
}