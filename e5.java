import java.util.Scanner;

public class e5
{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o tempo gasto na viagem em horas");
        int tempo = sc.nextInt();
        
        System.out.println("Insira a velocidade média");
        int velocidade = sc.nextInt();
        
        int distancia = tempo * velocidade; 
        int litros = distancia / 12;
        
        System.out.printf(" A velocidade média foi de " + velocidade); 
        System.out.printf(" \n O tempo gasto na viagem foi de " + tempo + " horas"); 
        System.out.printf(" \n A distância percorrida foi de " + distancia); 
        System.out.printf(" \n A quantidade de litros utilizada na viagem foi de " + litros);
    }
}    