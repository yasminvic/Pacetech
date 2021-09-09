
package ProjetoSemana8;


public class Empregado {
    
    private String nome;
    private String sobrenome; 
    private float salariomensal;

    public Empregado(String nome, String sobrenome, float salariomensal) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSalariomensal(salariomensal);
    }
    
    public float calcularSalarioAnual(){
        float salarioanual = salariomensal * 12;
        return salarioanual;
    }
    
    public float calcularAumento(){
        float aumento = ((salariomensal * 0.10f) + salariomensal) * 12;
        return aumento;
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalariomensal() {
        return salariomensal;
    }

    public void setSalariomensal(float salariomensal) {
        if(salariomensal < 0){
            this.salariomensal = 0;
        
        }else{
            this.salariomensal = salariomensal;
        }
    }
 
}
