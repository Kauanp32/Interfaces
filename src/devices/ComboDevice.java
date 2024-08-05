package devices;

// A classe ComboDevice está definida dentro do pacote 'devices'
public class ComboDevice extends Device implements Scanner, Printer {

    // Construtor da classe ComboDevice que aceita um número de série como argumento
    public ComboDevice(String serialNumber) {
        // Chama o construtor da superclasse (Device) passando o número de série
        super(serialNumber);
    }

    // Implementação do método 'print' da interface 'Printer'
    @Override
    public void print(String doc) {
        // Imprime uma mensagem no console indicando que o documento está sendo impresso
        System.out.println("Combo printing: " + doc);
    }

    // Implementação do método 'scan' da interface 'Scanner'
    @Override
    public String scan() {
        // Retorna uma string indicando o resultado da digitalização
        return "Combo scan result";
    }

    // Implementação do método 'processDoc' da classe 'Device'
    @Override
    public void processDoc(String doc) {
        // Imprime uma mensagem no console indicando que o documento está sendo processado
        System.out.println("Combo processing: " + doc);
    }
}