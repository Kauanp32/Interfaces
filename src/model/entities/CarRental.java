package model.entities;

import java.time.LocalDateTime; // Importa a classe LocalDateTime para manipular data e hora

public class CarRental {

    private LocalDateTime start; // Atributo para armazenar a data e hora de início do aluguel
    private LocalDateTime finish; // Atributo para armazenar a data e hora de término do aluguel
    
    private Vehicle vehicle; // Atributo para armazenar o veículo alugado
    private Invoice invoice; // Atributo para armazenar a fatura do aluguel
    
    // Construtor padrão
    public CarRental() {
    }

    // Construtor para inicializar a data e hora de início, de término e o veículo
    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    // Método para obter a data e hora de início do aluguel
    public LocalDateTime getStart() {
        return start;
    }

    // Método para definir a data e hora de início do aluguel
    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    // Método para obter a data e hora de término do aluguel
    public LocalDateTime getFinish() {
        return finish;
    }

    // Método para definir a data e hora de término do aluguel
    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    // Método para obter o veículo alugado
    public Vehicle getVehicle() {
        return vehicle;
    }

    // Método para definir o veículo alugado
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // Método para obter a fatura do aluguel
    public Invoice getInvoice() {
        return invoice;
    }

    // Método para definir a fatura do aluguel
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}