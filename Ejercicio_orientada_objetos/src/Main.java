import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       Calentador lin = new Calentador(5,15);
//        Scanner in = new Scanner(System.in);
//        System.out.println("temperatura maxima");
//        lin.setMaximo(in.nextInt());
//
//        System.out.println("temperatura minima");
//        lin.setMinimo(in.nextInt());
//
//        System.out.println("que incremento");
//        lin.setCremento(in.nextInt());
//
//
//        lin.calentar();
//        lin.calentar();
//        System.out.println(lin.getTemperatura());
//        lin.enfriar();
//        lin.enfriar();
//        lin.enfriar();
//        lin.enfriar();
//        System.out.println(lin.getTemperatura());
//


        ConversorTemperatura lin1 = new ConversorTemperatura(50);

     System.out.println(lin1.toCentigradeDegrees());
     System.out.println(lin1.toFahrenheitDegrees());



    }
}