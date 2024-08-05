package Interfaces;

import model.entities.AbstractShape; // Importa a classe AbstractShape do pacote model.entities
import model.entities.Circle; // Importa a classe Circle do pacote model.entities
import model.entities.Rectangle; // Importa a classe Rectangle do pacote model.entities
import model.enums.Color; // Importa a enum Color do pacote model.enums

public class Formatos {

    public static void main(String[] args) {

        // Cria um objeto Circle com cor preta e raio 2.0
        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        
        // Cria um objeto Rectangle com cor branca e dimensões 3.0 x 4.0
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
        
        // Imprime a cor do círculo
        System.out.println("Circle color: " + s1.getColor());
        
        // Imprime a área do círculo formatada com três casas decimais
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        
        // Imprime a cor do retângulo
        System.out.println("Rectangle color: " + s2.getColor());
        
        // Imprime a área do retângulo formatada com três casas decimais
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
    }
}