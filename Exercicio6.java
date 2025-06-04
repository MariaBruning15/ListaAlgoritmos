import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o tamanho do vetor");
		int tamanho = scanner.nextInt();
		
		int[] vetor = new int[tamanho];
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.println("Digite a pontuação número " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
		}

		for (int i = 0; i<vetor.length - 1; i++) {
			for (int j = 0; j<vetor.length - 1; j++) {
				if(vetor[j] > vetor[j+1]) {
					
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					
				}
			}
		}
		System.out.println("Potuações ordenadas: [");
		for (int x = 0; x < vetor.length; x++) {
			System.out.print(vetor[x] + " ");
		}
		System.out.println("]");
		System.out.print("Pontuação Mais Alta: " + vetor[ vetor.length-1] );

				
	}
			
}

