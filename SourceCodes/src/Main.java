import java.util.*;

public class Main {
        private static HashMap<Integer, Integer> equipmentsTracker = new HashMap<>();
        public static void main(String[] args) throws Exception {
        
        List<Player> players = new ArrayList<>();

        //1 create whitewolf 
        List<Army> armyOfNpc = new ArrayList<>();
        UserData whiteWolf = new UserData("GeraltofRivia", "whitewolf", 204300211);
        whiteWolf.writeNPCData();
        armyOfNpc.add(new Ranger()); 
        armyOfNpc.add(new Squire());
        armyOfNpc.add(new Warlock());
        armyOfNpc.add(new Medic());
        armyOfNpc.add(new Dragon());
        Player whiteWolfPlayer = new Player(whiteWolf,32,215 +70 +200,armyOfNpc,2);
        Chainmail chainmail = new Chainmail();
        chainmail.buyArmor(armyOfNpc.get(0), whiteWolfPlayer);
        Amulet amulet = new Amulet();
        amulet.buyArmor(armyOfNpc.get(3), whiteWolfPlayer);

        //2
        Display display = new Display();
        display.welcomeMsg();

        //3 create user 
        List<Army> charOfUser = new ArrayList<>();
        UserData user = new UserData();
        Player userPlayer = new Player(user);
        display.gameInstructions1();
        userPlayer.settingInitialArmy(display);
        display.gameInstructions2();
        userPlayer.settingHomeground();
        charOfUser = userPlayer.battleTroops();


        //4        
        players = Player.getPlayers();
        Battle battle1 = new Battle();
        battle1.stratWar(charOfUser, players, userPlayer);

        int option;
        do {
            option = display.showMainMenu();
            Main.MainMenu(option, user, display, userPlayer, players);
        } while (option != 0);
        
    }

    public static void MainMenu(int option, UserData user, Display display, Player userPlayer, List<Player> players) throws CloneNotSupportedException, InterruptedException{
        switch(option){
            case 1:
            display.displayProfile(user, userPlayer);
                break;
            case 2:
                int changeOption = display.chooseOption2();
                if(changeOption == 1){
                    user.changeName();
                }
                else if(changeOption == 2){
                    userPlayer.settingHomeground();
                }
                
                break;
            case 3:
                int shopOption = display.chooseOption1();
                if(shopOption == 1){
                    userPlayer.updateArmy(display);
                    break;
                }
                else if(shopOption == 2){
                    List<Army> characters = new ArrayList<>();
                    characters = userPlayer.getArmy();
                    userPlayer.addEquipments(characters,equipmentsTracker,display);
                    break;
                }
                break;
            case 4:
                List<Army> charOfUser = new ArrayList<>();
                charOfUser = userPlayer.battleTroops();
                Battle battle = new Battle();
                battle.stratWar(charOfUser, players, userPlayer);
                break;
            case 0:
                System.out.println("\nGOOD BYE WORRIOR!!!");
                Thread.sleep(2000);
                break;
            default:
                System.out.println("Invalid option. Please Enter Valid input.");
                break;

        }
    }
}
