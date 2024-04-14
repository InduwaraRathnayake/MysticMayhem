import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Battle {
    Scanner prompt = new Scanner(System.in);

    private Player searchOpponent(List<Player> players) throws InterruptedException{
        System.out.print("\n ...LET'S SEARCH FOR A OPPONENT TO BATTLE ");
        for(int i =0; i<10; i++){
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println();
        
        System.out.println("\nOPPONENT IS FOUND!!!");
        int i =0;
        while(true){
            Player opponent = players.get(i);


            System.out.println("\nOpponent name: " + opponent.getName()+ " Opponent XP: " + opponent.getXp());

            System.out.println("\n1.  Attack");
            System.out.println("2.  Skip");
            System.out.println("\nWOULD YOU LIKE TO BATTLE WITH THIS OPPONENT OR SKIP NOW? ");
            System.out.print("Enter an option: ");
            int choice = prompt.nextInt();
            prompt.nextLine();

            Thread.sleep(500);

            if(choice == 1){
                return opponent;
            }
            else if (choice == 2){
                i++;
                if(i>=players.size()){
                    i=0;
                }
            }
            else{
                System.out.println("Enter a valid integer.");
            }
        }
    }

    private void winWar(Player user, Player npc, boolean userWin) {
        long newUserCoins;
        long newNpcCoins;
        if (userWin) {
            System.out.println(user.getName()+" Won!!!!!");
            newUserCoins = Math.round(user.getCoins() + npc.getCoins() * 0.1);
            user.setCoins(newUserCoins);

            newNpcCoins = Math.round(npc.getCoins() - npc.getCoins() * 0.1);
            npc.setCoins(newNpcCoins);

            long newUserXp = user.getXp() + 1;
            user.setXp(newUserXp);

        } else {
            System.out.println(npc.getName()+" Won!!!!!");
            newUserCoins = Math.round(npc.getCoins() + user.getCoins() * 0.1);
            npc.setCoins(newUserCoins);

            newNpcCoins = Math.round(user.getCoins() - user.getCoins() * 0.1);
            npc.setCoins(newNpcCoins);

            long newNpcXp = user.getXp() + 1;
            npc.setXp(newNpcXp);
        }
    }

    private List<Army> prioritySpeed(List<Army> setOfArmy) {
        List<Army> sortedArmy = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            sortedArmy.add(null);
        }
        for (Army ar : setOfArmy) {
            if (ar instanceof Healer) {
                sortedArmy.set(0, ar);
            } else if (ar instanceof Mage) {
                sortedArmy.set(1, ar);
            } else if (ar instanceof MythicalCreature) {
                sortedArmy.set(2, ar);
            } else if (ar instanceof Knight) {
                sortedArmy.set(3, ar);
            } else {
                sortedArmy.set(4, ar);
            }
        }
        List<Army> finalizedSortedArmy = new ArrayList<>();
        for(int i=0; i<5; i++){
            if(sortedArmy.get(i) != null){
                finalizedSortedArmy.add(sortedArmy.get(i));
            }
        }
        return finalizedSortedArmy;
    }

    private List<Army> priorityDefence(List<Army> setOfArmy) {
        List<Army> sortedArmy = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            sortedArmy.add(null);
        }
        for (Army ar : setOfArmy) {
            if (ar instanceof Mage) {
                sortedArmy.set(0, ar);
            } else if (ar instanceof Knight) {
                sortedArmy.set(1, ar);
            } else if (ar instanceof Archer) {
                sortedArmy.set(2, ar);
            } else if (ar instanceof MythicalCreature) {
                sortedArmy.set(3, ar);
            } else {
                sortedArmy.set(4, ar);
            }
        }

        List<Army> finalizedSortedArmy = new ArrayList<>();
        for(int i=0; i<5; i++){
            if(sortedArmy.get(i) != null){
                finalizedSortedArmy.add(sortedArmy.get(i));
            }
        }
        return finalizedSortedArmy;
    }

    private void battleRound(Player npc, Army attacker, List<Army> userArmy, List<Army> npcArmy, List<Army> defenderSet, double attcakPower){
        double health;
        Army defender;
        if(npc.getHomeground() == 4 && attacker.isMystic()){
            attacker.arcaneHealthIncrease();
        }

        if (attacker instanceof Healer) {
            Collections.sort(userArmy, Comparator.comparingDouble(a -> a.getHealth()));
            defender = userArmy.get(0);
            if(npc.getHomeground() == 4 && defender.isMystic()){
                defender.arcaneHealthIncrease();
            }
            health = defender.getHealth() + attacker.getAttack()*attcakPower * 0.1;
        } else {
            defender = defenderSet.get(0);
            if(npc.getHomeground() == 4 && defender.isMystic()){
                defender.arcaneHealthIncrease();
            }
            health = defender.getHealth() - attacker.getAttack()*attcakPower * 0.5 + defender.getDefence() * 0.1;
        }
        System.out.println(attacker.getName() + " attacks " + defender.getName());

        if(health <= 0){
            health =0;
        }
        defender.setHealth(health);
        System.out.printf("%s's health: %.1f%n", defender.getName(), defender.getHealth());
        System.out.printf("%s's health: %.1f%n", attacker.getName(), attacker.getHealth());


        if(defender.getHealth() == 0){
            System.out.println("\n" + defender.getName()+ " died!!!");
        }

        if(defender.getHealth()<=0){
            for(int i =0 ; i< npcArmy.size(); i++){
                Army ar = npcArmy.get(i);
                if(ar.getName() == defender.getName()){
                    npcArmy.remove(ar);
                    break;
                }
            }
        }
    }

    public void stratWar(List<Army> userArmy, List<Player> playersList, Player user) throws CloneNotSupportedException, InterruptedException {
        int turns = 10;

        Player npc = searchOpponent(playersList);
        List<Army> npcArmy = npc.battleTroops();

        if(npc.getHomeground() == 1){//1 = hilcrest
            for(Army ar: npcArmy){
                ar.hillcrestsUpdate();
            }
            for(Army ar : userArmy){
                ar.hillcrestsUpdate();
            }
        }
        else if (npc.getHomeground() == 2) {
            for(Army ar: npcArmy){
                ar.marshlandUpdate();
            }
            for(Army ar : userArmy){
                ar.marshlandUpdate();
            }
        }
        else if (npc.getHomeground() == 3){
            for(Army ar: npcArmy){
                ar.desertUpdate();
            }
            for(Army ar : userArmy){
                ar.desertUpdate();
            }
        }
        else{
            for(Army ar: npcArmy){
                ar.arcaneUpdate();
            }
            for(Army ar : userArmy){
                ar.arcaneUpdate();
            }
        }
        
        Army attacker;
        int j =1;
        System.out.println("\nBattle is Declared !!!");

        System.out.println(user.getName()+ " vs. " + npc.getName());
        while (turns-- > 0) {
            System.out.println("=====================================================================================");

            System.out.println("            Turn "+ j +": " + user.getName());
            List<Army> attOrderOfUser = prioritySpeed(userArmy);
            List<Army> defOrderOfnpc = priorityDefence(npcArmy);

            // user -> npc
            Collections.sort(attOrderOfUser, Comparator.comparingDouble(a -> ((Army) a).getSpeed())); 
            Collections.sort(defOrderOfnpc, Comparator.comparingDouble(a -> a.getDefence()));

            attacker = attOrderOfUser.get(attOrderOfUser.size()-1);  
            battleRound(npc, attacker, userArmy, npcArmy, defOrderOfnpc,1);
            Thread.sleep(500);

            if (npcArmy.isEmpty()) {
                winWar(user, npc, true);
                break;
            }

            if(npc.getHomeground()==1 && attacker.isHighlander()){
                System.out.println("\n***Bonus attack!!!!***");
                battleRound(npc, attacker, userArmy, npcArmy, defOrderOfnpc,0.2);
                Thread.sleep(500);
       
                if (npcArmy.isEmpty()) {
                    winWar(user, npc, true);
                    break;
                }
            }

            System.out.println("\n             Turn "+ j +": " + npc.getName());
            List<Army> attOrderOfnpc = prioritySpeed(npcArmy);
            List<Army> defOrderOfUser = priorityDefence(userArmy);

            // npc -> user
            Collections.sort(attOrderOfnpc, Comparator.comparingDouble(a -> ((Army) a).getSpeed())); // 5
            Collections.sort(defOrderOfUser, Comparator.comparingDouble(a -> a.getDefence())); // 1

            attacker = attOrderOfnpc.get(attOrderOfnpc.size()-1);
            battleRound(npc, attacker,npcArmy ,userArmy, defOrderOfUser, 1);
            Thread.sleep(500);

            if (userArmy.isEmpty()) {
                winWar(user, npc, false);
                break;
            }
            if(npc.getHomeground()==1 && attacker.isHighlander()){
                System.out.println("\n***Bonus attack!!!!***");
                battleRound(npc, attacker, npcArmy, userArmy, defOrderOfUser, 0.2);
                Thread.sleep(500);
                
                if (userArmy.isEmpty()) {
                    winWar(user, npc, false);
                    break;
                }
            }
            Thread.sleep(500);
            j++;
        }
        if(userArmy.size() !=0 && npcArmy.size() !=0){
            System.out.println("\nMatch Draw!!!!!");
            }

        Thread.sleep(1000);
        System.out.println("\n" + user.getName()+" Xp: " + user.getXp() + " gold coins: " + user.getCoins() );
        System.out.println(npc.getName()+" Xp: " + npc.getXp() + " gold coins: " + npc.getCoins() + "\n");
    }
}
