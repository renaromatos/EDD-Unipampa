import entities.IVetor;
import entities.Vetor;

public class App {
    public static void main(String[] args) throws Exception {
        
        Vetor vetor = new Vetor();

        vetor.adiciona(6.7);
        vetor.adiciona(9);
        vetor.adiciona(9.5);
        vetor.adiciona(3.5);
        vetor.adiciona(5.5);
        System.out.println("Tamanho antes de remover: " + vetor.tamanho());

        vetor.remove(5.5);
        System.out.println("Tamanho após remover: " + vetor.tamanho());

        System.out.println("Contem 3.5? " + vetor.contem(3.5));
        System.out.println("Contem 10? " + vetor.contem(10));

        System.out.println("O vetor está cheio? " + vetor.cheio());

        

    }
}
