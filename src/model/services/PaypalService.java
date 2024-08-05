package model.services;

public class PaypalService implements OnlinePaymentService {

    private static final double FEE_PERCENTAGE = 0.02; // Percentual de taxa de pagamento
    private static final double MONTHLY_INTEREST = 0.01; // Percentual de juros mensal

    // Calcula a taxa de pagamento com base no valor fornecido
    @Override
    public double paymentFee(double amount) {
        return amount * FEE_PERCENTAGE; // Retorna a taxa como percentual do valor
    }

    // Calcula os juros com base no valor e no número de meses
    @Override
    public double interest(double amount, int months) {
        return amount * MONTHLY_INTEREST * months; // Retorna o total de juros
    }
}