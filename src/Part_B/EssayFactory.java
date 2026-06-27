package Part_B;

import Part_D.QuestionSource;

public class EssayFactory implements QuestionFactory {

    private final QuestionSource source;

    public EssayFactory(QuestionSource source) {
        this.source = source;
    }

    public Question createQuestion() {
        return source.getQuestion("Essay");
    }

    public QuestionRenderer createRenderer() {
        return new EssayRenderer();
    }

    public QuestionEvaluator createEvaluator() {
        return new EssayEvaluator();
    }
}
