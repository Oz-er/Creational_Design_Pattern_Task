package Part_B;

public class EssayEvaluator implements QuestionEvaluator {
    public int evaluate(Question question, String answer) {
        if (answer.length() >= 20) {
            return question.getPoints();
        }
        return 0;
    }
}
