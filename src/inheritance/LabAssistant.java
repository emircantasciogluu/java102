package inheritance;

public class LabAssistant extends Assistant {

    public LabAssistant(String fullName, String phone, String email,
                        String department, String title, String officeHour) {
        super(fullName, phone, email, department, title, officeHour);
    }

    public void enterLab() {
        System.out.println(getFullName() + " entered the laboratory.");
    }

    public void teachLab() {
        System.out.println(getFullName() + " is teaching in the laboratory.");
    }
}