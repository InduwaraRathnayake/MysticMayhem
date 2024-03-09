import java.util.ArrayList;
import java.util.List;

public class Main {
    private static ArrayList<Integer> army;

    public static void main(String[] args) throws Exception {
        Display disObj = new Display();
        disObj.welcomeMsg();
        Thread.sleep(1000);
        Display.clearConsole();

        UserData user = new UserData();

        UserData whiteWolf = new UserData("GeraltofRivia", "whitewolf", 32);

        int option;
        do {
            option = disObj.showMainMenu();
            Thread.sleep(1000);
            Main.showMyMainMenu(option, user, disObj);
            Thread.sleep(1000);
            //Display.clearConsole();
        } while (option != 0);

        for(Integer i : army){
            System.out.println(i);
        }

   
    }

    public static void showMyMainMenu(int option, UserData user, Display disObj){
        switch(option){
            case 1:
                disObj.displayProfile(user);
                break;
            case 2:
                user.changeName();
                break;
            case 3:
                army = disObj.createArmy();
                break;
            case 4:

                break;
            default:
                System.out.println("Invalid optionn");
                break;

        }

    }
}
