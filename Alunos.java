
package AtividadeDaSemana8;



public class Alunos {
    
    private String nome;
    private int matricula;
    private float notaprova;
    private float notatrabalho;
    
    public Alunos(String nome, int matricula, float notaprova, float notatrabalho){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setNotaprova(notaprova);
        this.setNotatrabalho(notatrabalho);
    
    }
    
    public Alunos(){
    
    }
    
    public float calcularmedia(){
        float media = ((notaprova * 5)+(notatrabalho*5))/10;
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getNotaprova() {
        return notaprova;
    }

    public void setNotaprova(float notaprova) {
        if(notaprova < 0){
            this.notaprova = 0;
        
        }else{
            this.notaprova = notaprova;
        }
    }

    public float getNotatrabalho() {
        return notatrabalho;
    }

    public void setNotatrabalho(float notatrabalho) {
        if(notatrabalho < 0){
            this.notatrabalho = 0;
        
        }else{
            this.notatrabalho = notatrabalho;
        }
    }

    
    
}
