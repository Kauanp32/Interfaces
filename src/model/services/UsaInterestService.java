package model.services;

public class UsaInterestService implements InterestService {

    private double interestRate; // Atributo para armazenar a taxa de juros

    // Construtor para inicializar a taxa de juros
    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    // Implementa o método da interface InterestService para obter a taxa de juros
    @Override
    public double getInterestRate() {
        return interestRate;
    }
}