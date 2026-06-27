import Part_A.Exam;
import Part_A.ExamFactory;
import Part_A.MidtermExamFactory;
import Part_B.EssayFactory;
import Part_B.MCQFactory;
import Part_B.ProgrammingFactory;
import Part_B.Question;
import Part_B.QuestionFactory;
import Part_B.TrueFalseFactory;
import Part_C.ExamBuilder;
import Part_C.ExamConfiguration;
import Part_D.BankQuestionSource;
import Part_D.QuestionSource;

public class Main {
    public static void main(String[] args) {
        // Step 1: Pick the foundational exam format.
        ExamFactory examFactory = new MidtermExamFactory();
        Exam exam = examFactory.createExam();

        // Step 2: Pick the active sourcing strategy.
        QuestionSource source = new BankQuestionSource();

        // Step 3: Feed the source strategy into the abstract factories.
        QuestionFactory[] questionFactories = {
                new MCQFactory(source),
                new MCQFactory(source),
                new EssayFactory(source),
                new ProgrammingFactory(source),
                new TrueFalseFactory(source)
        };

        // Step 4: Build the runtime exam configuration.
        ExamConfiguration configuration = new ExamBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .enableNegativeMarking()
                .enableQuestionShuffle()
                .enableAutoSubmit()
                .build();

        // Step 5: Generate the structural question components.
        Question[] questions = new Question[questionFactories.length];
        for (int i = 0; i < questionFactories.length; i++) {
            questions[i] = questionFactories[i].createQuestion();
        }

        // Step 6: Print the unified dashboard.
        printDashboard(exam, configuration, source.getSourceName(), questions);
    }

    private static void printDashboard(
            Exam exam,
            ExamConfiguration configuration,
            String sourceStrategy,
            Question[] questions
    ) {
        System.out.println("=====================================================================");
        System.out.println("EXAM CREATED SUCCESSFULLY");
        System.out.println("=====================================================================");
        System.out.println();
        System.out.println("Type:          " + exam.getType());
        System.out.println("Title:         " + configuration.getTitle());
        System.out.println();
        System.out.println("Duration:      " + configuration.getDuration() + " minutes");
        System.out.println("Passing Score: " + configuration.getPassingScore() + " Marks");
        System.out.println();
        System.out.println("Configuration Profiles:");
        System.out.println(formatStatus(configuration.hasNegativeMarking(), "Negative Marking Enabled"));
        System.out.println(formatStatus(configuration.hasQuestionShuffle(), "Question Shuffle Activated"));
        System.out.println(formatStatus(configuration.isCalculatorAllowed(), "Embedded Calculator Allowed"));
        System.out.println(formatStatus(configuration.hasAutoSubmit(), "Auto-Submit On Timeout"));
        System.out.println();
        System.out.println("Question Sourcing Strategy: " + sourceStrategy);
        System.out.println("Compiled Structural Components:");

        for (Question question : questions) {
            System.out.println("- [Type: " + question.getType() + "] "
                    + "Points: " + question.getPoints()
                    + " Difficulty: " + question.getDifficulty());
        }

        System.out.println("=====================================================================");
    }

    private static String formatStatus(boolean enabled, String label) {
        if (enabled) {
            return "✓ " + label;
        }

        return "✗ " + label;
    }
}
