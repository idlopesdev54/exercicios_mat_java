import java.util.Scanner;

public class exercicio_02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double R, A, PI = 3.14159;
		
		R = sc.nextDouble();
		A = PI * R * R;
		
		System.out.printf("A=%.4f%n",A);
		
		sc.close();
		
	}
}

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159