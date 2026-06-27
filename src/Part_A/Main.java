package Part_A;

public class Main {

    public static void main(String[] args) {

        // Step 1: Decide which factory to use
        ExamFactory factory;

        String examChoice = "midterm";

        if (examChoice.equalsIgnoreCase("practice")) {
            factory = new PracticeQuizFactory();
        }
        else if (examChoice.equalsIgnoreCase("midterm")) {
            factory = new MidtermExamFactory();
        }
        else if (examChoice.equalsIgnoreCase("final")) {
            factory = new FinalExamFactory();
        }
//        else if (examChoice.equalsIgnoreCase("certification")){
//            factory = new CertificationExamFactory();
//        }
        else {
            System.out.println("Invalid exam type.");
            return;
        }

        // Step 2: Ask the factory to create the exam
        Exam exam = factory.createExam();

        // Step 3: Use the exam through the Part_A.Exam interface
        System.out.println("Part_A.Exam created successfully.");
        exam.displayInfo();
    }
}