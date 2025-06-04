public class Exercicio1{
    public static void main(String[] args) {
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1};
		bubbleSort(vetor);
		insertionSort(vetor);
		selectionSort(vetor);
		mergeSort(vetor);

        
    }
    public static void bubbleSort(int[] vetor){	
		System.out.println("Bubble Sort:");
	
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

	public static void insertionSort(int[] vetor) {
    System.out.println("Insertion Sort");
    for (int i = 0; i < vetor.length; i++) {
        int j = i - 1;
        int valor = vetor[i];
        
        while (j >= 0 && valor < vetor[j]) {
            vetor[j + 1] = vetor[j];
            j--;
        }
        vetor[j + 1] = valor;
        
    }
	for (int x = 0; x < vetor.length; x++) {
			System.out.print(vetor[x] + " ");		
	}
	System.out.println(" ");
	}
	

	public static void selectionSort(int[] vetor){
		System.out.println("Selection Sort");
	for(int i = 0; i<vetor.length; i++){
		int j = i -1;
		int valor = vetor[i];
		while(j >= 0 && valor<vetor[j]){
			vetor[j+1] = vetor[j];
			j-= 1;
			}
		vetor[j+1] = valor;

	}
	for (int x = 0; x < vetor.length; x++) {
			System.out.print(vetor[x] + " ");		
	}
	System.out.println(" ");


}
 public static void mergeSort(int vetor[]) {
		System.out.println("Merge Sort:");

        int aux[] = new int[vetor.length];
        merge(vetor, aux, 0, vetor.length - 1);
		for (int x = 0; x < vetor.length; x++) {
			System.out.print(vetor[x] + " ");		
	}
	System.out.println(" ");
    }

    public static void merge(int vetor[], int aux[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            merge(vetor, aux, inicio, meio);
            merge(vetor, aux, meio + 1, fim);

            intercalacao(vetor, aux, inicio, meio, fim);
			
        }
    }

    private static void intercalacao(int vetor[], int aux[], int inicio, int meio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            aux[i] = vetor[i];
        }

        int esquerda = inicio;
        int direita = meio + 1;

        for (int k = inicio; k <= fim; k++) {
            if (esquerda > meio) {
                vetor[k] = aux[direita++];
            } else if (direita > fim) {
                vetor[k] = aux[esquerda++];
            } else if (aux[esquerda] <= aux[direita]) {
                vetor[k] = aux[esquerda++];
            } else {
                vetor[k] = aux[direita++];
            }
        }
		
}
}


