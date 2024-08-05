package Interfaces;

import java.io.BufferedReader; // Importa a classe BufferedReader para ler arquivos
import java.io.FileReader; // Importa a classe FileReader para ler arquivos de texto
import java.io.IOException; // Importa a classe IOException para tratar erros de entrada/saída
import java.util.ArrayList; // Importa a classe ArrayList para armazenar a lista de empregados
import java.util.Collections; // Importa a classe Collections para ordenar a lista
import java.util.List; // Importa a interface List para trabalhar com listas
import model.entities.Employee; // Importa a classe Employee do pacote model.entities

public class text {

    public static void main(String[] args) {
        // Cria uma lista para armazenar os objetos Employee
        List<Employee> list = new ArrayList<>();
        
        // Define o caminho do arquivo a ser lido
        String path = "C:\\temp\\in.txt";
        
        // Tenta abrir o arquivo e ler seu conteúdo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // Lê a primeira linha do arquivo
            String employeeCsv = br.readLine();
            
            // Continua lendo linhas enquanto houver linhas no arquivo
            while (employeeCsv != null) {
                // Divide a linha em campos usando a vírgula como delimitador
                String[] fields = employeeCsv.split(",");
                
                // Cria um novo objeto Employee e adiciona à lista
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                
                // Lê a próxima linha do arquivo
                employeeCsv = br.readLine();
            }
            
            // Ordena a lista de empregados (assumindo que Employee implementa Comparable)
            Collections.sort(list);
            
            // Imprime os detalhes de cada empregado
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e) {
            // Trata exceções relacionadas à leitura do arquivo
            System.out.println("Error: " + e.getMessage());
        }
    }
}