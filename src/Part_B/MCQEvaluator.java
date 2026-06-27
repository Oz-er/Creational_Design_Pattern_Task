package Part_B;

public class MCQEvaluator implements QuestionEvaluator {
    public int evaluate(Question question, String answer) {
        if (answer.equalsIgnoreCase("A")) {
            return question.getPoints();
        }
        return 0;
    }
}
