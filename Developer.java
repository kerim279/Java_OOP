public class Developer extends Employee implements Reportable{
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage){
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus(){
        return getSalary() * 0.20;
    }

    @Override
    public String generateReport(){
        return "Developer Report - Name: " + getName() +
                ", Salary: " + getSalary() +
                ", Language: " + programmingLanguage +
                ", Bonus: " + calculateBonus();
    }
}
