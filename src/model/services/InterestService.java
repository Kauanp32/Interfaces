package model.services;

import java.security.InvalidParameterException; // Importa a exceção para parâmetros inválidos

public interface InterestService {

    // Método para obter a taxa de juros
    double getInterestRate();

    // Método padrão para calcular o pagamento com base no valor e no número de meses
    default double payment(double amount, int months) {
        if (months < 1) { // Verifica se o número de meses é menor que 1
            throw new InvalidParameterException("Months must be greater than zero"); // Lança exceção se o número de meses for inválido
        }
        // Calcula o pagamento utilizando a fórmula de juros compostos
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}