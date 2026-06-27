package Part_D;

import Part_B.*;

import java.util.Random;

public class QuestionBank {

    private final Random random = new Random();

    private final Question[] mcqQuestions = {
            new MCQQuestion("Which pattern creates one product through subclasses?", 2, "Medium"),
            new MCQQuestion("Which pattern creates families of related objects?", 2, "Easy")
    };

    private final Question[] essayQuestions = {
            new EssayQuestion("Explain Factory Method with an example.", 10, "Hard"),
            new EssayQuestion("Compare Factory Method and Abstract Factory.", 10, "Hard")
    };

    private final Question[] programmingQuestions = {
            new ProgrammingQuestion("Implement an immutable class in Java.", 20, "Hard"),
            new ProgrammingQuestion("Implement a simple builder in Java.", 20, "Medium")
    };

    private final Question[] trueFalseQuestions = {
            new TrueFalseQuestion("Abstract Factory contains multiple factory methods.", 1, "Easy"),
            new TrueFalseQuestion("Factory Method always creates product families.", 1, "Medium")
    };

    public Question getRandomQuestion(String type) {
        if (type.equalsIgnoreCase("MCQ")) {
            return mcqQuestions[random.nextInt(mcqQuestions.length)];
        }

        if (type.equalsIgnoreCase("Essay")) {
            return essayQuestions[random.nextInt(essayQuestions.length)];
        }

        if (type.equalsIgnoreCase("Programming")) {
            return programmingQuestions[random.nextInt(programmingQuestions.length)];
        }

        if (type.equalsIgnoreCase("TrueFalse")) {
            return trueFalseQuestions[random.nextInt(trueFalseQuestions.length)];
        }

        throw new IllegalArgumentException("Unknown question type: " + type);
    }
}