import java.util.Scanner;


class lab12_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("How many test grades do you you want to enter? (Enter numbers 2-4) ");
    int numTests = sc.nextInt();
    double avg;


    if(numTests == 2){
      System.out.println("Please enter your first test grade: ");
      double exam1 = sc.nextDouble();
      System.out.println("Please enter your second test grade: ");
      double exam2 = sc.nextDouble();
      avg = AverageGrade.average(exam1,exam2);
      //avg = Math.round(avg * 100);
      //avg = avg/100;
      System.out.print("Your test average is: " + String.format("%.2f",avg));
    }

    else if(numTests == 3){
      System.out.println("Please enter your first test grade: ");
      double exam1 = sc.nextDouble();
      System.out.println("Please enter your second test grade: ");
      double exam2 = sc.nextDouble();
      System.out.println("Please enter your third test grade: ");
      double exam3 = sc.nextDouble();
      avg = AverageGrade.average(exam1,exam2,exam3);

      System.out.print("Your test average is: " + String.format("%.2f",avg));
    }

    else{
      System.out.println("Please enter your first test grade: ");
      double exam1 = sc.nextDouble();
      System.out.println("Please enter your second test grade: ");
      double exam2 = sc.nextDouble();
      System.out.println("Please enter your third test grade: ");
      double exam3 = sc.nextDouble();
      System.out.println("Please enter your fourth test grade: ");
      double exam4 = sc.nextDouble();
      avg = AverageGrade.average(exam1,exam2,exam3,exam4);

      System.out.print("Your test average is: " + String.format("%.2f",avg));
    }


  } //end main
} //end class


class AverageGrade{
  public static double average(double exam1, double exam2){
    double avg = (exam1 + exam2)/2;
    return avg;

  }//end average method

  public static double average(double exam1, double exam2, double exam3){
    double avg = (exam1 + exam2 +exam3)/3;
    return avg;

  }//end average method

  public static double average(double exam1, double exam2, double exam3, double exam4){
    double avg = (exam1 + exam2 + exam3 +exam4)/4;
    return avg;

  } //end average method
}//end class AverageGrade
