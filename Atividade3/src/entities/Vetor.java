package entities;

public class Vetor implements IVetor{
    
    private double[] notas = new double[4];
    private int totalNotas = 0;

    @Override
    public void adiciona(double elem){
        this.garanteEspaco();
        this.notas[this.totalNotas] = elem;
        this.totalNotas++;
    }

    @Override
    public int tamanho() {
        return this.totalNotas;
    }

    @Override
    public boolean contem(double elem) {
        for(int i = 0; i < this.notas.length; i++){
            if(elem == this.notas[i]){
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
    public boolean remove(double elem){
        int indice = -1;
        for(int i = 0; i < totalNotas; i++){
            if(elem == this.notas[i]){
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
            double[] novoNotas = new double[this.notas.length * 2];
            for(int i = 0; i < this.notas.length; i++){
                novoNotas[i] = this.notas[i];
            }
            this.notas = novoNotas;
        }
    }

}
