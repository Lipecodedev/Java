package controle;
 import java.util.Scanner;
 
 
public class somaSimples {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("dgite sua idade");
	double idade = sc.nextDouble();
	
	

      	 
	
	double media = idade * 365;
	
     
     System.out.println("qtd aproximada de dias vividos é" + media);
     sc.close();
	}
}
