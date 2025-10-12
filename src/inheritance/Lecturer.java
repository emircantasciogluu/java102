package inheritance;

public class Lecturer extends Academician {
    private String doorNumber;

    public Lecturer(String fullName, String phone, String email,
                    String department, String title, String doorNumber) {
        super(fullName, phone, email, department, title);
        this.doorNumber = doorNumber;
    }

    public void attendSenateMeeting() {
        System.out.println(getFullName() + " is attending the senate meeting.");
    }

    public void makeExam() {
        System.out.println(getFullName() + " is administering an exam.");
    }

    public String getDoorNumber() { return doorNumber; }
    public void setDoorNumber(String doorNumber) { this.doorNumber = doorNumber; }
}