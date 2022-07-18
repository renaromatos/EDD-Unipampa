package entities;

public class FilaLista implements IFila{
    private Noh inicio;
    private Noh fim;
    private int quant;

    public FilaLista(){
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public boolean add(Object info) {
        Noh novo = new Noh(info);
        if(this.isEmpty()){
            inicio = novo;
        }
        else{
            fim.setProx(novo);
            fim = novo;
        }
        quant++;
        return true;
        
    }

    @Override
    public boolean remove() {
        if(!isEmpty()){
            if(inicio == fim){
                inicio = null;
                fim = null;
            }
            else{
                inicio = inicio.getProx();
                quant--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(quant == 0){
            System.out.println("Fila vazia.");
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int size() {
        System.out.println("O tamanho da fila é: ");
        return quant;
    }

    @Override
    public void imprimir(){
        Noh n = inicio;
        if(n == null){
            System.out.println("Fila vazia. ");
        }
        while(n != fim){
            if(n.getInfo() == null){
                n.getProx();
                System.out.println(n.getInfo());
            }
            if(n == fim){
                System.out.println(n.getInfo());
            }
        }
    }
    
}
