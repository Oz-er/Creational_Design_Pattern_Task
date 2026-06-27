package Part_A;

public class MidtermExam implements Exam {

    public String getType() {
        return "Midterm Exam";
    }

    public void displayInfo() {
        System.out.println("Type: " + getType());
        System.out.println("Single attempt, strict time limit, comprehensive rules.");
    }

}
