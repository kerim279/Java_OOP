public class MainClass {
    public static void main(String[] args) {
        UniversityPerson student = new Student("Kerim", 2005, "S987654", "IT");
        UniversityPerson professor = new Professor("Dr. Smith", 1980, "P123456", "Computer Science");
        UniversityPerson staff = new Staff("John Doe", 1990, "STF987", "Admin");

        UniversityPrinter printer = new UniversityPrinter();

        System.out.println("Student Details: ");
        printer.printDetails(student, 2025);
        System.out.println();

        System.out.println("Professor Details: ");
        printer.printDetails(professor, 2025);
        System.out.println();

        System.out.println("Staff Details: ");
        printer.printDetails(staff, 2025);
        System.out.println();
    }
}
