package Part_A;

public class FinalExam implements Exam {
    public String getType() {
        return "Final Exam";
    }

    public void displayInfo() {
        System.out.println("Type: " + getType());
        System.out.println("High security, high stakes, final assessment.");
    }
}
