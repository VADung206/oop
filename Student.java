public class Student extends Person {
    private String studentId;

    public Student(String fullName, int birthYear, String studentId) {
        super(fullName, birthYear);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + studentId;
    }
}