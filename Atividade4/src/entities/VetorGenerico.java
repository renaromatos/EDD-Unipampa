package entities;

public class VetorGenerico implements IVetor{

    private Object[] objects = new Object[4];
    private int totalAlunos = 0;

    @Override
    public void adiciona(Object object) {
        this.garanteEspaco();
        this.objects[this.totalAlunos] = object;
        this.totalAlunos++;
    }

    @Override
    public int tamanho() {
        return this.totalAlunos;
    }

    @Override
    public boolean contem(Object object) {
        for(int i = 0; i < this.objects.length; i++){
            if(object == this.objects[i]){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cheio() {
        if(totalAlunos == this.objects.length){
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        int indice = -1;
        for(int i = 0; i < totalAlunos; i++){
            if(object == this.objects[i]){
                indice = i;
                break;
            }
        }
        if(indice != -1){
            for(int i = indice; i < (totalAlunos - 1); i++){
                objects[i] = objects[i+1];
            }
            totalAlunos--;
            return true;
        }
        else{
            return false;
        }
        
    }

    @Override
    public Object imprimeVetor() {
        for(int i = 0; i < this.objects.length; i++){
            System.out.println(objects[i]);
        }
        return null;
    }

    private void garanteEspaco(){
        if(this.cheio()){
            Object[] novoAlunos = new Object[this.objects.length * 2];
            for(int i = 0; i < this.objects.length; i++){
                novoAlunos[i] = this.objects[i];
            }
            this.objects = novoAlunos;
        }
    }
 
}
