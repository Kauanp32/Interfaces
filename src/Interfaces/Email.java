package Interfaces;

import devices.ComboDevice; // Importa a classe ComboDevice do pacote devices
import devices.ConcretePrinter; // Importa a classe ConcretePrinter do pacote devices
import devices.ConcreteScanner; // Importa a classe ConcreteScanner do pacote devices

public class Email {

    public static void main(String[] args) {

        // Cria uma instância de ConcretePrinter com número de série "1080"
        ConcretePrinter p = new ConcretePrinter("1080");
        // Processa o documento usando o método processDoc da impressora
        p.processDoc("My Letter");
        // Imprime o documento usando o método print da impressora
        p.print("My Letter");

        // Imprime uma linha em branco para separar as saídas
        System.out.println();
        
        // Cria uma instância de ConcreteScanner com número de série "2003"
        ConcreteScanner s = new ConcreteScanner("2003");
        // Processa o documento usando o método processDoc do scanner
        s.processDoc("My Email");
        // Obtém o resultado do scan e o imprime
        System.out.println("Scan result: " + s.scan());
        
        // Imprime uma linha em branco para separar as saídas
        System.out.println();
        
        // Cria uma instância de ComboDevice com número de série "2081"
        ComboDevice c = new ComboDevice("2081");
        // Processa o documento usando o método processDoc do ComboDevice
        c.processDoc("My dissertation");
        // Imprime o documento usando o método print do ComboDevice
        c.print("My dissertation");
        // Obtém o resultado do scan e o imprime
        System.out.println("Scan result: " + c.scan());
    }
}