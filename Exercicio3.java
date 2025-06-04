import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {
    	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o tamanho do vetor");
		int tamanho = scanner.nextInt();
        scanner.nextLine();
		
		String[] vetor = new String[tamanho];
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.println("Digite o conteúdo do índice " + i + ":");
            vetor[i] = scanner.nextLine();
		}

        Arrays.sort(vetor); // Ordena em ordem alfabética (crescente)
        
        System.out.println("Vetor ordenado:");        
        for (int x = 0; x < vetor.length; x++) {
            System.out.print(vetor[x] + " ");        
        }
		
		
	}

}