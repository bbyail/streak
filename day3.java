import java.util.Scanner;

public class day3 {
    public static void main(String[] args){
        //user scanner type shit

        //practice palang toh boss
        
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = scanner.nextLine();

        System.out.print("How old are you?: ");
        int age = scanner.nextInt();

        System.out.print("What is your midterm grade?: ");
        double grade = scanner.nextDouble();

        System.out.print("Are you a student?: (true/false) ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your midterm grade is " + grade);
       if(isStudent == true){
        System.out.println("You are a student!!!");
       }
       else {
        System.out.println("Di ka studyante boss");
       }
       */

       //calculate area of rectangle

Scanner scanner = new Scanner(System.in);

double width = 0;
double height = 0;
double area = 0;

       System.out.print("Enter width: ");
      width = scanner.nextDouble();

       System.out.print("Enter height: ");
       height = scanner.nextDouble();

       area = width * height;
       
       System.out.println("The area of a rectangle is: " + area + "cm");

       scanner.close();
    }
}

