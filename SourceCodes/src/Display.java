import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {
    private Scanner prompt = new Scanner (System.in);
    public void welcomeMsg() {
        System.out.println("===================================|=|=|=|=|=|=|===================================\n");
        System.out.println("                             |\\    /|  ");
        System.out.println("                             ||\\  /||  ");
        System.out.println("                             || \\/ ||  |\\    /|");
        System.out.println("                             ||    ||  ||\\  /||");
        System.out.println("                            _||_  _||_ || \\/ ||");
        System.out.println("                                       ||    ||");
        System.out.println("                                      _||_  _||_\n");
        System.out.println("                               MYSTIC MEYHAM\n");
        System.out.println("\n\nCREATED BY CYBER DUDES.");
        System.out.println("===================================|=|=|=|=|=|=|===================================\n");

        System.out.print("\n\nPress \"Enter\" to continue....\n");
        prompt.nextLine();
    }

    public int showMainMenu(){
        System.out.println("\n===================================|o|O|O|O|O|o|===================================");
        System.out.println("<><><><><><><><><><><                MAIN MENU                ><><><><><><><><><><>");
        System.out.println("===================================|o|O|O|O|O|o|===================================\n");

        System.out.println("    1. VIEW PROFILE");
        System.out.println("    2. CHANGE PLAYER CHARACTERISTIC");
        System.out.println("    3. INVENTORY");
        System.out.println("    4. START A COMBAT");
        System.out.println("    0. EXIT");

        System.out.println();

        int option;
        do {
            System.out.print("Enter your option: ");
            while (!prompt.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer option.");
                prompt.next();
            }
            option = prompt.nextInt();
            prompt.nextLine();
        
            if (option >= 0 && option <= 4) {
                break;
            } else {
                System.out.println("Invalid option. Please enter a valid option between 0 and 4.");
            }
        } while (true);

        return option;
        
    }

    public void displayProfile(UserData user, Player player){
        System.out.println("\n===================================|o|O|O|O|O|o|===================================");
        System.out.println("<><><><><><><><><><><               USER PROFILE              ><><><><><><><><><><>");
        System.out.println("===================================|o|O|O|O|O|o|===================================\n"); 
        
        user.printUserData();
        player.printPlayerStat();

        System.out.print("\n\n\n\nPress \"Enter\" to continue....");
        prompt.nextLine();

    }

public int chooseOption1() {
    int option;
    while(true){
        System.out.println("What would you like to buy or update?\n");
        System.out.println("   1. WARRIOR");
        System.out.println("   2. EQUIPMENT");
        System.out.println("   0. BACK TO MAIN MENU\n");
        

        try {
            System.out.print("Enter your option: ");
            option = prompt.nextInt();
            prompt.nextLine();

            if (option < 0 || option > 2) {
                System.out.println("Invalid Entry");
                System.out.println("Please Re-enter\n");
                continue;
            }
            return option;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            prompt.nextLine(); 
        }

    }
}

public int chooseOption2() {
    int option;
    while(true){
        System.out.println("\n   1. CHANGE YOUR PLAYER NAME");
        System.out.println("   2. CHANGE YOUR HOMEGROUND");
        System.out.println("   0. BACK TO MAIN MENU\n");
        

        try {
            System.out.print("Enter your option: ");
            option = prompt.nextInt();
            prompt.nextLine();

            if (option < 0 || option > 2) {
                System.out.println("Invalid Entry");
                System.out.println("Please Re-enter\n");
                continue;
            }
            return option;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            prompt.nextLine(); 
        }

    }
}

public void printChoices(int warriorCategory){
    switch(warriorCategory){
        case 1:
            System.out.println("=======================================================================================================================");
            System.out.println("                                                      ARCHERS");
            System.out.println("=======================================================================================================================\n");
            System.out.println(" 1).                     2).                      3).                       4).                      5).");
            System.out.println(" Name: Shooter           Name:  Ranger            Name: Sunfire             Name: Zing               Name: Saggitarius");
            System.out.println(" Price: 80 gc            Price: 115 gc            Price: 160 gc             Price: 200 gc            Price: 230 gc");
            System.out.println(" Attack: 11              Attack: 14               Attack: 15                Attack: 16               Attack: 18");
            System.out.println(" Defence: 4              Defence: 5               Defence: 5                Defence: 9               Defence: 7");
            System.out.println(" Health: 6               Health: 8                Health: 7                 Health: 11               Health: 12");
            System.out.println(" Speed: 9                Speed: 10                Speed: 14                 Speed: 14                Speed: 17");
            System.out.println();
            break;

        case 2:
            System.out.println("=======================================================================================================================");
            System.out.println("                                                     KNIGHTS");
            System.out.println("=======================================================================================================================\n");
            System.out.println(" 1).                     2).                      3).                       4).                      5).");
            System.out.println(" Name: Squire            Name: Cavalier           Name: Templar             Name: Zoro               Name: Swiftblade");
            System.out.println(" Price: 85 gc            Price: 110 gc            Price: 155 gc             Price: 180 gc            Price: 250 gc");
            System.out.println(" Attack: 8               Attack: 10               Attack: 14                Attack: 17               Attack: 18");
            System.out.println(" Defence: 9              Defence: 12              Defence: 16               Defence: 16               Defence: 20");
            System.out.println(" Health: 7               Health: 7                Health: 12                Health: 13               Health: 17");
            System.out.println(" Speed: 8                Speed: 10                Speed: 12                 Speed: 14                Speed: 13");
            System.out.println();
            break;

        case 3:
            System.out.println("=======================================================================================================================");
            System.out.println("                                                      MAGES");
            System.out.println("=======================================================================================================================\n");
            System.out.println(" 1).                     2).                      3).                       4).                      5).");
            System.out.println(" Name: Warlock           Name:  Illusionist       Name: Enchanter            Name: Conjurer           Name: Eldritch");
            System.out.println(" Price: 100 gc           Price: 120 gc            Price: 160 gc              Price: 195 gc            Price: 270 gc");
            System.out.println(" Attack: 12              Attack: 13               Attack: 16                 Attack: 18               Attack: 19");
            System.out.println(" Defence: 7              Defence: 8               Defence: 10                Defence: 15              Defence: 17");
            System.out.println(" Health: 10              Health: 12               Health: 13                 Health: 14               Health: 18");
            System.out.println(" Speed: 12               Speed: 14                Speed: 16                  Speed: 12                Speed: 14");
            System.out.println();
            break;

        case 4:
            System.out.println("=======================================================================================================================");
            System.out.println("                                                      HEALERS");
            System.out.println("=======================================================================================================================\n");
            System.out.println(" 1).                     2).                      3).                       4).                      5).");
            System.out.println(" Name: Soother           Name: Medic              Name: Alchemist            Name: Saint              Name: Lightbringer");
            System.out.println(" Price: 95 gc            Price: 125 gc            Price: 150 gc              Price: 200 gc            Price: 260 gc");
            System.out.println(" Attack: 10              Attack: 12               Attack: 13                 Attack: 16               Attack: 17");
            System.out.println(" Defence: 8              Defence: 9               Defence: 13                Defence: 14              Defence: 15");
            System.out.println(" Health: 9               Health: 10               Health: 13                 Health: 17               Health: 19");
            System.out.println(" Speed: 6                Speed: 7                 Speed: 13                  Speed: 9                 Speed: 12");
            System.out.println();
            break;

        case 5:
            System.out.println("=======================================================================================================================");
            System.out.println("                                                 MYTHICAL CREATURE");
            System.out.println("=======================================================================================================================\n");
            System.out.println(" 1).                     2).                      3).                       4).                      5).");
            System.out.println(" Name: Dragon            Name: Basilisk           Name: Hydra               Name: Phoenix            Name: Pegasus");
            System.out.println(" Price: 120 gc           Price: 165 gc            Price: 205 gc             Price: 275 gc            Price: 340 gc");
            System.out.println(" Attack: 12              Attack: 15               Attack: 12                Attack: 17               Attack: 14");
            System.out.println(" Defence: 14             Defence: 11              Defence: 16               Defence: 13              Defence: 18");
            System.out.println(" Health: 15              Health: 10               Health: 15                Health: 17               Health: 20");
            System.out.println(" Speed: 8                Speed: 12                Speed: 11                 Speed: 19                Speed: 20");
            System.out.println();
            break;
        
            case 6:

            System.out.println("===========================================================================");
            System.out.println("                                ARMOURS");
            System.out.println("===========================================================================\n");
            System.out.println(" 1).                     2).                      3).                 ");
            System.out.println(" Name: Chainmail         Name: Regalia            Name: Fleece           ");
            System.out.println(" Price: 70 gc            Price: 105 gc            Price: 150 gc          ");
            System.out.println(" Attack: no change       Attack: no change        Attack: no change    ");
            System.out.println(" Defence: +1             Defence: +1              Defence: +2            ");
            System.out.println(" Health: no change       Health: no change        Health: +1            ");
            System.out.println(" Speed: -1               Speed: no change         Speed: -1             ");
            System.out.println();
            break;

        case 7:
            System.out.println("===========================================================================");
            System.out.println("                               ARTIFACTS");
            System.out.println("===========================================================================\n");
            System.out.println(" 1).                     2).                      3).                 ");
            System.out.println(" Name: Excalibur         Name: Amulet             Name: Crystal           ");
            System.out.println(" Price: 150 gc           Price: 200 gc            Price: 210 gc          ");
            System.out.println(" Attack: +2              Attack: +1               Attack: +2    ");
            System.out.println(" Defence: no change      Defence: -1              Defence: +1            ");
            System.out.println(" Health: no change       Health: +1               Health: -1            ");
            System.out.println(" Speed: no change        Speed: +1                Speed: -1             ");
            System.out.println();
            break;
        
    }
}
    public void gameInstructions1() throws InterruptedException{
        System.out.println("  ");
        System.out.println("  ");
        System.out.println(" ");
        System.out.println(" ------------ YOU HAVE CREATED YOUR USER PROFILE SUCCESSSFULLY -------------");
        Thread.sleep(500);
        System.out.println("  ");
        System.out.println("  ");
        System.out.println(" NOW YOU HAVE TO CREATE YOUR OWN ARMY IN ORDER TO BATTLE ");
        Thread.sleep(500);
        System.out.println("  ");
        System.out.println("  ");
        System.out.println(" YOU HAVE TO SELECT 5 CHARACTERS TO COMPLETE THE ARMY ");
        Thread.sleep(500);
        System.out.println(" ************ TIP: USE YOUR COINS EFFICIENTLY TO BUY CHARACTERS *************");
        Thread.sleep(500);
        System.out.println("  ");
        System.out.println(" IF YOU DON'T HAVE COINS TO FULLFILL THE ARMY,\nYOU WILL BE REDIRECTED TO THE INITIAL PAGE TO CHOOSE THE ARMY AGAIN FROM THE BEGINING... ");
        Thread.sleep(500);

    }

    public void gameInstructions2(){      // call this method after creating the army...
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println(" YOU HAVE SUCCESSFULLY CREATED THE ARMY.... ");
        System.out.println("  ");
        System.out.println("  ");

    }
}