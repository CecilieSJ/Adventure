import java.util.Scanner;

public class UserInterFace {
    Scanner scan = new Scanner(System.in);
    Adventure adventure = new Adventure();


    public void startMenu() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("You are now in " + adventure.getCurrentRoom());
            String direction = scan.nextLine();
            switch (direction) {

                case "Go north", "North", "n":

                    boolean goingNorth = adventure.goNorth();
                    System.out.println("going north " + goingNorth );

                    break;

                case "Go south", "South", "s":

                    boolean goingSouth = adventure.goSouth();
                    System.out.println("going south " + goingSouth);
                    break;

                case "Go east", "east", "e":
                    boolean goingEast = adventure.goEast();
                    System.out.println("going e" + goingEast);
                    break;

                case " Go west", "west", "w":
                    boolean goingWest = adventure.goWest();
                    System.out.println("going w " + goingWest);
                    break;

                case "exit", "ex":
                    isRunning=false;
                    break;

                case "help", "h":
                    System.out.print("kkk");
                    break;

                case "look", "l":
                    System.out.println();
                    break;
                default:
                    System.out.println("Could not find that command");
                    break;
            }

        }

    }
}




