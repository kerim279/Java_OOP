public class Student extends UniversityPerson{
    private String studentId;
    private String major;

    public Student(String name, int birthYear, String studentId, String major){
        super(name, birthYear);
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getRole(){
        return "Student";
    }

    public String getStudentInfo(){
        return getName() + " studies " + major;
    }
}
