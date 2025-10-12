package inheritance;

public class Academician extends Employee {
    private String department;
    private String title;

    public Academician(String fullName, String phone, String email,
                       String department, String title) {
        super(fullName, phone, email);
        this.department = department;
        this.title = title;
    }

    public void enterClass() {
        System.out.println(getFullName() + " entered the class.");
    }

    @Override
    public void enter() {
        System.out.println(getFullName() + " (academician) has entered.");
    }

    // Getters / Setters
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}