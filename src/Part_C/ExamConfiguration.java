package Part_C;

public class ExamConfiguration {


    private final String title;
    private final int duration;
    private final int passingScore;
    private final boolean negativeMarking;
    private final boolean questionShuffle;
    private final boolean autoSubmit;
    private final boolean calculatorAllowed;

    public ExamConfiguration(
            String title,
            int duration,
            int passingScore,
            boolean negativeMarking,
            boolean questionShuffle,
            boolean autoSubmit,
            boolean calculatorAllowed) {

        this.title = title;
        this.duration = duration;
        this.passingScore = passingScore;
        this.negativeMarking = negativeMarking;
        this.questionShuffle = questionShuffle;
        this.autoSubmit = autoSubmit;
        this.calculatorAllowed = calculatorAllowed;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getPassingScore() {
        return passingScore;
    }

    public boolean hasNegativeMarking() {
        return negativeMarking;
    }

    public boolean hasQuestionShuffle() {
        return questionShuffle;
    }

    public boolean hasAutoSubmit() {
        return autoSubmit;
    }

    public boolean isCalculatorAllowed() {
        return calculatorAllowed;
    }

    public void displayConfiguration() {

        System.out.println("======================================");
        System.out.println("Exam Configuration");
        System.out.println("======================================");

        System.out.println("Title               : " + title);
        System.out.println("Duration            : " + duration + " minutes");
        System.out.println("Passing Score       : " + passingScore);

        System.out.println("Negative Marking    : " + negativeMarking);
        System.out.println("Question Shuffle    : " + questionShuffle);
        System.out.println("Auto Submit         : " + autoSubmit);
        System.out.println("Calculator Allowed  : " + calculatorAllowed);

        System.out.println("======================================");
    }
}