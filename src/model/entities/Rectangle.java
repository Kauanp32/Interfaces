package model.entities;

import model.enums.Color; // Importa a enum Color do pacote model.enums

public class Rectangle extends AbstractShape {

    private Double width; // Atributo para armazenar a largura do retângulo
    private Double height; // Atributo para armazenar a altura do retângulo

    // Construtor para inicializar a cor, largura e altura do retângulo
    public Rectangle(Color color, Double width, Double height) {
        super(color); // Chama o construtor da classe pai AbstractShape para inicializar a cor
        this.width = width;
        this.height = height;
    }

    // Método para obter a largura do retângulo
    public Double getWidth() {
        return width;
    }

    // Método para definir a largura do retângulo
    public void setWidth(Double width) {
        this.width = width;
    }

    // Método para obter a altura do retângulo
    public Double getHeight() {
        return height;
    }

    // Método para definir a altura do retângulo
    public void setHeight(Double height) {
        this.height = height;
    }

    // Implementa o método area da classe abstrata para calcular a área do retângulo
    @Override
    public double area() {
        return width * height;
    }
}