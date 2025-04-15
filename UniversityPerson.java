public class UniversityPerson {
    private String name;
    private int birthYear;

    public UniversityPerson(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getRole(){
        return "University Person";
    }

    public int getAge(int currentYear){
        return currentYear - birthYear;
    }

    @Override
    public String toString(){
        return name + "(born " + birthYear + ")";
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj instanceof UniversityPerson){
            UniversityPerson person = (UniversityPerson) obj;
            return this.name.equals(person.getName()) && this.birthYear == person.birthYear;
        }
        return false;
    }
}
