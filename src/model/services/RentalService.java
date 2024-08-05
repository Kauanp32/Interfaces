package model.services;

import java.time.Duration; // Importa a classe Duration para calcular a duração entre datas

import model.entities.CarRental; // Importa a classe CarRental para manipular informações de aluguel
import model.entities.Invoice; // Importa a classe Invoice para gerar a fatura

public class RentalService {

    private Double pricePerDay; // Atributo para armazenar o preço por dia de aluguel
    private Double pricePerHour; // Atributo para armazenar o preço por hora de aluguel
    
    private TaxService taxService; // Atributo para armazenar o serviço de cálculo de imposto

    // Construtor para inicializar os preços e o serviço de imposto
    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }
    
    // Método para processar a fatura do aluguel de carro
    public void processInvoice(CarRental carRental) {
        
        // Calcula a duração em minutos entre o início e o fim do aluguel
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0; // Converte a duração para horas
        
        double basicPayment; // Armazena o pagamento básico a ser calculado
        if (hours <= 12.0) {
            // Se o aluguel for de até 12 horas, calcula o pagamento baseado no preço por hora
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            // Se o aluguel for mais de 12 horas, calcula o pagamento baseado no preço por dia
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        // Calcula o imposto com base no pagamento básico
        double tax = taxService.tax(basicPayment);

        // Define a fatura no objeto de aluguel de carro
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}