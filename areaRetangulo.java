package controle;
 import java.util.Scanner;
 
 
public class somaSimples {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("dgite a largura do retangulo");
	double largura = sc.nextDouble();
	
	System.out.print("digite a altura do retangulo");
	double altura = sc.nextDouble();
	
	
	

      	 
	
     
     System.out.println("a area do retangulo é " + (largura * altura) +"cm² ");
     sc.close();
	}
}
