package Part_A;

public class FinalExamFactory extends ExamFactory {
    @Override
    public Exam createExam() {
        return new FinalExam();
    }
}
