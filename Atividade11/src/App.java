import entities.FilaLista;

public class App {
    public static void main(String[] args) throws Exception {
        
        FilaLista filaLista = new FilaLista();

        filaLista.isEmpty();

        filaLista.add(2);
        filaLista.add(1);

        filaLista.size();
        
        filaLista.imprimir();

        filaLista.remove();

        filaLista.imprimir();

    }
}
