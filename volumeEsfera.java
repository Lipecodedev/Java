package controle;
 import java.util.Scanner;
 
 
public class somaSimples {
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("dgite o raio da esfera");
	double raio = sc.nextDouble(); 
	 Double volume = (4.0 / 3.0) * 3.1416 * (raio * raio * raio);

      	 
	
     
    System.out.println("o volume da esfera é " + volume +"cm³ ");
     sc.close();
	}
}
