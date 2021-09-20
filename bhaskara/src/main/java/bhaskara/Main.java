package bhaskara;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        CalcularBhaskara teste = new CalcularBhaskara();
        char desejacontinuar = 's';

        while (desejacontinuar == 's' || desejacontinuar == 'S') {

            System.out.println("• Informe o valor do coeficiente a:");
            teste.seta(leitor.nextDouble());

            System.out.println("• Informe o valor do coeficiente b:");
            teste.setb(leitor.nextDouble());

            System.out.println("• Informe o valor do coeficiente c:");
            teste.setc(leitor.nextDouble());
            
            System.out.println("----------------------------------------------------");

            System.out.println("        O valor do delta é: " + teste.calculodelta());

            if (teste.calculodelta() > 0) {
                System.out.println("A equação apresenta duas raízes reais e diferentes!");
                System.out.println("----------------------------------------------------");
                System.out.println("O valor de x1 é: " + teste.calcularx1());
                System.out.println("O valor de x2 é: " + teste.calcularx2());
                System.out.println("----------------------------------------------------");
            } else {
                if (teste.calculodelta() < 0) {
                    System.out.println("----------------------------------------------------");
                    System.out.println("A equação não tem raízes reais, pois não existe");
                    System.out.println("raiz quadrada de número negativo.");
                    System.out.println("----------------------------------------------------");
                } else {
                    System.out.println("A equação possui dois resultados iguais.");
                    System.out.println("----------------------------------------------------");
                    System.out.println("O valor de x1 e de x2 é: " + teste.calcularx1());
                    System.out.println("----------------------------------------------------");
                }
            }

            System.out.println("Deseja realizar outro cálculo? Responda com Sim ou Não");
            desejacontinuar = leitor.next().charAt(0);
        }

    }

}
