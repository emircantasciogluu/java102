package inheritance;

public class InformationTechnology extends Officer {
    private String duty;

    public InformationTechnology(String fullName, String phone, String email,
                                 String department, String shift, String duty) {
        super(fullName, phone, email, department, shift);
        this.duty = duty;
    }

    public void setupNetwork() {
        System.out.println(getFullName() + " is setting up the network.");
    }

    public String getDuty() { return duty; }
    public void setDuty(String duty) { this.duty = duty; }
}