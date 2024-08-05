package model.entities;

import model.enums.Color; // Importa a enum Color do pacote model.enums

public class Circle extends AbstractShape {

    private Double radius; // Atributo para armazenar o raio do círculo

    // Construtor para inicializar a cor e o raio do círculo
    public Circle(Color color, Double radius) {
        super(color); // Chama o construtor da classe pai AbstractShape para inicializar a cor
        this.radius = radius;
    }

    // Método para obter o raio do círculo
    public Double getRadius() {
        return radius;
    }

    // Método para definir o raio do círculo
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    // Implementa o método area da classe abstrata para calcular a área do círculo
    @Override
    public double area() {
        return Math.PI * radius * radius; // Fórmula para calcular a área do círculo
    }
}