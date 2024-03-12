import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Battle {
    
    public void winWar(Player user, Player npc, boolean win){
        long newUserCoins;
        long newNpcCoins;
        if(win){
            newUserCoins = Math.round(user.getCoins() + npc.getCoins()*0.1);
            user.setCoins(newUserCoins);

            newNpcCoins = Math.round(npc.getCoins() - npc.getCoins()*0.1);
            npc.setCoins(newNpcCoins);
        }
        else{
            newUserCoins = Math.round(npc.getCoins() + user.getCoins()*0.1);
            npc.setCoins(newUserCoins);

            newNpcCoins = Math.round(user.getCoins() - user.getCoins()*0.1);
            user.setCoins(newNpcCoins);
        }
    }
//Healer < Mage < Mythical Creature < Knight < Archer
    private List<Army> piorityAttack(List<Army> setOfArmy){
        List<Army> sortedArmy = new ArrayList<>(); //{0,0,0,0,0,0}  A[0]=healer A={healer,0,0,0,Archer}

        for(int i=0; i<5; i++){
            sortedArmy.add(null);
        }
        for(Army ar : setOfArmy){
            if( ar instanceof Healer){
                sortedArmy.set(0, ar);
            }
            else if( ar instanceof Mage){
                sortedArmy.set(1, ar);
            }
            else if( ar instanceof MythicalCreature){
                sortedArmy.set(2, ar);
            }
            else if( ar instanceof Knight){
                sortedArmy.set(3, ar);
            }
            else{
                sortedArmy.set(4, ar);
            }
        }
        return sortedArmy;
    }

    //Mage < Knight< Archer < Mythical Creature < Healer
    private List<Army> piorityDefence(List<Army> setOfArmy){
        List<Army> sortedArmy = new ArrayList<>(); //{0,0,0,0,0,0}  A[0]=healer A={healer,0,0,0,Archer}

        for(int i=0; i<5; i++){
            sortedArmy.add(null);
        }
        for(Army ar : setOfArmy){
            if( ar instanceof Mage){
                sortedArmy.set(0, ar);
            }
            else if( ar instanceof Knight){
                sortedArmy.set(1, ar);
            }
            else if( ar instanceof Archer){
                sortedArmy.set(2, ar);
            }
            else if( ar instanceof MythicalCreature){
                sortedArmy.set(3, ar);
            }
            else{
                sortedArmy.set(4, ar);
            }
        }
        return sortedArmy;
    }

    public void stratWar(List<Army> userArmy,List<Army> npcArmy){
        //{whitewolf} search 

        int truns = 10;

        while(truns-- >0){
            //user-> npc
            List<Army> attOrderOfUser = piorityAttack(userArmy);
            List<Army> defOrderOfnpc = piorityDefence(npcArmy);
            Collections.sort(attOrderOfUser, Comparator.comparingDouble(a -> a.getSpeed()));  //5
            Collections.sort(defOrderOfnpc, Comparator.comparingDouble(a -> a.getDefence())); //1

            double health ;
            Army defender = defOrderOfnpc.get(0);
            Army attacker = attOrderOfUser.get(4);

            health = defender.getHealth()- attacker.getAttack()*0.5 +  defender.getDefence()*0.1;
            defender.setHealth(health);

            if(defender.getHealth()<=0){
                defOrderOfnpc.remove(0);
            }
            //npc -> user
            


            //{a, k, m, o, d} // d<o<m , a>k //d=m=o, a=k // // {k, a, d, o, m}
        }
    }
    
}


