import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int F = sc.nextInt();
		double H = sc.nextDouble();
		double HE = sc.nextDouble();
		
		double S = H * HE;
		
		System.out.printf("O funcionario N� " + F + " vai receber R$ %.2f%n", S);
		
		
		sc.close();
	}
}

//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por 
//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas 
//decimais