
import java.util.Scanner;

public class exercicio_07 {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();
	}
}
//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o