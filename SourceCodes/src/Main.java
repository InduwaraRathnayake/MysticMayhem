public class Main {
    public static void main(String[] args) throws Exception {
        Display disObj = new Display();
        disObj.welcomeMsg();

        UserData user = new UserData();

        UserData whiteWolf = new UserData("GeraltofRivia", "whitewolf", 32);

        int option;
        do {
            option = disObj.showMainMenu();
            Main.showMyMainMenu(option, user, disObj);
        } while (option != 0);
   
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
                disObj.displayArmy();
                break;
            default:
                System.out.println("Invalid optionn");
                break;

        }

    }
}
