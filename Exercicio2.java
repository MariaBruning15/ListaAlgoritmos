public class Exercicio2 {
        
    public static void main(String[] args) {
        int[] vetor = {3, 4, 9, 2, 5, 8, 1};

        for (int i = 0; i<vetor.length - 1; i++) {
			for (int j = 0; j<vetor.length - 1; j++) {
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


