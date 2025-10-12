package inheritance;

public class SecurityOfficer extends Officer {
    private String certificate;

    public SecurityOfficer(String fullName, String phone, String email,
                           String department, String shift, String certificate) {
        super(fullName, phone, email, department, shift);
        this.certificate = certificate;
    }

    public void standWatch() {
        System.out.println(getFullName() + " is standing watch.");
    }

    public String getCertificate() { return certificate; }
    public void setCertificate(String certificate) { this.certificate = certificate; }
}