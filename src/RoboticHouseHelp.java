public class RoboticHouseHelp {

    //attributes.
    String fullName, actions;
    int age;

    //methods
    public String sayName() {
        return "My name is " + fullName;
    }

    public String sayAge() {
        return "I am " + age + "years old";
    }

    public String sayAction() {
        return " I am a robotichousehelp,I can " + actions;
    }

    public void cook() throws InterruptedException {
        System.out.println("Ok....your food will ready in 10seconds");
        Thread.sleep(10000);
        System.out.println("YUMMMMMY!!!:)...your food is ready, enjoy yourself");
        System.out.println("for more command or question, type my name (greenwood),Else press any key.");
    }

    public void getWater() throws InterruptedException {
        System.out.println("some minute please.");
        Thread.sleep(10000);
        System.out.println("here is the water, have a drink.");
        System.out.println("for more command or question, type my name (greenwood),Else press any key.");
            }

            public void cleanHouse() throws InterruptedException {
                System.out.println("house cleaning started");
                Thread.sleep(10000);
                System.out.println("WAaaaOoooo!!!0)...The house is cleaned");
                System.out.println("for more command or question, type my name (greenwood),Else press any key.");
            }


            public void tellStory() {
                System.out.println("Story story o...Once upon a time there was king in the land of blablabla......THE END");
                System.out.println("for more command or question, type my name (greenwood),Else press any key.");
            }
        }