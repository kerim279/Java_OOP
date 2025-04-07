public class Student extends Person_Class{
    private String studentId;
    private String major;

    public Student(String name, String email, int birthYear, String studentId, String major){
        super(name, email, birthYear);
        this.studentId = studentId;
        this.major = major;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public String getStudentId(){
        return studentId;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor(){
        return major;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + ", Student ID: " + studentId + ", Major: " + major;
    }

    public static void main(String[] args) {
        Student ibrahim = new Student("Ibrahim", "ibrahim@google.com", 2000, "S158823", "Software Engeneering");
        ibrahim.getName();
        ibrahim.getEmail();
        ibrahim.getBirthYear();
        ibrahim.setStudentId("S5988231");

        System.out.println("Name:" + ibrahim.getName());
        System.out.println("Email: " + ibrahim.getEmail());
        System.out.println("Year of birth: " + ibrahim.getBirthYear());
        System.out.println(ibrahim.studentId);


        int currentYear = 2025;
        System.out.println("Age: " + ibrahim.getAge(currentYear));

    }
}
