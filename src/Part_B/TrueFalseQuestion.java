package Part_B;

public class TrueFalseQuestion implements Question {
    private final String text;
    private final int points;
    private final String difficulty;

    public TrueFalseQuestion(String text, int points, String difficulty) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
    }

    public String getType() {
        return "True/False";
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
