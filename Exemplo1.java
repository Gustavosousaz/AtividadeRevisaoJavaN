package AtividadeRevisao;

import java.util.Scanner;

public class Exemplo1 {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // Ler o número
        System.out.println("Informe um número:");
        double nDigitado = sc.nextDouble();
        // Se número for maior que >10
        if (nDigitado > 10) {
            System.out.println("É maior que 10!");
            // Senão mostr " não é maior que <10"
        } else {
            System.out.println("Não é maior que 10!");
        }

    }

    public void exemplo2() {
        //Acrescimo de horas mensais
        System.out.println("Informe as horas trabalhadas nesse mês");
        int HoraTrabalhada = sc.nextInt();
        // se o numero for maior que 200 acrescentar 50% de hora extra
        System.out.println("Informe o Valor da hora");
        double ValorHora = sc.nextInt();
        //se for maior que 200horas mensais
        int horasExtras = HoraTrabalhada-200;
        double salarioTotal= HoraTrabalhada*ValorHora+horasExtras*ValorHora*50/100;
        System.out.println("O Salario Total é R$"+salarioTotal);
        
            }
}
