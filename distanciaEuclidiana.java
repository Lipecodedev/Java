package controle;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        
      
        Scanner sc = new Scanner(System.in);
        
      
        System.out.print("Digite a coordenada x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Digite a coordenada y1: ");
        double y1 = sc.nextDouble();
        

        System.out.print("Digite a coordenada x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Digite a coordenada y2: ");
        double y2 = sc.nextDouble();
        
      
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
       
        System.out.printf("A distância entre os pontos (%f, %f) e (%f, %f) é: %.2f\n", x1, y1, x2, y2, distancia);
        
     
        sc.close();
    }
}
