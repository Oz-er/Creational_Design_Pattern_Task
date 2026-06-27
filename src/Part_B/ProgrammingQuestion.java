package Part_B;

public class ProgrammingQuestion implements Question {
    private final String text;
    private final int points;
    private final String difficulty;

    public ProgrammingQuestion(String text, int points, String difficulty) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
    }

    public String getType() {
        return "Programming";
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
