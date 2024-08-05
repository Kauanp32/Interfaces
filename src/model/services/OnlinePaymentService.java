package model.services;

public interface OnlinePaymentService {

    // Método para calcular a taxa de pagamento com base no valor fornecido
    double paymentFee(double amount);

    // Método para calcular os juros com base no valor e no número de meses
    double interest(double amount, int months);
}