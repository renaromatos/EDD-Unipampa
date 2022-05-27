package entities;

public class Vetor {
    
    private String[] nomes = new String[5];
    private int[] idades = new int[5];
    private int[] notas = new int[5];
    private int totalAlunos;

    public void adiciona(String nome, int idade, int nota){
        this.nomes[this.totalAlunos] = nome;
        this.idades[this.totalAlunos] = idade;
        this.notas[this.totalAlunos] = nota;
        this.totalAlunos++;
    }

    public int tamanho(){
        return this.totalAlunos;
    }

    public boolean contem(String nome, int idade, int nota){
        for(int i = 0; i < nomes.length; i++){
            if(this.nomes[i] == nome && this.idades[i] == idade && this.notas[i] == nota){
                return true;
            }
        }
        return false;
    }
        
}
