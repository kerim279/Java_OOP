public class Staff extends UniversityPerson{
    private String staffId;
    private String role;

    public Staff(String name, int birthYear, String StaffId, String role){
        super(name, birthYear);
        this.staffId = StaffId;
        this.role = role;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getRole(){
        return "Staff";
    }

    public String getStaffInfo(){
        return getName() + " works as " + role;
    }
}
