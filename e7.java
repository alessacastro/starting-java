import java.util.Scanner;

public class e7
{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a temperatura em Fahrenheit para convertê-la em Celsius");
        float F = sc.nextFloat();
        float C = (F - 32 ) * 5 / 9;
        System.out.printf(" A temperatura em Celsius é " + C);
    }
}