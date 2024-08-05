package Interfaces;

import java.util.Locale; // Importa a classe Locale para definir o formato regional
import java.util.Scanner; // Importa a classe Scanner para leitura de entradas do usuário

import model.services.BrazilInterestService; // Importa a classe BrazilInterestService do pacote model.services
import model.services.InterestService; // Importa a interface InterestService do pacote model.services

public class Payment {

    public static void main(String[] args) {

        // Define o locale padrão como US (para formatar números com ponto decimal)
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        // Solicita e lê o valor do pagamento
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        
        // Solicita e lê o número de meses
        System.out.print("Months: ");
        int months = sc.nextInt();
        
        // Cria uma instância de BrazilInterestService com uma taxa de 2.0
        InterestService is = new BrazilInterestService(2.0);
        
        // Calcula o pagamento após o número de meses usando o serviço de interesse
        double payment = is.payment(amount, months);
        
        // Exibe o pagamento formatado com duas casas decimais
        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));
        
        // Fecha o Scanner
        sc.close();
    }
}