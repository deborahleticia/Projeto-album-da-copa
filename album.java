import java.util.Scanner;

public class album {
	
	    public static void main(String[] args){
	        int cont = 0;
	        Scanner A = new Scanner(System.in);
	        int numFigurinhas = A.nextInt();
	        int numFigurinhasC = A.nextInt();
	        int tipoFigurinha;
	        int []espaco = new int [numFigurinhas+1];
	        
	        for(int j=0; j<numFigurinhas+1; j++){
                espaco[j] = 0;
            }
	        
	        for(int i=0; i<numFigurinhasC; i++){
	        	tipoFigurinha = A.nextInt();
	        	
	        	espaco[tipoFigurinha] = 1;
	        }
	        for(int k=1; k<numFigurinhas+1; k++){
	                if(espaco[k] == 0){
	                cont++;
	                }
	            }  
	        System.out.println(cont);
	    }
}
