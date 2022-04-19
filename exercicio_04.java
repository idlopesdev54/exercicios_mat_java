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
		
		System.out.printf("O funcionario Nº " + F + " vai receber R$ %.2f%n", S);
		
		
		sc.close();
	}
}

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//decimais