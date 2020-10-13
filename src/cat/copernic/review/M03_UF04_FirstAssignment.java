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
     */
    public static void main(String[] args) {
        // Prueba to código aquí
        CuentaCorriente cc1 = new CuentaCorriente("Pedro", 1_000.0);
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
        }
    }
    
}
