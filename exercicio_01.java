import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = x + y;
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double soma1 = a + b;
		
		String i = sc.next();
		String g = sc.next();
		
		System.out.println("A soma dos numeros � " + soma);
		System.out.printf("O resultado final � %.2f%n", soma1);
		System.out.println("� muito obvio que " + i + " + " + g + " = " + "0.");
		
		
		sc.close();
		
	}
}
//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma mensagem explicativa.