import java.util.Scanner;

public class e6
{
   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println(" Insira a temperatura em Celsius");
       float C = sc.nextFloat();
       float F = ( 9 * C + 160 ) / 5; 
       System.out.printf(" Atemperatura em Fahrenheit é igual a " + F );
   }
}   