package model.entities;

public class Invoice {

    private Double basicPayment; // Atributo para armazenar o pagamento básico
    private Double tax; // Atributo para armazenar o imposto

    // Construtor padrão
    public Invoice() {
    }

    // Construtor com parâmetros para inicializar o pagamento básico e o imposto
    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    // Método para obter o pagamento básico
    public Double getBasicPayment() {
        return basicPayment;
    }

    // Método para definir o pagamento básico
    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    // Método para obter o imposto
    public Double getTax() {
        return tax;
    }

    // Método para definir o imposto
    public void setTax(Double tax) {
        this.tax = tax;
    }

    // Método para calcular o pagamento total (pagamento básico + imposto)
    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }
}