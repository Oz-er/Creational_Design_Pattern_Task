package Part_A;

public class PracticeQuiz implements Exam {

    public String getType() {
        return "Practice Quiz";
    }

    public void displayInfo() {
        System.out.println("Type: " + getType());
        System.out.println("Unlimited attempts, low stakes, short duration.");
    }


}
