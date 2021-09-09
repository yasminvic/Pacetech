
package ProjetoSemana8;


public class Main1 {

    
    public static void main(String[] args) {
        
        Empregado empregadoUm = new Empregado("Yasmin Victória", "Alves de Souza", 5000.0f);
        Empregado empregadoDois = new Empregado("Thiago", "Da Silva", 2000.0f);
        
        System.out.println("                       SEM AUMENTO ");
        
        System.out.println("• O salário anual da Yasmin é: " + empregadoUm.calcularSalarioAnual());
        System.out.println("• O salário anual do Thiago é: " + empregadoDois.calcularSalarioAnual());
        
        System.out.println("--------------------------//----------------------------");
        
        System.out.println("                       COM AUMENTO");
        
        System.out.println("• O salário anual de Yasmin com aumento de 10% é: " 
                + empregadoUm.calcularAumento());
        System.out.println("• O salário anual de Thiago com aumento de 10% é: " 
                + empregadoDois.calcularAumento());
        
        

    }
    
}
