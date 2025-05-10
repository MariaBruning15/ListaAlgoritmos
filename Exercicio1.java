public class Exercicio1{
    public static void main(String[] args) {
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, };
        
    }
    public void bubbleSort(int[] vetor){
        ImprimirVetor impressão = new ImprimirVetor();
        		int tamanho = vetor.length;
		int cont = 0;
		boolean trocou = false;
		for (int x = 0; x<tamanho - 1; x++) {
			
			for (int y = 0; y<tamanho - 1; y++) {
				cont ++;
				if(vetor[y] > vetor[y+1]) {
					
					int aux = vetor[y];
					vetor[y] = vetor[y+1];
					vetor[y+1] = aux;
					trocou = true;
					
				}
				
			}
			
			if (!trocou)
				break;
		}
        impressão.imprimir(vetor);
		
    }
}

