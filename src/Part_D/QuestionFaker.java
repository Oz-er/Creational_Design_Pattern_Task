package Part_D;

import Part_B.*;

public class QuestionFaker {

    public Question generateQuestion(String type) {
        if (type.equalsIgnoreCase("MCQ")) {
            return new MCQQuestion("Auto-generated MCQ about Java design patterns.", 2, "Medium");
        }

        if (type.equalsIgnoreCase("Essay")) {
            return new EssayQuestion("Auto-generated essay question about OOP principles.", 10, "Hard");
        }

        if (type.equalsIgnoreCase("Programming")) {
            return new ProgrammingQuestion("Auto-generated programming task: build a class using encapsulation.", 20, "Hard");
        }

        if (type.equalsIgnoreCase("TrueFalse")) {
            return new TrueFalseQuestion("Auto-generated statement: Interfaces support abstraction.", 1, "Easy");
        }

        throw new IllegalArgumentException("Unknown question type: " + type);
    }
}