/* Alice Preece 09/08/18
A Harry Potter multiple choice quiz */

/* To do:
Create an array of classes at the bottom for the instance of each question. And then creat a for loop to put the answers in each options array.
Generally sort out the questions and arrays etc.
Also sort out the marking method loops and finding a way to make it a while loop or repeat as many times as you like. Also sort out the marking system*/

import java.util.Scanner;

//Declares main class
class miniProject
{
  //Main method
  public static void main(String [] args)
  {
    marking();
    System.exit(0);
  }//END main

  //question1 outputs questions and inputs answer returning score to main
  private static String question1()
  {
    Scanner scan = new Scanner(System.in);
    questions q1 = new questions();
    q1 = setQuestion(q1, "Question 1: Which of the below is a Hogwarts house?");
    q1 = setA(q1, "A: Lionheart");
    q1 = setB(q1, "B: Ravenclaw");
    q1 = setC(q1, "C: Serpenttongue");
    q1 = setD(q1, "D: Hufflefluff");

    String response1 = input(getQuestion(q1) + "\n" + getA(q1) + "\n" + getB(q1) + "\n" + getC(q1) + "\n" + getD(q1));

    return response1;
  }//END question1

  private static String input(String message)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println(message);

    String answer = scan.nextLine();
    System.out.println("You answered " + answer);
    return answer;
  }


  //question2 outputs questions and returns score to main
  private static String question2()
  {
    Scanner scan = new Scanner(System.in);
    questions q2 = new questions();
    q2 = setQuestion(q2, "Question 2: Who played keeper on the Gryffindoor Quidditch team in the first book?");
    q2 = setA(q2, "A: Ron Weasley");
    q2 = setB(q2, "B: Alicia Spinnet");
    q2 = setC(q2, "C: Oliver Wood");
    q2 = setD(q2, "D: Marcus Flint");

    String response2 = input(getQuestion(q2) + "\n" + getA(q2) + "\n" + getB(q2) + "\n" + getC(q2) + "\n" + getD(q2));

    return response2;
  }//END question2

  private static void marking()
  {
    int score = 0;
    questions q1 = new questions();
    q1 = setAnswer(q1, "B");

    for(int i = 1; 1 <= 10; i++)
    {
      if (question1().equals(getAnswer(q1)))
      {
        System.out.println("Correct answer. Well done!");
        score++;
        break;
      }
      else
      {
        System.out.println("Sorry that is incorrect. Please try again: ");
      }
    }//END for

    questions q2 = new questions();
    q2 = setAnswer(q2, "C");

    for(int i = 1; 1 <= 10; i ++)
    {
      if (question2().equals(getAnswer(q2)))
      {
        System.out.println("Correct answer. Well done!");
        score ++;
        break;
      }
      else
      {
        System.out.println("I'm sorry that is incorrect. Please try again: ");
      }
    }//END for loop

    System.out.println(score);
  }//END marking


  //Getter methods
  private static String getQuestion(questions q){ return q.question; }

  private static String getA(questions q)
  {
    return q.A;
  }

  private static String getB(questions q)
  {
    return q.B;
  }

  private static String getC(questions q)
  {
    return q.C;
  }

  private static String getD(questions q)
  {
    return q.D;
  }

  private static String getAnswer(questions q)
  {
    return q.answer;
  }

  //Setter methods
  private static questions setQuestion(questions q, String qu)
  {
    q.question = qu;
    return q;
  }

  private static questions setA(questions q, String a)
  {
    q.A = a;
    return q;
  }

  private static questions setB(questions q, String b)
  {
    q.B = b;
    return q;
  }

  private static questions setC(questions q, String c)
  {
    q.C = c;
    return q;
  }

  private static questions setD(questions q, String d)
  {
    q.D = d;
    return q;
  }

  private static questions setAnswer(questions q, String ans)
  {
    q.answer = ans;
    return q;
  }
}//END miniProject class

class questions
{
  String question;
  String A;
  String B;
  String C;
  String D;
  //String[] options;
  String answer;
}//END class
