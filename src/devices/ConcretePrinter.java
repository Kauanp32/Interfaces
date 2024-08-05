package devices;

// A classe ConcretePrinter estende Device e implementa Printer
public class ConcretePrinter extends Device implements Printer {

    // Construtor da classe ConcretePrinter que recebe o número de série
    public ConcretePrinter(String serialNumber) {
        // Chama o construtor da superclasse Device
        super(serialNumber);
    }

    // Implementação do método abstrato processDoc da classe Device
    @Override
    public void processDoc(String doc) {
        // Imprime uma mensagem indicando que o documento está sendo processado pela impressora
        System.out.println("Printer processing: " + doc);
    }

    // Implementação do método print da interface Printer
    @Override
    public void print(String doc) {
        // Imprime uma mensagem indicando que o documento está sendo impresso
        System.out.println("Printing: " + doc);
    }
}