package AtividadeDaSemana7;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        char continuar = 'S';
        double celsius;
        double fahrenheit;
        float reais;
        float dinheiro;
        float dolar;

        
        while(continuar == 'S' || continuar == 's'){
            System.out.println("  -----------------MENU------------------");
            System.out.println(" | 1 - Coverter celsius para fahrenheit  |");
            System.out.println(" | 2 - Converter fahrenheit para celsius |");
            System.out.println(" | 3 - Coverter reais para dólar         |");
            System.out.println(" | 4 - Conversor de dólar para reais     |");
            System.out.println("  ---------------------------------------");
            System.out.println("• Escolha uma opção do menu:");
            byte resposta = leitor.nextByte();

             
            if(resposta == 1){
                System.out.println("• Digite a temperatura em celsius: ");
                celsius = leitor.nextDouble();
                fahrenheit = (celsius * 1.8) + 32;
                System.out.println(celsius + "ºC em fahrenheit é: "
                            + fahrenheit + "ºF");
                System.out.println("• Deseja realizar outra conversão? "
                        + "Responda com Sim ou Não");
                continuar = leitor.next().charAt(0);
                
            }else{
                if(resposta == 2){
                    System.out.println("• Digite a temperatura em fahrenheit:");
                    fahrenheit = leitor.nextDouble();
                    celsius = (fahrenheit - 32) / 1.8;
                    System.out.println(fahrenheit + "ºF em celsius é: " 
                            + celsius + "ºC");
                    System.out.println("• Deseja realizar outra conversão? "
                            + "Responda com Sim ou Não");
                    continuar = leitor.next().charAt(0);
                    
                }else{
                    if(resposta == 3){
                        System.out.println("• Informe a cotação do dólar atualmente:");
                        reais = leitor.nextFloat();
                        System.out.println("• Digite a quantia em reais:");
                        dinheiro = leitor.nextFloat();
                        dolar = dinheiro / reais;
                        System.out.println("R$" + dinheiro + " em dólares é US$: " + dolar);
                        System.out.println("• Deseja realizar outra conversão?"
                                + " Responda com Sim ou Não");
                        continuar = leitor.next().charAt(0);
                        
                    }else{
                        if(resposta == 4){
                            System.out.println("• Informe a cotação do dólar atualmente:");
                            reais = leitor.nextFloat();
                            System.out.println("• Digite a quantia em dólares:");
                            dinheiro = leitor.nextFloat();
                            reais = dinheiro * reais;
                            System.out.println("US$" + dinheiro + " em reais é R$:" + reais);
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
    }
    
}
