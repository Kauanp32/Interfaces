package Interfaces;

import java.text.ParseException; // Importa a classe ParseException para tratar erros de parsing
import java.time.LocalDate; // Importa a classe LocalDate para manipular datas
import java.time.format.DateTimeFormatter; // Importa a classe DateTimeFormatter para formatar datas
import java.util.Locale; // Importa a classe Locale para definir o formato regional
import java.util.Scanner; // Importa a classe Scanner para leitura de entradas do usuário

import model.entities.Contract; // Importa a classe Contract do pacote model.entities
import model.entities.Installment; // Importa a classe Installment do pacote model.entities
import model.services.ContractService; // Importa a classe ContractService do pacote model.services
import model.services.PaypalService; // Importa a classe PaypalService do pacote model.services

public class Parcelas {

    public static void main(String[] args) throws ParseException {

        // Define o locale padrão como US (para formatar números com ponto decimal)
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        // Define o formato de data que será utilizado para entrada e saída
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Solicita e lê os dados do contrato
        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        
        // Cria um objeto Contract com os dados fornecidos
        Contract obj = new Contract(number, date, totalValue);
        
        // Solicita e lê o número de parcelas
        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();
        
        // Cria uma instância de ContractService com um serviço de pagamento via Paypal
        ContractService contractService = new ContractService(new PaypalService());
        
        // Processa o contrato para gerar as parcelas
        contractService.processContract(obj, n);
        
        // Exibe as parcelas geradas
        System.out.println("Parcelas:");
        for (Installment installment : obj.getInstallments()) {
            System.out.println(installment);
        }
        
        // Fecha o Scanner
        sc.close();
    }
}