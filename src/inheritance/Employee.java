package inheritance;

public abstract class Employee {
    private String fullName;
    private String phone;
    private String email;

    public Employee(String fullName, String phone, String email) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
    }

    public void enter() {
        System.out.println(this.fullName + " entered the university!");
    }

    public void exit() {
        System.out.println(this.fullName + " exited the university!");
    }

    public void cafeteria() {
        System.out.println(this.fullName + " entered the cafeteria!");
    }

    // Getters / Setters
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}