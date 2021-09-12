import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	  Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int fatorial = 1;
     if (n == 1 || n == 0){
        	System.out.print(fatorial);
    }else{
        while (n >= 2){
            fatorial = fatorial * n;
            n--;
        }
        	System.out.print(fatorial);
		}
	
	}
}