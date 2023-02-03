import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("entre com um numero");
        int entrada = sc.nextInt();
       

        for ( int multiplicador =1; multiplicador <= 10; multiplicador++){
           int  soma = entrada * multiplicador;
            System.out.println(multiplicador + " * " + entrada + " = " + soma);
        }
        sc.close();
    }
}