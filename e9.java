import java.util.Scanner;

public class e9
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira sua idade em anos");
        int idadeAnos = sc.nextInt();
        
        System.out.println("insira a quantidade de meses decorridos no seu ano incompleto");
        int meses = sc.nextInt();
        
        System.out.println("insira a quantidade de dias decorrido no seu mes incompleto");
        int dias = sc.nextInt();
        
        int idadeDias = idadeAnos * 365 + meses * 30 + dias;
        System.out.print(" Sua idade em dias é " + idadeDias);
    }
}