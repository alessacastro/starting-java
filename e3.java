import java.util.Scanner;

public class e3 
{
    public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Insira o nome do vendedor ");
    String vendedor = sc.nextLine();
    
    System.out.println(" insira o código da peça ");
    int codigoPeça = sc.nextInt();
    
    System.out.print("insira o preço unitário da peça");
    int preçoPeça = sc.nextInt();
    
    System.out.println("Insira a quantidade vendida");
    int quantidade = sc.nextInt();
    
    int valorVenda = preçoPeça * quantidade;
    double comissao = valorVenda * 0.05; 
    System.out.printf(" a comissão a ser recebida por " + vendedor + " é de " + comissao);
    }
}