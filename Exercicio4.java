import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inform o número de elementos no vetor que deseja ordenar:");
        int n = scanner.nextInt();

        for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				if(vetor[j] > vetor[j+1]) {
					
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					
				}
				
			}
			
        	
		}
		for (int x = 0; x < vetor.length; x++) {
			System.out.print(vetor[x] + " ");		
	}
	System.out.println(" ");
		
    }
    
}
