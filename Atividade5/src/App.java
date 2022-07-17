import entities.LSE;

public class App {
    public static void main(String[] args) throws Exception {
        
        LSE lse = new LSE();

        lse.insereInicio("Aluno 2");
        lse.insereInicio("Aluno 3");
        lse.insereInicio("Aluno 4");
        lse.insereInicio("Aluno 5");
        lse.insereFim("aluno 1");
        lse.insereFim("aluno 0");

        lse.imprimir();

        lse.remove("Aluno 5");

        lse.imprimir();
    }
}
