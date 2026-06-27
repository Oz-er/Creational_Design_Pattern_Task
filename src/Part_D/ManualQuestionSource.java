package Part_D;

import Part_B.*;

public class ManualQuestionSource implements QuestionSource {

    @Override
    public Question getQuestion(String type) {
        if (type.equalsIgnoreCase("MCQ")) {
            return new MCQQuestion("What is Factory Method?", 2, "Medium");
        }

        if (type.equalsIgnoreCase("Essay")) {
            return new EssayQuestion("Explain Abstract Factory Pattern.", 10, "Hard");
        }

        if (type.equalsIgnoreCase("Programming")) {
            return new ProgrammingQuestion("Write Java code for Builder Pattern.", 20, "Hard");
        }

        if (type.equalsIgnoreCase("TrueFalse")) {
            return new TrueFalseQuestion("Builder helps avoid constructor bloat.", 1, "Easy");
        }

        throw new IllegalArgumentException("Unknown question type: " + type);
    }

    @Override
    public String getSourceName() {
        return "Manual Mode";
    }
}