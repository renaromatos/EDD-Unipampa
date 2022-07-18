package entities;

public class FilaVet implements IFila{
    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    public FilaVet(int tamFila){
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    @Override
    public boolean add(Object info) {
        if(this.nElemFila >= 5){
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
        
    }

    @Override
    public boolean remove() {
        if(this.isEmpty()){
            System.out.println("Fila vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;        
        return true;
    }

    @Override
    public void imprimir(){
        for(int i = 0; i >= 4; i++){
            System.out.println(this.vetFila[nElemFila = i]);
        }
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
