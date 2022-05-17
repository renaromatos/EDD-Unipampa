import java.util.Scanner;

import entities.PontoCartesiano;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de Xa: ");
        float xa = sc.nextFloat();
        System.out.print("Insira o valor de Xb: ");
        float xb = sc.nextFloat();
        System.out.print("Insira o valor de Ya: ");
        float ya = sc.nextFloat();
        System.out.print("Insira o valor de Yb: ");
        float yb = sc.nextFloat();
        PontoCartesiano pontoCartesiano = new PontoCartesiano(xa, xb, ya, yb);
        System.out.print("O resultado do da distância euclidiana é: " + pontoCartesiano.distEuclidiana());
        
        sc.close();
        
    }
}
