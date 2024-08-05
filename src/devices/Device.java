package devices;

// Definição da classe abstrata 'Device' no pacote 'devices'
public abstract class Device {

    // Atributo público que armazena o número de série do dispositivo
    public String serialNumber;

    // Construtor da classe 'Device' que inicializa o número de série do dispositivo
    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Método getter para obter o número de série do dispositivo
    public String getSerialNumber() {
        return serialNumber;
    }

    // Método setter para definir o número de série do dispositivo
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Método abstrato que deve ser implementado pelas subclasses de 'Device'
    public abstract void processDoc(String doc);
}