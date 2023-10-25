import java.util.Scanner;

public class e4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lendo os valores A, B, C e D
        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();
        
        System.out.print("Digite o valor de D: ");
        int d = sc.nextInt();
        
        // Operações de adição
        int resultado1 = a + b;
        int resultado2 = a + c;
        int resultado3 = a + d;
        int resultado4 = b + c;
        int resultado5 = b + d;
        int resultado6 = c + d;
        
        // Operações de multiplicação
        int resultado7 = a * b;
        int resultado8 = a * c;
        int resultado9 = a * d;
        int resultado10 = b * c;
        int resultado11 = b * d;
        int resultado12 = c * d;
        
        // Exibindo os resultados
        System.out.println("Resultado das adições:");
        System.out.println(a + " + " + b + " = " + resultado1);
        System.out.println(a + " + " + c + " = " + resultado2);
        System.out.println(a + " + " + d + " = " + resultado3);
        System.out.println(b + " + " + c + " = " + resultado4);
        System.out.println(b + " + " + d + " = " + resultado5);
        System.out.println(c + " + " + d + " = " + resultado6);
        
        System.out.println("Resultado das multiplicações:");
        System.out.println(a + " * " + b + " = " + resultado7);
        System.out.println(a + " * " + c + " = " + resultado8);
        System.out.println(a + " * " + d + " = " + resultado9);
        System.out.println(b + " * " + c + " = " + resultado10);
        System.out.println(b + " * " + d + " = " + resultado11);
        System.out.println(c + " * " + d + " = " + resultado12);
    }

}
