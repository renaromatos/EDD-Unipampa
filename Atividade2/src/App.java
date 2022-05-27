import entities.Vetor;

public class App {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor();

        vetor.adiciona("Aluno1", 16, 9);
        vetor.adiciona("Aluno2", 16, 9);
        vetor.adiciona("Aluno4", 17, 9);

        System.out.println(vetor.tamanho());
        System.out.println(vetor.contem("Aluno1", 17, 9));
        System.out.println(vetor.contem("Aluno1", 16, 9));
        System.out.println(vetor.contem("Aluno3", 16, 9));
    }
}
