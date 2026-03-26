import java.util.Scanner;

public class madGame{
    public static void main(String[] args){

        //madlibs game type shit
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective1 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = scanner.nextLine();

        System.out.print("Enter a type of bird: ");
        String bird = scanner.nextLine();

        System.out.print("Enter a room in a house: ");
        String room = scanner.nextLine();

        System.out.print("Enter a verb (past tense): ");
        String verb1 = scanner.nextLine();

        System.out.print("Enter another verb: ");
        String verb2 = scanner.nextLine();

        System.out.print("Enter a relative's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.print("Enter a liquid: ");
        String liquid = scanner.nextLine();

        System.out.print("Enter a verb ending in -ing: ");
        String verb3 = scanner.nextLine();

        System.out.print("Enter a part of the body (plural): ");
        String body = scanner.nextLine();

        System.out.print("Enter a plural noun: ");
        String noun2 = scanner.nextLine();

        System.out.print("Enter a verb ending in -ing: ");
        String verb4 = scanner.nextLine();

        
        System.out.print("Enter a noun: ");
        String noun3 = scanner.nextLine();
       
        System.out.println("It was a " + adjective1 + ", cold November day.");
        System.out.println("I woke up to the " + adjective2 + " smell of " + bird + " roasting in the " + room + " downstairs.");
        System.out.println("I " + verb1 + " down the stairs to see if I could help " + verb2 + " the dinner.");
        System.out.println("My mom said, \"See if " + name + " needs a fresh " + noun1 + ".\"");
        System.out.println("So I carried a tray of glasses full of " + liquid + " into the " + verb3 + " room.");
        System.out.println("When I got there, I couldn't believe my " + body + "! There were " + noun2 + " " + verb4 + " on the " + noun3 + "!");
        scanner.close();
    }
}