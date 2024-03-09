import java.util.*;

public class Main {
    private static HashMap<Integer, Integer> army;

    public static void main(String[] args) throws Exception {
        Display disObj = new Display();
        disObj.welcomeMsg();
        Thread.sleep(1000);
        Display.clearConsole();

        UserData user = new UserData();

        UserData whiteWolf = new UserData("GeraltofRivia", "whitewolf", 32);

        army = disObj.createArmyIntial();
        System.out.println(army);

        int option;
        do {
            option = disObj.showMainMenu();
            Thread.sleep(1000);
            Main.showMyMainMenu(option, user, disObj);
            Thread.sleep(1000);
            //Display.clearConsole();
        } while (option != 0);

        System.out.println(army);
   
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
                army = disObj.updateArmy();
                break;
            case 4:
                
                break;
            default:
                System.out.println("Invalid optionn");
                break;

        }

    }
}
