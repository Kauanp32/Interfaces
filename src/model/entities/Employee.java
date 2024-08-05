package model.entities;

public class Employee implements Comparable<Employee> {
    private String name; // Atributo para armazenar o nome do empregado
    private Double salary; // Atributo para armazenar o salário do empregado

    // Construtor para inicializar o nome e o salário do empregado
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Método para obter o nome do empregado
    public String getName() {
        return name;
    }

    // Método para definir o nome do empregado
    public void setName(String name) {
        this.name = name;
    }

    // Método para obter o salário do empregado
    public Double getSalary() {
        return salary;
    }

    // Método para definir o salário do empregado
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Implementa o método compareTo para comparar empregados pelo nome
    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}