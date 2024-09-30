public class Person {
    private String fullName;
    private int birthYear;

    public Person(String fullName, int birthYear) {
        this.fullName = fullName;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return fullName + " - " + birthYear;
    }
}