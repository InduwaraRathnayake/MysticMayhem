public HashMap<Integer,Integer> createArmyIntial(){
    HashMap<Integer,Integer> ouputHashMap =new HashMap<Integer,Integer>(); 
    Scanner prompt_1 = new Scanner (System.in);
    int warriorCategory =1,warrior;

    System.out.println("Create your Army");

    while(warriorCategory >0&&warriorCategory<6){
        while(true){
            printArmyChoices(warriorCategory);
            System.out.println();
            System.out.print("Choose your preference:  ");
            warrior = prompt_1.nextInt();
            prompt_1.nextLine();

            if(warrior>5||warrior<1){
                System.out.println("Invalid entry. Please Retry\n");
                continue;
            }
            ouputHashMap.put(warriorCategory,warrior);
            break;
        }
        warriorCategory++;        
    }
    return ouputHashMap;
}

public HashMap<Integer,Integer> updateArmy(){
    HashMap<Integer,Integer> ouputList =new HashMap<Integer,Integer>(); 
    Scanner prompt_1 = new Scanner (System.in);
    int warriorCategory,warrior;

    while(true){

        System.out.println("Which warrior do you need to upgrade or buy");
        System.out.println("    1. ARCHER");
        System.out.println("    2. KNIGHT");
        System.out.println("    3. MAGES");
        System.out.println("    4. HEALER");
        System.out.println("    5. MYTHICAL CREATURE");
        System.out.println("    0. EXIT");
        System.out.print("Enter your option: ");
        warriorCategory = prompt_1.nextInt();
        prompt_1.nextLine();

        if(0<=warriorCategory&&warriorCategory<7){
            break;
        }

        System.out.println("Invlaid entry");
        System.out.println("Please Re-enter");
    }

    if(warriorCategory == 0){
        ouputHashMap.put(0,0);
        return ouputHashMap;
    }

    while(true){
        printArmyChoices(warriorCategory);
        System.out.println("Enter 0 to exit\n");
        System.out.print("Enter your option: ");
        warrior = prompt_1.nextInt();
        prompt_1.nextLine();
        if(warrior<0||warrior>7){
            System.out.println("Invalid Entry");
            System.out.println("Please Re-enter\n");
            continue;
        }
        ouputHashMap.put(warriorCategory,warrior);
        return ouputHashMap;
    }

}

public void printArmyChoices(int warriorCategory){
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
            
        default:            //redundant
            break;
        
    }
}
