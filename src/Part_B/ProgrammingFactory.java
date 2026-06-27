package Part_B;

import Part_D.QuestionSource;

public class ProgrammingFactory implements QuestionFactory {

    private final QuestionSource source;

    public ProgrammingFactory(QuestionSource source) {
        this.source = source;
    }

    public Question createQuestion() {
        return source.getQuestion("Programming");
    }

    public QuestionRenderer createRenderer() {
        return new ProgrammingRenderer();
    }

    public QuestionEvaluator createEvaluator() {
        return new ProgrammingEvaluator();
    }
}
