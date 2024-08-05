package model.entities;

public class Vehicle {

    private String model; // Atributo para armazenar o modelo do veículo

    // Construtor padrão
    public Vehicle() {
    }

    // Construtor com parâmetro para inicializar o modelo do veículo
    public Vehicle(String model) {
        this.model = model;
    }

    // Método para obter o modelo do veículo
    public String getModel() {
        return model;
    }

    // Método para definir o modelo do veículo
    public void setModel(String model) {
        this.model = model;
    }
}