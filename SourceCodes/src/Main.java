import java.util.*;

public class Main {
    private static HashMap<Integer, Integer> army;
    private static List<Army> characters = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //1
        Display disObj = new Display();
        disObj.welcomeMsg();

        //2
        UserData user = new UserData();

        //3
        UserData whiteWolf = new UserData("GeraltofRivia", "whitewolf", 32);

        //4
        army = disObj.createArmyInitial();
        for (Map.Entry<Integer, Integer> entry : army.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            // Create the corresponding character and add it to the list
            switch (key) {
                case 1: // Archer
                    switch (value) {
                        case 1:
                            characters.add(new Shooter());
                            break;
                        case 2:
                            characters.add(new Ranger());
                            break;
                        case 3:
                            characters.add(new Sunfire());
                            break;
                        case 4:
                            characters.add(new Zing());
                            break;
                        case 5:
                            characters.add(new Saggitarius());
                            break;
                    }
                    break;
                case 2: // Knight
                    switch (value) {
                        case 1:
                            characters.add(new Squire());
                            break;
                        case 2:
                            characters.add(new Cavalier());
                            break;
                        case 3:
                            characters.add(new Templar());
                            break;
                        case 4:
                            characters.add(new Zoro());
                            break;
                        case 5:
                            characters.add(new Swiftblade());
                            break;
                    }
                    break;
                case 3: // Mage
                    switch (value) {
                        case 1:
                            characters.add(new Warlock());
                            break;
                        case 2:
                            characters.add(new Illusionist());
                            break;
                        case 3:
                            characters.add(new Enchanter());
                            break;
                        case 4:
                            characters.add(new Conjurer());
                            break;
                        case 5:
                            characters.add(new Eldritch());
                            break;
                    }
                    break;
                case 4: // Healer
                	switch (value) {
                    case 1:
                        characters.add(new Soother());
                        break;
                    case 2:
                        characters.add(new Medic());
                        break;
                    case 3:
                        characters.add(new Alchemist());
                        break;
                    case 4:
                        characters.add(new Saint());
                        break;
                    case 5:
                        characters.add(new Lightbringer());
                        break;
                }
                	break;
                case 5: // MythicalCreature
                	switch (value) {
                    case 1:
                        characters.add(new Dragon());
                        break;
                    case 2:
                        characters.add(new Basilisk());
                        break;
                    case 3:
                        characters.add(new Hydra());
                        break;
                    case 4:
                        characters.add(new Phoenix());
                        break;
                    case 5:
                        characters.add(new Pegasus());
                        break;
                	}
            }
        }

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
