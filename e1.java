
import java.util.Scanner;

public class e1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Insira a quantidade minima");
        int quantidadeMinima = sc.nextInt();
        
        System.out.println(" Insira a quantidade máxima");
        int quantidadeMaxima = sc.nextInt();
        
        int estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
        System.out.printf("O estoque médio equivale a " + estoqueMedio);
    }
}

