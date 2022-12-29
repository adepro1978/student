import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {

        String command1, command2, command3, command4, command5, command6, command7, moreCommand;
        command1 = "what is your name?";
        command2 = "how old are you?";
        command3 = "what action can you perform?";
        command4 = "cook for me";
        command5 = "get me water";
        command6 = "clean the house";
        command7 = "tell me a story";
        boolean trueOrFalse = true;


        String input;
        RoboticHouseHelp roboticHouseHelp = new RoboticHouseHelp();
        roboticHouseHelp.fullName = "Green Wood";
        roboticHouseHelp.age = 10;
        roboticHouseHelp.actions = "cook food, get you water, clean the house, tell you stories e.t.c.";


        Scanner userInput = new Scanner(System.in);

        System.out.println("THIS IS A SIMPLE INTERACTIVE  ROBOTIC HOUSE HELP");
        System.out.println("You can interact with it by typing one of the following questions and press enter.");
        System.out.println("what is your name?");
        System.out.println("how old are you? ");
        System.out.println("what action can you perform? ");
        System.out.println(" ");
        System.out.println("You can command it by typing one of the following tasks and press enter.");
        System.out.println("# cook for me");
        System.out.println("# get me water");
        System.out.println("# clean the house");
        System.out.println("# tell me story");

        System.out.println(" =========LET GET STARTED========");
        while (trueOrFalse) {
            System.out.println(" Input a Question or a Command.");
            input = userInput.nextLine();

            if (command1.equals(input)) {
                 //student.sayName();
                System.out.println(roboticHouseHelp.sayName());
                System.out.println("for more command or question, type my name (greenwood) and press enter ,\nElse press any key.");
            }

            else if (input.equals(command2)) {
                System.out.println(roboticHouseHelp.sayAge());
                System.out.println("for more command or question, type my name (greenwood),Else press any key.");

            }

            else if (input.equals(command3)) {
                System.out.println(roboticHouseHelp.sayAction());
                System.out.println("for more command or question, type my name (greenwood),Else press any key.");
            }

            else if (command4.equals(input)) {
                roboticHouseHelp.cook();
            }

            else if (command5.equals(input)) {
                roboticHouseHelp.getWater();
            }

             else if (command6.equals(input)) {
                roboticHouseHelp.cleanHouse();
            }

            else if (command7.equals(input)) {
                roboticHouseHelp.tellStory();
            }

            else {
                System.out.println("I DON'T understand your Question or Command");
                System.out.println("for more command or question, type my name (greenwood),Else press any key.");
            }

            moreCommand = userInput.nextLine();

            if (moreCommand.equals("greenwood")){
                System.out.println(" Yes boss, Am at your service.");
            }
            else {
                trueOrFalse = false;
                System.out.println("Ok...bye for now.");
            }
        }
    }
}