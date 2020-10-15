/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author david
 * 
 */

public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        //if (base <= 0 || altura <= 0) throw new ParametroNoPositivoException("La base o altura deben ser positivas");
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        //también se puede poner aquí excepción
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    public void area()throws Exception{
        if (base <= 0 || altura <= 0) throw new ParametroNoPositivoException("La base o altura deben ser positivas");
        double area = base*altura/2;
        System.out.println("El area es de " + area);
        //return base*altura/2;
    }
    public void perimetro() throws Exception{
        if (base <= 0 || altura <= 0) throw new ParametroNoPositivoException("La base o altura deben ser positivas");
        double hipotenusa = Math.sqrt((base/2*base/2)+(altura*altura));
        double perimetro = (hipotenusa*2)+base;
        System.out.println("El perimetro es de " + perimetro);
    }
    
    public static void main(String[] args){
        try {
            Triangulo tring = new Triangulo(10,15);
            tring.area();
            tring.perimetro();
            System.out.println(tring);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
