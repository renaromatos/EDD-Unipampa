package entities;

public interface IVetor {

    public void adiciona(String nome, int idade, double nota);
    public int tamanho();
    public boolean contem(String nome, int idade, double nota);
    public boolean cheio();
    public boolean remove(String nome);
}
