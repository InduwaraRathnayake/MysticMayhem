import java.util.*;

public class Player implements Cloneable {
    private static List<Player> players = new ArrayList<>(); 
    private List<Army> armyOfPlayer = new ArrayList<>(); 
    private long coins = 500;
    private long xp=0;
    private String name;
    private int homeground;

    Scanner prompt = new Scanner(System.in);

    public void setHomeGround(int homeground){
        this.homeground = homeground;
    }

    public int getHomeground(){
        return this.homeground;
    }
    
    public Player(UserData user, int xp, int coins,List<Army> army, int homeGround){
        this.name = user.getName();
        this.xp = xp;
        this.coins = coins;
        this.armyOfPlayer = army;
        this.homeground = homeGround;
        players.add(this);
    }

    public Player(UserData user){
        this.name = user.getName();
    }

    public List<Army> getArmy(){
        return this.armyOfPlayer;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error Clone does not happane", e);
        }
    }

    public List<Army> battleTroops() throws CloneNotSupportedException {
        List<Army> battleTroop = new ArrayList<>();

        for (Army originalArmy : armyOfPlayer) {
            Army clonedArmy = (Army) originalArmy.clone();
            battleTroop.add(clonedArmy);
        }
        return battleTroop;
    }

    public static List<Player> getPlayers(){
        return players;
    }

    public long getCoins(){
        return this.coins;
    }

    public void setCoins(long coins){
        this.coins = coins;
    }

    public long getXp(){
        return xp;
    }

    public void setXp(long xp){
        this.xp = xp;
    }

    public String getName(){
        return this.name;
    }

    public void settingHomeground() {
        System.out.println("LET'S CHOOCE A HOMEGROUND: ");
        System.out.println("    1.HILLCREST \n    2.MARSHLAND\n    3.DESERT\n    4.ARCANE");
        while (true) {
            try {
                System.out.print("Enter your choice: ");
                int choice = prompt.nextInt();
                if (choice > 4 || choice < 1) {
                    System.out.println("Invalid entry. Please Retry\n");
                    continue;
                }
                this.homeground = choice;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                prompt.nextLine(); 
            }
        }
        prompt.nextLine();
    }
    public void settingInitialArmy(Display disObj) throws InterruptedException {
        int warriorCategory = 1, warrior;
        System.out.println("Let's Create your Army");

        while (warriorCategory > 0 && warriorCategory < 6) {
            while (true) {
                System.out.println("\n\n                             Gold Coins : "+this.getCoins());
    
                disObj.printChoices(warriorCategory);
                System.out.println();
                System.out.print("Choose your preference:  ");
    
                try {
                    warrior = prompt.nextInt();
                    prompt.nextLine();
                    Thread.sleep(500);
    
                    if (warrior > 5 || warrior < 1) {
                        System.out.println("Invalid entry. Please Retry\n");
                        continue;
                    }
                    Army boughtChar = settingArmy(warriorCategory, warrior);
                    if(boughtChar.getPrice()<=this.coins){
                        this.armyOfPlayer.add(boughtChar);
                        this.coins -= boughtChar.getPrice();
                    }
                    else{
                        System.out.println("You dont have enough coins. Re create your army!!!!");
                        this.armyOfPlayer.clear();
                        this.coins = 500;
                        warriorCategory =1;
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    prompt.nextLine(); 
                }
            }
            warriorCategory++;
        }
        System.out.println("... ALL SET FOR THE BATTLE... ");
    }

    public void printPlayerStat(){
        System.out.println("        Your coins: "+ this.getCoins());
        System.out.println("        Your XP: "+ this.getXp());
        String home = null;
            switch (this.homeground) {
                case 1:
                    home = "HILLCREST";
                    break;
                case 2:
                    home = "MARSHLAND";
                    break;
                case 3:
                    home = "DESERT";
                    break;
                case 4:
                    home = "ARCANE";
                    break;
                default:
                    break;
            }
        System.out.println("        Your HomeGround: "+ home);
        System.out.println("\n        Your Army: ");

        for(int i=0; i<armyOfPlayer.size(); i++){
            Army charactor = armyOfPlayer.get(i);
            System.out.println("            "+charactor.getName());
        }
    }

    private void setArmy(HashMap<Integer,Integer> map, boolean initialArmySetting){
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(initialArmySetting){
                    armyOfPlayer.add(settingArmy(key, value));
                    
                }
            else{
                Army ar = settingArmy(key,value);
                if(this.coins>=ar.getPrice()){
                    armyOfPlayer.set(key-1,ar);

                    this.coins -= ar.getPrice();
                    System.out.println("You have successfully purchased: " + ar.getName());
                    System.out.println("Your new balance: " + this.coins);
                    
                }
                else{
                    System.out.println("You dont have enough coins.");
                }
            }
        }
    }
    
    private Army settingArmy(int key,int value){
        if(this.armyOfPlayer.size() == 5){
            double soldMoney = this.armyOfPlayer.get(key-1).getPrice()*0.9;
            this.coins += (long) soldMoney;
            }
        switch (key) {
            case 1: // Archer
                switch (value) {
                    case 1:
                        return new Shooter();
                    case 2:
                        return new Ranger();
                        
                    case 3:
                        return new Sunfire();
                        
                    case 4:
                        return new Zing();
                        
                    case 5:
                        return new Saggitarius();
                }
                break;
            case 2: // Knight
                switch (value) {
                    case 1:
                        return new Squire();
                    case 2:
                        return new Cavalier();
                        
                    case 3:
                        return new Templar();
                        
                    case 4:
                        return new Zoro();
                        
                    case 5:
                        return new Swiftblade();
                    }
                break;
            case 3: // Mage
                switch (value) {
                    case 1:
                        return new Warlock();
                    case 2:
                        return new Illusionist();
                    case 3:
                        return new Enchanter();
                    case 4:
                        return new Conjurer();
                    case 5:
                        return new Eldritch();
                }
                break;
            case 4: // Healer
                switch (value) {
                    case 1:
                        return new Soother();
                        
                    case 2:
                        return new Medic();
                        
                    case 3:
                        return new Alchemist();
                        
                    case 4:
                        return new Saint();
                        
                    case 5:
                        return new Lightbringer();
            }
                break;
            case 5: // MythicalCreature
                switch (value) {
                    case 1:
                        return new Dragon();
                        
                    case 2:
                        return new Basilisk();
                        
                    case 3:
                        return new Hydra();
                        
                    case 4:
                        return new Phoenix();
                        
                    case 5:
                        return new Pegasus();
            }
        }
        return null;
    }

    public void addEquipments(List<Army> character ,HashMap<Integer, Integer> equipments, Display disObj) {
        int equipmentCategory, equipment;

        while (true) {
            System.out.println("Which equipment do you need to buy");
            System.out.println("    1. ARMOUR");
            System.out.println("    2. ARTIFACT");
            System.out.println("    0. EXIT");
            System.out.print("Enter your option: ");

            try {
                equipmentCategory = prompt.nextInt();
                prompt.nextLine();

                if (0 <=equipmentCategory && equipmentCategory < 3) {
                    break;
                }


                System.out.println("Invalid entry");
                System.out.println("Please Re-enter");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                prompt.nextLine(); 
            }
        }

        if (equipmentCategory == 0) {
            return ;
        }

        while (true) {

            System.out.println("\n\n                             Gold Coins : "+this.coins);
            disObj.printChoices(equipmentCategory+5);
            System.out.println("Enter 0 to exit\n");
            System.out.print("Enter your option: ");

            try {
                equipment = prompt.nextInt();
                if(equipment==0){
                    System.out.println("Back to main menu.");
                    return;
                }
                prompt.nextLine();

                if (equipment < 0 || equipment > 3) {
                    System.out.println("Invalid Entry");
                    System.out.println("Please Re-enter\n");
                    continue;
                }

                System.out.println("Which warrior do you need to add this");
                System.out.println("    1. ARCHER");
                System.out.println("    2. KNIGHT");
                System.out.println("    3. MAGES");
                System.out.println("    4. HEALER");
                System.out.println("    5. MYTHICAL CREATURE");

                int charIndex=prompt.nextInt();
                prompt.nextLine();
            
                switch (equipmentCategory) {
                    case 1:
                        if(character.get(charIndex-1).getArmor()){
                            switch (equipments.get(charIndex+1)) {
                                case 1:
                                    Chainmail c1=new Chainmail();
                                    c1.sellArmor(character.get(charIndex-1));
                                    break;
                                case 2:
                                    Regalia r1=new Regalia();
                                    r1.sellArmor(character.get(charIndex-1));
                                    break;
                                
                                case 3:
                                    Fleece f1=new Fleece();
                                    f1.sellArmor(character.get(charIndex-1));
                                    break;                                                             
                            }
                        }
                        switch (equipment) {
                            case 1:
                                Army ar=character.get(charIndex-1);
                                Chainmail c1=new Chainmail();
                                c1.buyArmor(ar, this);
                                equipments.put(charIndex+1, 1);
                                break;
                            case 2:  
                                Regalia r1=new Regalia();
                                r1.buyArmor(character.get(charIndex-1), this);
                                equipments.put(charIndex+1, 2);
                                break;
                            case 3:
                                Fleece f1=new Fleece();
                                f1.buyArmor(character.get(charIndex-1), this);
                                equipments.put(charIndex+1, 3);
                                break;                                  
                        }
                        break;

                    case 2:
                        if(character.get(charIndex-1).getArtfact()){
                            switch (equipments.get(charIndex+5+1)) {
                                case 1:                                   
                                    Excalibur e1=new Excalibur();
                                    e1.sellArtfact(character.get(charIndex-1));
                                    break;                                
                                case 2:
                                    Amulet a1=new Amulet();
                                    a1.sellArtfact(character.get(charIndex-1));
                                    break;                                
                                case 3:
                                    Crystal c1=new Crystal();
                                    c1.sellArtfact(character.get(charIndex-1));
                                    break;                                                               
                            }
                        }

                        switch (equipment) {
                            case 1:                              
                                Excalibur e1=new Excalibur();
                                e1.buyArtfact(character.get(charIndex-1), this);
                                equipments.put(charIndex+5+1, 1);
                                break;
                            case 2:
                                Amulet a1=new Amulet();
                                a1.buyArtfact(character.get(charIndex-1), this);
                                equipments.put(charIndex+5+1, 2);
                                break;                          
                            case 3:
                                Crystal c1=new Crystal();
                                c1.buyArtfact(character.get(charIndex-1), this);
                                equipments.put(charIndex+5+1, 3);
                                break;                                                        
                        }
                }
                return;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                prompt.nextLine();
            }
        }
    }
    public void updateArmy(Display disObj) {
        HashMap<Integer, Integer> outputHashMap = new HashMap<>();
        int warriorCategory, warrior;
    
        while (true) {
            System.out.println("Which warrior do you need to buy");
            System.out.println("    1. ARCHER");
            System.out.println("    2. KNIGHT");
            System.out.println("    3. MAGES");
            System.out.println("    4. HEALER");
            System.out.println("    5. MYTHICAL CREATURE");
            System.out.print("Enter your option: ");
    
            try {
                warriorCategory = prompt.nextInt();
                prompt.nextLine();
    
                if (0 < warriorCategory && warriorCategory < 6) {
                    break;
                }
    
                System.out.println("Invalid entry");
                System.out.println("Please Re-enter");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                prompt.nextLine(); 
            }
        }
    
        while (true) {
            System.out.println(" ");
            System.out.println(" ");
    
            System.out.println("                            Gold Coins : "+this.getCoins());
            disObj.printChoices(warriorCategory);
            System.out.println("Enter 0 to exit\n");
            System.out.print("Enter your option: ");
    
            try {
                warrior = prompt.nextInt();
                if(warrior == 0){
                    return;
                }
                prompt.nextLine();
    
                if (warrior < 0 || warrior > 5) {
                    System.out.println("Invalid Entry");
                    System.out.println("Please Re-enter\n");
                    continue;
                }
                outputHashMap.put(warriorCategory, warrior);
                this.setArmy(outputHashMap, false);
                return;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                prompt.nextLine(); 
            }
        }
    }
}
