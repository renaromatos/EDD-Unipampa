import entities.IVetor;
import entities.VetorGenerico;

public class App {
    public static void main(String[] args) throws Exception {
        
        IVetor vetor = new VetorGenerico();

        vetor.adiciona("Aluno1");
        vetor.adiciona(10);
        vetor.adiciona(8.9);
        vetor.adiciona("AlunoNull");
        System.out.println("Vetor antes de remover o 10:");
        vetor.imprimeVetor();
        System.out.println("Vetor contém o 10? " + vetor.contem(10));

        vetor.remove(10);
        System.out.println("Vetor depois de remover o 10:");
        vetor.imprimeVetor();
        System.out.println("Vetor contém 10? " + vetor.contem("10"));
        System.out.println("Vetor cheio? " + vetor.cheio());

        

    }
}
