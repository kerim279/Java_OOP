public class Professor extends UniversityPerson{
    private String employeeId;
    private String department;

    public Professor(String name, int birthYear, String employeeId, String department){
        super(name, birthYear);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getRole(){
        return "Professor";
    }

    public String getProfessorInfo(){
        return "Prof. " + getName() + " teaches in " + department;
    }

}
