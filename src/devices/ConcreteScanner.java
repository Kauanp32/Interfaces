package devices;

// A classe ConcreteScanner estende Device e implementa Scanner
public class ConcreteScanner extends Device implements Scanner {

    // Construtor da classe ConcreteScanner que recebe o número de série
    public ConcreteScanner(String serialNumber) {
        // Chama o construtor da superclasse Device
        super(serialNumber);
    }

    // Implementação do método abstrato processDoc da classe Device
    @Override
    public void processDoc(String doc) {
        // Imprime uma mensagem indicando que o documento está sendo processado pelo scanner
        System.out.println("Scanner processing: " + doc);
    }

    // Implementação do método scan da interface Scanner
    @Override
    public String scan() {
        // Retorna uma string indicando o conteúdo digitalizado
        return "Scanned content";
    }
}