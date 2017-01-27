package spp.jposadasa.a03.p1;
import java.util.Scanner;

public class SPPJPosadasAA03P1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner (System.in);
        int dec;
        double ca, co, h, ang, rad;
        
        System.out.println("Bienvenido a la calduladora del cateto opuesto o cateto adyacente");
        System.out.println("Porfavor introduzca los datos necesarios");
        System.out.println("Hipotenusa");
        h=kb.nextDouble();
        System.out.println("Angulo");
        ang=kb.nextDouble();
        System.out.println("1. Calculo de Cateto Opuesto");
        System.out.println("2. Calculo de Cateto Adyacente"); 
        dec = kb.nextInt();
         switch (dec){
            case 1:
                rad=ang*Math.PI/180;
                System.out.println("Calculo de Cateto Opuesto");
                co=h*(Math.sin(rad));
                System.out.println("Cateto opuesto: " + co);
                break;
            case 2:
                rad=ang*Math.PI/180;
                System.out.println("Calculo de Cateto Adyacente");
                ca=h*(Math.cos(rad));
                System.out.println("Cateto adyacente:" + ca);
                break;
        }
    }
}