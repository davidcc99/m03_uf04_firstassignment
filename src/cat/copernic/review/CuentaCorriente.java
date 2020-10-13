/*
 * La clase CuentaCorriente representa una cuenta corriente bancaria.
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class CuentaCorriente {

    // Propiedades
    private String titular;
    private double saldo;
    
    
    // Constructor
    public CuentaCorriente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        
    }
    
    // Getters/Setters

    //La propiedad saldo es de solo lectura
    public double getSaldo() {
        return saldo;
    }
    
    
    // Métodos heredados de la clase Object
    @Override    
    public String toString() {
        return "CuentaCorriente{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }

    // Métodos adicionales
    
    /* El método ingresa acumula ingreso en saldo siempre que ingreso sea positivo y cualquier otro caso lance excepecion */
    public void ingresa(double ingreso) throws Exception {
        if (ingreso <= 0) throw new Exception("Ingreso no puede ser negativo");
        saldo += ingreso;
    }
    
    /* El método abona resta abono de saldo siempre y cuando abono sea menor que saldo y que lance una excepción en cualquier otro caso */ 
    public void abona(double abono) throws Exception {
        if (saldo < abono) throw new Exception("Saldo no puede ser negativo");
        saldo -= abono;
    }
}
