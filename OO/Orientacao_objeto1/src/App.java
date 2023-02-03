import java.util.Locale;
import java.util.Scanner;

import entities.Program;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Program x = new Program();
               
        Program y = new Program();

        System.out.println("Entre com as medidas de X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Entre com as medidas de Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();
        double areay = y.area();

        System.out.printf("O valor de X : %.4f%n",areax);
        System.out.printf("O valor de Y : %.4f%n",areay);


        if(areax > areay){
            System.out.println("O Valor de X é o maior");
        } else {
            System.out.println("O valor de Y é o maior");
        }
        sc.close();
    }
}
