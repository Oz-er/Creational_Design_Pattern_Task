package Part_B;

import Part_D.QuestionSource;

public class TrueFalseFactory implements QuestionFactory {

    private final QuestionSource source;

    public TrueFalseFactory(QuestionSource source) {
        this.source = source;
    }

    public Question createQuestion() {
        return source.getQuestion("TrueFalse");
    }

    public QuestionRenderer createRenderer() {
        return new TrueFalseRenderer();
    }

    public QuestionEvaluator createEvaluator() {
        return new TrueFalseEvaluator();
    }
}
