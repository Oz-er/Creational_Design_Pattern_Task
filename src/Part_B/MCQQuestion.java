package Part_B;

public class MCQQuestion implements Question {
    private final String text;
    private final int points;
    private final String difficulty;

    public MCQQuestion(String text, int points, String difficulty) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
    }

    public String getType() {
        return "MCQ";
    }

    public String getText() {
        return text;
    }

    public int getPoints() {
        return points;
    }

    public String getDifficulty() {
        return difficulty;
    }
}