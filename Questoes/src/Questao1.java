import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1 {


		
		
	    public static void main(String[] args) {
	        
	    	System.out.println("Escolha um numero");
	    	Scanner s = new Scanner(System.in);
	    	List<Integer> sequenciaFibonacci = new ArrayList<>();
	    	boolean isFibonacciNumber = false;
	    	
	    	int numeroSelecionado = s.nextInt();
	        for (int i = 0; i < numeroSelecionado; i++) {
	         
	            sequenciaFibonacci.add(fibonacci(i));
	        }
	        
	 
	        	isFibonacciNumber = sequenciaFibonacci.contains(numeroSelecionado) ? true : false;

	   			System.out.println("isFibonacciNumber: " + isFibonacciNumber);
	   			
	    }

	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	
}
