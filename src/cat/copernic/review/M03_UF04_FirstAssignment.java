/*
 * FIRST ASSIGNMENT
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class M03_UF04_FirstAssignment {

    /**
     * @param args the command line arguments
     * Crear nueva subclase de barco llamada barcoDeMercancias y crea una nueva subclase o mas de barcoDeMercancias llamada Carguero...
     */
    public static void main(String[] args) {
        
        Barco barcoYate = new Yate(true, 4, 6, new Motor(240), 20.0, 12.5, 23, 7);
        barcoYate.arranca();
        Barco barcoAcorazado = new Acorazado(20, 12, new Motor(1000), 200.4, 76.7, 8, 2000);
        barcoAcorazado.arranca();
        Barco barcoPortacontenedores = new Portacontenedores(600, 1800, new Motor(800), 150.5, 56, 6, 1900);
        barcoPortacontenedores.arranca();
        System.out.println(barcoPortacontenedores instanceof Portacontenedores);
        
        // Prueba to código aquí
        /*CuentaCorriente cc1 = new CuentaCorriente("Pedro", 1_000.0);
        System.out.println(cc1);
        try {
        cc1.ingresa(123.09);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(cc1);
        try {
        cc1.abona(98.87);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(cc1);
        try {
        Cuadrado c1 = new Cuadrado(9);
        System.out.println(c1.area());
        System.out.println(c1.perimetro());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }*/
    }
    
}
