package Part_C;

public class ExamBuilder {

    private String title;
    private int duration;
    private int passingScore;
    private boolean negativeMarking;
    private boolean questionShuffle;
    private boolean autoSubmit;
    private boolean calculatorAllowed;

    public ExamBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ExamBuilder setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public ExamBuilder setPassingScore(int passingScore) {
        this.passingScore = passingScore;
        return this;
    }

    public ExamBuilder enableNegativeMarking() {
        this.negativeMarking = true;
        return this;
    }

    public ExamBuilder enableQuestionShuffle() {
        this.questionShuffle = true;
        return this;
    }

    public ExamBuilder enableAutoSubmit() {
        this.autoSubmit = true;
        return this;
    }

    public ExamBuilder allowCalculator() {
        this.calculatorAllowed = true;
        return this;
    }

    public ExamConfiguration build() {

        return new ExamConfiguration(
                title,
                duration,
                passingScore,
                negativeMarking,
                questionShuffle,
                autoSubmit,
                calculatorAllowed
        );
    }
}