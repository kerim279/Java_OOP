public class Person_Class {
    private String name;
    private String email;
    private int birthYear;
    private int currentYear;

    public Person_Class(String name, String email, int birthYear) {
        this.name = name;
        this.email = email;
        this.birthYear = birthYear;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public int getAge(int currentYear){
        return currentYear - birthYear;
    }

    public String getInfo(){
      return "Name: " + name + ", Email: " + email + ", Age: " + getAge(2025);
    }

    public static void main(String[] args) {
        Person_Class[] people = new Person_Class[2];

        people[0] = new Student("Ibrahim", "ibrahim@google.com", 2000, "S158823", "Software Engeneering");
        people[1] = new Professor("Muradif", "muradif_profa@gmail.com", 1978, "P76342251", "Menagment");

        for(Person_Class person : people) {
            System.out.println(person.getInfo());
        }
    }
}
