package Part_D;

import Part_B.Question;

public class BankQuestionSource implements QuestionSource {

    private final QuestionBank questionBank;

    public BankQuestionSource() {
        this.questionBank = new QuestionBank();
    }

    @Override
    public Question getQuestion(String type) {
        return questionBank.getRandomQuestion(type);
    }

    @Override
    public String getSourceName() {
        return "Question Bank Mode";
    }
}