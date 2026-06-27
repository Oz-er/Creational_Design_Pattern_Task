package Part_D;

import Part_B.Question;

public class FakerQuestionSource implements QuestionSource {

    private final QuestionFaker faker;

    public FakerQuestionSource() {
        this.faker = new QuestionFaker();
    }

    @Override
    public Question getQuestion(String type) {
        return faker.generateQuestion(type);
    }

    @Override
    public String getSourceName() {
        return "Auto/Faker Mode";
    }
}