package model.entities;

import model.enums.Color; // Importa a enum Color do pacote model.enums

public abstract class AbstractShape implements Shape {

    private Color color; // Atributo para armazenar a cor da forma

    // Construtor para inicializar a cor da forma
    public AbstractShape(Color color) {
        this.color = color;
    }

    // Método para obter a cor da forma
    public Color getColor() {
        return color;
    }

    // Método para definir a cor da forma
    public void setColor(Color color) {
        this.color = color;
    }
}