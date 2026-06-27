package Part_B;

public class TrueFalseEvaluator implements QuestionEvaluator {
    public int evaluate(Question question, String answer) {
        if (answer.equalsIgnoreCase("true")) {
            return question.getPoints();
        }
        return 0;
    }
}
