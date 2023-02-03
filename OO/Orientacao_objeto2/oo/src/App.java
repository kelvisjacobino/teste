import java.util.Locale;
import java.util.Scanner;


import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product produto = new Product();

        System.out.println("Entre com os dados do produto");
        System.out.print("Entre com o nome do produto: ");
        produto.name = sc.nextLine();
        System.out.print("Entre com o Preço do produto: ");
        produto.price = sc.nextDouble();
        System.out.print("Entre com a quantidade no estoque: ");
        produto.quantity = sc.nextInt();

        System.out.print(produto.toString());

           
        sc.close();
    }
}
