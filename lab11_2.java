// import java.util.Scanner;
import java.util.*;

class lab11_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What shape (rectangle or triangle) do you want to calculate the area of?");
    String shape = sc.nextLine();

    System.out.println("What is the length of the shape?");
    int length = sc.nextInt();

    System.out.println("What is the height of the shape?");
    int height = sc.nextInt();

    // create class object here:

    if(shape.equals("rectangle"))
    {
        int area = shapeArea.recA(length, height);// call your rectangle area method from ShapeArea here
        System.out.println("The area of the rectangle is " + area + ".");
    }
    else if(shape.equals("triangle"))
    {
        double area = shapeArea.triA(length, height); // call your triangle area method from ShapeArea here
        System.out.println("The area of the triangle is " + area + ".");
    }
    else
    {
        System.out.println("You did not enter an allowed shape.");
    }



  } //end main
} //end class

class shapeArea {
  public static double triA(int l, int h) {
    double area = 0.5 * l * h;
    return area;
  }
    // make a method that takes in the length and height and returns the area (int) of the rectangle here:
    public static int recA(int l, int h) {
      int area = l * h;
      return area;
    }

    // make a method that takes in the length and height and returns the area (double of the triangle here:


} //end class
