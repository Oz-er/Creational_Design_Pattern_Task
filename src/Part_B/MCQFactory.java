package Part_B;

import Part_D.QuestionSource;

public class MCQFactory implements QuestionFactory {

    private final QuestionSource source;

    public MCQFactory(QuestionSource source){
        this.source = source;
    }


    public Question createQuestion() {
        return source.getQuestion("MCQ");
    }

    public QuestionRenderer createRenderer() {
        return new MCQRenderer();
    }

    public QuestionEvaluator createEvaluator() {
        return new MCQEvaluator();
    }
}
