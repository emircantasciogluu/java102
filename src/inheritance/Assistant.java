package inheritance;

public class Assistant extends Academician {
    private String officeHour;

    public Assistant(String fullName, String phone, String email,
                     String department, String title, String officeHour) {
        super(fullName, phone, email, department, title);
        this.officeHour = officeHour;
    }

    public void makeQuiz() {
        System.out.println(getFullName() + " is making a quiz.");
    }

    public String getOfficeHour() { return officeHour; }
    public void setOfficeHour(String officeHour) { this.officeHour = officeHour; }
}