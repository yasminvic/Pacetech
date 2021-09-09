package projetodasemana7;

import java.util.Scanner;

public class atividadesemana7 {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        char continuar = 'S';
        double celsius;
        double fahrenheit;

        
        while(continuar == 'S' || continuar == 's'){
            System.out.println("  -----------------MENU------------------");
            System.out.println(" | 1 - Coverter celsius para fahrenheit  |");
            System.out.println(" | 2 - Converter fahrenheit para celsius |");
            System.out.println("  ---------------------------------------");
            System.out.println("• Escolha uma opção do menu:");
            byte resposta = leitor.nextByte();
        
        if(resposta == 1){
           System.out.println("• Digite a temperatura em celsius:");
           celsius = leitor.nextDouble();
           fahrenheit = (celsius*1.8)+32;
           System.out.println(+ celsius + "ºC em fahrenheit é:" + fahrenheit + "ºF");
            for (int i = 0; i <= 100; i++) {
                fahrenheit = (i*1.8)+32;
                if(i == 0){
                    System.out.println("Tabela de conversão:");
                }
                System.out.println(i + "ºC = " + fahrenheit + "ºF");
            }
            System.out.println("• Deseja realizar outra conversão? "
                        + "Responda com Sim ou Não");
                continuar = leitor.next().charAt(0);
                
        }else{
            if(resposta == 2){
            System.out.println("• Digite a temperatura em fahrenheit:");
            fahrenheit = leitor.nextDouble();
            celsius = (fahrenheit - 32) / 1.8;
            System.out.println(fahrenheit + "ºF em celsius é:" + celsius + "ºC");
            for (int i = 0; i <= 100; i++){
                celsius = (i - 32) / 1.8;
                if(i == 0){
                    System.out.println("Tabela de conversão:");
                }
                System.out.println(i + "ºF = " + celsius + "ºF");
            }
            System.out.println("• Deseja realizar outra conversão? "
                        + "Responda com Sim ou Não");
                continuar = leitor.next().charAt(0);
            }else{
                System.out.println("Resposta inválida!");
            }
        }
        }
    }
    
}
