package model.services;

public class BrazilInterestService implements InterestService {

    private double interestRate; // Atributo para armazenar a taxa de juros

    // Construtor para inicializar a taxa de juros
    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    // Implementa o método da interface InterestService para obter a taxa de juros
    @Override
    public double getInterestRate() {
        return interestRate; // Retorna a taxa de juros
    }
}