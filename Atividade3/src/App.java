import entities.IVetor;
import entities.Vetor;

public class App {
    public static void main(String[] args) throws Exception {
        
        IVetor vetor = new Vetor();

        vetor.adiciona("Aluno1", 20, 6.7);
        vetor.adiciona("Aluno2", 21, 9);
        vetor.adiciona("Aluno3", 20, 9.5);
        vetor.adiciona("Aluno4", 18, 3.5);
        vetor.adiciona("Aluno5", 20, 5.5);
        System.out.println("Tamanho antes de remover: " + vetor.tamanho());

        vetor.remove("aluno2");
        System.out.println("Tamanho após remover: " + vetor.tamanho());

        System.out.println("Contem 3.5? " + vetor.contem("Aluno1", 20, 6));
        System.out.println("Contem 10? " + vetor.contem("Aluno4", 18, 3.5));

        System.out.println("O vetor está cheio? " + vetor.cheio());

        

    }
}
