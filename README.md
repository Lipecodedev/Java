package controle;
 import java.util.Scanner;
 
 
public class somaSimples {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("dgite um numero:");
	int num1 = sc.nextInt();
	
	System.out.print("dgite outro numero:");
	int num2 = sc.nextInt();
	
     int resposta =  num1 + num2;
     System.out.println("a soma é" + resposta);
     sc.close();
	}
}

