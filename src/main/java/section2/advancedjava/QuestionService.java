package section2.advancedjava;

import java.util.Scanner;

public class QuestionService {
    Question [] questions = new Question[5];

    String selection[] = new String[5];  // selection of user values

    //create constructor
    public QuestionService(){
        questions[0] = new Question(1,"new java version", "7", "8", "11", "25","25");
        questions[1] = new Question(2,"new spring version", "7", "3", "8", "6","6");
        questions[2] = new Question(3,"new hibernate version", "7", "5", "9", "10","5");
        questions[3] = new Question(4,"new Oracle version", "11", "9", "10", "5","11");
        questions[4] = new Question(5,"new Scala version", "2", "3", "1", "4","3");

    }
    /*public void displayQuestion(){
        for (Question q: questions){
            System.out.println(q);
        }*/
    public void playQuiz(){
        int i =0;
        for (Question q : questions){
            System.out.println("Question No: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            // for user input
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for (String s : selection){
            System.out.println(s);
        }


    }
}
