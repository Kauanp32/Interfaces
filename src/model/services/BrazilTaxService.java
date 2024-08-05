package model.services;

public class BrazilTaxService implements TaxService {

    // Calcula o imposto com base no valor fornecido
    @Override
    public double tax(double amount) {
        if (amount <= 100.0) { // Se o valor for menor ou igual a 100
            return amount * 0.2; // Aplica uma taxa de imposto de 20%
        } else { // Se o valor for maior que 100
            return amount * 0.15; // Aplica uma taxa de imposto de 15%
        }
    }
}