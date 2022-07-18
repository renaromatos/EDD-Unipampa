import entities.FilaVet;

public class App {
    public static void main(String[] args) throws Exception {
        
        FilaVet filaVet = new FilaVet(4);

        filaVet.add("Aluno1");
        filaVet.add("Aluno2");
        filaVet.add("Aluno3");
        filaVet.add("Aluno4");
        filaVet.add("Aluno5");

        filaVet.imprimir();

        filaVet.remove();

        filaVet.imprimir();
        
    }
}
