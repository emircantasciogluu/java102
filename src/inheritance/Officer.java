package inheritance;

public class Officer extends Employee {
    private String department;
    private String shift; // (mesai)

    public Officer(String fullName, String phone, String email,
                   String department, String shift) {
        super(fullName, phone, email);
        this.department = department;
        this.shift = shift;
    }

    public void work() {
        System.out.println(getFullName() + " is performing officer duties.");
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getShift() { return shift; }
    public void setShift(String shift) { this.shift = shift; }
}