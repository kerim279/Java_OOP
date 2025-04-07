public class Professor extends Person_Class{
    private String employeeId;
    private String department;

    public Professor (String name, String email, int birthYear, String employeeId, String department){
        super(name, email, birthYear);
        this.employeeId = employeeId;
        this.department = department;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + ", Employee ID: " + employeeId + ", Department: " + department;
    }

    public static void main(String[] args) {
        Professor muradif = new Professor("Muradif", "muradif_profa@gmail.com", 1978, "P76342251", "Menagment");

        muradif.setEmail("muraif_profa_novi@gmail.com");

        System.out.println(muradif.getName());
        System.out.println(muradif.getEmail());
        System.out.println(muradif.getAge(2025));
        System.out.println(muradif.department);
    }
}
