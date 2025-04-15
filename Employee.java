public abstract class Employee implements Reportable{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract double calculateBonus();

    public String getDetails(){
        return "Name: " + name + ", Salary: " + salary;
    }
}
