package entities;

public interface IVetor {
    
    public void adiciona(Object object);
    public int tamanho();
    public boolean contem(Object object);
    public boolean cheio();
    public boolean remove(Object object);
    public Object imprimeVetor();
    
}
