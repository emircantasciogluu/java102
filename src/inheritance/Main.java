package inheritance;

public class Main {
    public static void main(String[] args) {
        Lecturer lec = new Lecturer(
                "Dr. Jane Smith", "555-111-2222", "jane@uni.edu",
                "Computer Engineering", "Lecturer", "A-203"
        );

        Assistant asst = new Assistant(
                "John Doe", "555-222-3333", "john@uni.edu",
                "Computer Engineering", "Research Assistant", "Mon 14:00-16:00"
        );

        LabAssistant labAsst = new LabAssistant(
                "Alice Brown", "555-333-4444", "alice@uni.edu",
                "Computer Engineering", "Lab Assistant", "Wed 10:00-12:00"
        );

        InformationTechnology it = new InformationTechnology(
                "Mark Green", "555-444-5555", "mark@uni.edu",
                "IT Department", "08:00-17:00", "Network Maintenance"
        );

        SecurityOfficer sec = new SecurityOfficer(
                "Luke Gray", "555-555-6666", "luke@uni.edu",
                "Security", "Night Shift", "Armed Security Certificate"
        );

        lec.enter();
        lec.attendSenateMeeting();
        lec.makeExam();
        lec.enterClass();

        asst.enter();
        asst.makeQuiz();

        labAsst.enter();
        labAsst.enterLab();
        labAsst.teachLab();

        it.enter();
        it.work();
        it.setupNetwork();

        sec.enter();
        sec.work();
        sec.standWatch();

        lec.cafeteria();
        asst.exit();
    }
}