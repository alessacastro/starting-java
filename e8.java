import java.util.Scanner;

public class e8
{
    public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o raio da lata");
        double R = sc.nextFloat();
        
        System.out.println("Insira a altura da lata");
        double A = sc.nextFloat();
        
        double V = 3.14159 * R * R * A ;
        
        System.out.printf(" O volume da lata é de " + V);
    }
}    