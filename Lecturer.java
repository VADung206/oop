public class Lecturer extends Person {
    private String subject;

    public Lecturer(String fullName, int birthYear, String subject) {
        super(fullName, birthYear);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + subject;
    }
}