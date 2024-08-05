package model.entities;

import java.time.LocalDate; // Importa a classe LocalDate para manipular datas
import java.time.format.DateTimeFormatter; // Importa a classe DateTimeFormatter para formatar datas

public class Installment {

    // Define um formato de data para "dd/MM/yyyy"
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    private LocalDate dueDate; // Atributo para armazenar a data de vencimento da parcela
    private Double amount; // Atributo para armazenar o valor da parcela
    
    // Construtor para inicializar a data de vencimento e o valor da parcela
    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    // Método para obter a data de vencimento
    public LocalDate getDueDate() {
        return dueDate;
    }

    // Método para definir a data de vencimento
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    // Método para obter o valor da parcela
    public Double getAmount() {
        return amount;
    }

    // Método para definir o valor da parcela
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    // Método para representar a parcela como uma string formatada
    @Override
    public String toString() {
        return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
    }
}