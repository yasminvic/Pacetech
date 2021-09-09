
package AtividadeDaSemana8;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        

        
        
        Alunos alunoUm = new Alunos("Yasmin", 12345, 10, -9);
        Alunos alunoDois = new Alunos("Matheus", 13987, 7, 4.5f);
        Alunos alunoTres = new Alunos();
      
        
        System.out.println("• Digite seu nome:");
        alunoTres.setNome(leitor.next());
        
        System.out.println("• Digite o número da sua mátricula");
        alunoTres.setMatricula(leitor.nextInt());
        
        System.out.println("• Digite a nota da prova:");
        alunoTres.setNotaprova(leitor.nextFloat());
        
        System.out.println("• Digite a nota do trabalho:");
        alunoTres.setNotatrabalho(leitor.nextFloat());
        
        
        System.out.println("A média final da aluna Yasmin é: " + alunoUm.calcularmedia());
        System.out.println("A média final do aluno Matheus é: " + alunoDois.calcularmedia());
        System.out.println("A média final do(a) aluno(a) " + alunoTres.getNome() + " é:" + alunoTres.calcularmedia());
    }
    
}
