import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o número de pacientes:");
		int tamanho = scanner.nextInt();
        scanner.nextLine();
		
		String[] nomes = new String[tamanho];
        int[] gravidade = new int[tamanho];
    	int[] tempo = new int[tamanho];
		
		for (int i = 0; i<nomes.length; i++) {
			System.out.println("Informe o paciente número " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
		}

        for (int i = 0; i<nomes.length; i++) {
			System.out.println("Informe o grau de gravidade do paciente  " + nomes[i] + ":");
            gravidade[i] = scanner.nextInt();
		}

        for (int i = 0; i<nomes.length; i++) {
			System.out.println("Informe o tempo de espera do paciente " + nomes[i] + ":");
            tempo[i] = scanner.nextInt();
		}
    	
    	        

    	    int n = nomes.length;
    	        for (int i = 0; i < n - 1; i++) {
    	            for (int j = 0; j < n - 1 - i; j++) {
    	                if (compararGrav(gravidade[j], tempo[j], gravidade[j + 1], tempo[j + 1])) {
    	                    
    	                	String tempNome = nomes[j];
    	                    nomes[j] = nomes[j + 1];
    	                    nomes[j + 1] = tempNome;
    	                    
    	                    int tempGrav = gravidade[j];
    	                    gravidade[j] = gravidade[j + 1];
    	                    gravidade[j + 1] = tempGrav;

    	                    int tempTempo = tempo[j];
    	                    tempo[j] = tempo[j + 1];
    	                    tempo[j + 1] = tempTempo;
    	                }
    	            }
    	        }

    	        System.out.print("Ordem de atendimento: ");
    	         for (int i = 0; i < nomes.length; i++) {
    	            System.out.print(nomes[i] + " ");
    	        }
    	        System.out.println();
    	    }


    	    
        
    public static boolean compararGrav(int grav1, int tempo1, int grav2, int tempo2) {
    	    if (grav1 < grav2) {
    	            return true;
    	        } 
            else if (grav1 == grav2) {
    	            return tempo1 < tempo2;
    	        } 
            else {
    	            return false;
    	        }
    	}
    }

        
    	   
    	       
