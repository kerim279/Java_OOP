public class UniversityPrinter {
    public void printDetails(UniversityPerson person, int currentYear){
        System.out.println(person.toString());
        System.out.println("Role: " + person.getRole());
        System.out.println("Age: " + person.getAge(2025));

        if (person instanceof Student){
            Student student = (Student)person;
            System.out.println(student.getStudentInfo());
        } else if (person instanceof Professor){
            Professor professor = (Professor) person;
            System.out.println(professor.getProfessorInfo());
        } else if (person instanceof Staff) {
            Staff staff = (Staff) person;
            System.out.println(staff.getStaffInfo());
        }
    }
}
