import java.util.Scanner;

public class exercicio_08 {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um numero:");
		
		int x = sc.nextInt();
			
		if(x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}
}