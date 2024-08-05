package Interfaces;

import java.text.ParseException; // Importa a classe ParseException para tratar erros de parsing
import java.time.LocalDateTime; // Importa a classe LocalDateTime para manipular datas e horas
import java.time.format.DateTimeFormatter; // Importa a classe DateTimeFormatter para formatar datas
import java.util.Locale; // Importa a classe Locale para definir o formato regional
import java.util.Scanner; // Importa a classe Scanner para leitura de entradas do usuário

import model.entities.CarRental; // Importa a classe CarRental do pacote model.entities
import model.entities.Vehicle; // Importa a classe Vehicle do pacote model.entities
import model.services.BrazilTaxService; // Importa a classe BrazilTaxService do pacote model.services
import model.services.RentalService; // Importa a classe RentalService do pacote model.services

public class Veiculo {

    public static void main(String[] args) throws ParseException {

        // Define o locale padrão como US (para formatar números com ponto decimal)
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        // Define o formato de data e hora que será utilizado para entrada e saída
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        // Solicita e lê o modelo do carro
        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        
        // Solicita e lê a data e hora de retirada, e a converte para LocalDateTime
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        
        // Solicita e lê a data e hora de retorno, e a converte para LocalDateTime
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
        
        // Cria um objeto CarRental com as informações fornecidas
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        // Solicita e lê o preço por hora e por dia
        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();
        
        // Cria um objeto RentalService com os preços e um serviço de taxa
        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        
        // Processa a fatura para o aluguel de carro
        rentalService.processInvoice(cr);

        // Imprime a fatura
        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
        
        // Fecha o Scanner
        sc.close();
    }
}