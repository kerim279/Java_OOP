public class Menager extends Employee implements Reportable{
    private String teamSize;

    public Menager(String name, double salary, String teamSize){
        super(name, salary);
        this.teamSize = teamSize;
    }

    public String getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(String teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus(){
        return getSalary() * 0.30;
    }

    @Override
    public String generateReport(){
        return "Manager Report - Name: " + getName() +
                ", Salary: " + getSalary() +
                ", Team Size: " + teamSize +
                ", Bonus: " + calculateBonus();
    }
}
