package controle;
 import java.util.Scanner;
 
 
public class somaSimples {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("dgite a nota 1");
	double nota1 = sc.nextDouble();
	
	
	System.out.print("dgite a nota 2");
	double nota2 = sc.nextDouble();
    
    		 
	
	System.out.print("dgite a nota 3");
	double nota3 = sc.nextDouble();
      	 
	
	double media = (nota1 + nota2 + nota3) / 3 ;
	
     
     System.out.println("a media final é " + media);
     sc.close();
	}
}
