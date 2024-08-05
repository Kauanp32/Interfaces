package model.entities;

import java.time.LocalDate; // Importa a classe LocalDate para manipular datas
import java.util.ArrayList; // Importa a classe ArrayList para usar listas dinâmicas
import java.util.List; // Importa a interface List para definir listas

public class Contract {

    private Integer number; // Atributo para armazenar o número do contrato
    private LocalDate date; // Atributo para armazenar a data do contrato
    private Double totalValue; // Atributo para armazenar o valor total do contrato
    
    private List<Installment> installments = new ArrayList<>(); // Lista para armazenar as parcelas do contrato
    
    // Construtor para inicializar o número, a data e o valor total do contrato
    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    // Método para obter o número do contrato
    public Integer getNumber() {
        return number;
    }

    // Método para definir o número do contrato
    public void setNumber(Integer number) {
        this.number = number;
    }

    // Método para obter a data do contrato
    public LocalDate getDate() {
        return date;
    }

    // Método para definir a data do contrato
    public void setDate(LocalDate date) {
        this.date = date;
    }

    // Método para obter o valor total do contrato
    public Double getTotalValue() {
        return totalValue;
    }

    // Método para definir o valor total do contrato
    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    // Método para obter a lista de parcelas do contrato
    public List<Installment> getInstallments() {
        return installments;
    }
}