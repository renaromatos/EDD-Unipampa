package entities;

public class Vetor implements IVetor{
    
    private String[] nomes = new String[5];
    private int[] idades = new int[5];
    private double[] notas = new double[5];
    private int totalNotas = 0;

    @Override
    public void adiciona(String nome, int idade, double nota){
        this.garanteEspaco();
        this.notas[this.totalNotas] = nota;
        this.totalNotas++;
    }

    @Override
    public int tamanho() {
        return this.totalNotas;
    }

    @Override
    public boolean contem(String nome, int idade, double nota) {
        for(int i = 0; i < this.notas.length; i++){
            if(nome == this.nomes[i] && idade == this.idades[i] && nota == this.notas[i]){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cheio(){
        if(totalNotas == this.notas.length){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean remove(String nome){
        int indice = -1;
        for(int i = 0; i < totalNotas; i++){
            if(nome == this.nomes[i]){
                indice = i;
                break;
            }
        }
        if(indice != -1){
            for(int i = indice; i < (totalNotas - 1); i++){
                notas[i] = notas[i+1];
            }
            totalNotas--;
            return true;
        }
        else{
            return false;
        }
    }

    private void garanteEspaco(){
        if(this.cheio()){
            String[] novoNomes = new String[this.nomes.length * 2];
            int[] novoIdades = new int[this.idades.length * 2];
            double[] novoNotas = new double[this.notas.length * 2];
            for(int i = 0; i < this.notas.length; i++){
                novoNotas[i] = this.notas[i];
            }
            this.nomes = novoNomes;
            this.idades = novoIdades;
            this.notas = novoNotas;
        }
    }

}
