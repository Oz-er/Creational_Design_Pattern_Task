package Part_D;

import Part_B.Question;

public interface QuestionSource {
    Question getQuestion(String type);

    String getSourceName();
}
