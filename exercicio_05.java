import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qnt1, qnt2;
		double preco1,preco2,total;
		
		cod1 = sc.nextInt();
		qnt1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qnt2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = preco1 * qnt1 + preco2 * qnt2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		System.out.println("Somando o codigo "+ cod1 + " com o codigo "+ cod2 +".");
		
		
		sc.close();
		
	}
}

// Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o 
//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.