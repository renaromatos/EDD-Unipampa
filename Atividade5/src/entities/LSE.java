package entities;

public class LSE implements Lista{

    private Noh inicio;

    @Override
    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if(inicio == null){
            inicio = novo;
        }
        else{
            novo.setProx(inicio);
            inicio = novo;
        } 
    }

    @Override
    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if(inicio == null){
            inicio = novo;
        }
        else{
            Noh ultimo;
            for(Noh i = inicio; i != null; i = i.getProx()){
                ultimo = i;
                ultimo.setProx(novo);
            }
        }
    }

    @Override
    public boolean estahVazia() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remove(Object info) {
        Noh ant = null, p;
        p = inicio;
        while(p != null && p.getInfo() != info){
            ant = p;
            p = p.getProx();
        }
        if(p == null){
            return false;
        }
        if(ant == null){
            inicio = p.getProx();
        }
        else{
            ant.setProx(p.getProx());
        }
        return true;
    }

    @Override
    public int tamanho() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void imprimir(){
        if(inicio != null){
            inicio.imprimir();
        }
    }

}
