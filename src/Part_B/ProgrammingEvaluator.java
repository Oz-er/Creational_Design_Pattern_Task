package Part_B;

public class ProgrammingEvaluator implements QuestionEvaluator {
    public int evaluate(Question question, String answer) {
        if (answer.contains("class")) {
            return question.getPoints();
        }
        return 0;
    }
}
