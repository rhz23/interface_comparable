package entities;

public class Employee implements Comparable<Employee>{

    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    //Não é permitido configurar o salário do funcionário pelo método set
    //public void setSalary(Double salary) {
    //    this.salary = salary;
    //}

    public void aumentarSalario(Double percent){
        this.salary += this.salary * percent / 100;
    }

    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
        // se quiser comparar por salario é só trocar o name e o .getName por salary e getSalary
    }
}
