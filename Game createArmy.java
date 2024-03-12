public HashMap<Integer, Integer> createArmyInitial() {
    HashMap<Integer, Integer> outputHashMap = new HashMap<>();
    Scanner prompt_1 = new Scanner(System.in);
    int warriorCategory = 1, warrior;

    System.out.println("Create your Army");

    while (warriorCategory > 0 && warriorCategory < 6) {
        while (true) {
            printChoices(warriorCategory);
            System.out.println();
            System.out.print("Choose your preference:  ");

            try {
                warrior = prompt_1.nextInt();
                prompt_1.nextLine();

                if (warrior > 5 || warrior < 1) {
                    System.out.println("Invalid entry. Please Retry\n");
                    continue;
                }
                outputHashMap.put(warriorCategory, warrior);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                prompt_1.nextLine(); // Clear the buffer
            }
        }
        warriorCategory++;
    }
    return outputHashMap;
}
public HashMap<Integer, Integer> addEquipments() {
    HashMap<Integer, Integer> outputHashMap = new HashMap<>();
    Scanner prompt_1 = new Scanner(System.in);
    int equipmentCategory, equipment;

    while (true) {
        System.out.println("Which equipment do you need to buy");
        System.out.println("    1. ARMOUR");
        System.out.println("    2. ARTIFACT");
        System.out.println("    0. EXIT");
        System.out.print("Enter your option: ");

        try {
            equipmentCategory = prompt_1.nextInt();
            prompt_1.nextLine();

            if (0 <= equipmentCategory && equipmentCategory < 3) {
                break;
            }

            System.out.println("Invalid entry");
            System.out.println("Please Re-enter");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            prompt_1.nextLine(); // Clear the buffer
        }
    }

    if (equipmentCategory == 0) {
        outputHashMap.put(0, 0);
        return outputHashMap;
    }

    while (true) {
        printChoices(equipmentCategory);
        System.out.println("Enter 0 to exit\n");
        System.out.print("Enter your option: ");

        try {
            warrior = prompt_1.nextInt();
            prompt_1.nextLine();

            if (equipment < 0 || equipment > 2) {
                System.out.println("Invalid Entry");
                System.out.println("Please Re-enter\n");
                continue;
            }
            outputHashMap.put(equipmentCategory, equipment);
            return outputHashMap;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            prompt_1.nextLine(); // Clear the buffer
        }
    }
}

public HashMap<Integer, Integer> updateArmy() {
    HashMap<Integer, Integer> outputHashMap = new HashMap<>();
    Scanner prompt_1 = new Scanner(System.in);
    int warriorCategory, warrior;

    while (true) {
        System.out.println("Which warrior do you need to upgrade or buy");
        System.out.println("    1. ARCHER");
        System.out.println("    2. KNIGHT");
        System.out.println("    3. MAGES");
        System.out.println("    4. HEALER");
        System.out.println("    5. MYTHICAL CREATURE");
        System.out.println("    0. EXIT");
        System.out.print("Enter your option: ");

        try {
            warriorCategory = prompt_1.nextInt();
            prompt_1.nextLine();

            if (0 <= warriorCategory && warriorCategory < 6) {
                break;
            }

            System.out.println("Invalid entry");
            System.out.println("Please Re-enter");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            prompt_1.nextLine(); // Clear the buffer
        }
    }

    if (warriorCategory == 0) {
        outputHashMap.put(0, 0);
        return outputHashMap;
    }

    while (true) {
        printChoices(warriorCategory);
        System.out.println("Enter 0 to exit\n");
        System.out.print("Enter your option: ");

        try {
            warrior = prompt_1.nextInt();
            prompt_1.nextLine();

            if (warrior < 0 || warrior > 5) {
                System.out.println("Invalid Entry");
                System.out.println("Please Re-enter\n");
                continue;
            }
            outputHashMap.put(warriorCategory, warrior);
            return outputHashMap;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            prompt_1.nextLine(); // Clear the buffer
        }
    }
}


public void printChoices(int category){
    switch(category){
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
         
        default:            //redundant
            break;
        
    }
}
