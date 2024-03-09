import java.util.List;

public class Battle {
    
    public void winWar(Player user, Player npc, boolean win){
        double newUserCoins,newNpcCoins;
        if(win){
            newUserCoins = user.getCoin() + npc.getCoin()*0.1;
            user.setCoins(newUserCoins);

            newNpcCoins = npc.getCoin() - npc.getCoin()*0.1;
            npc.setCoins(newNpcCoins);
        }
        else{
            newUserCoins = npc.getCoin() + user.getCoin()*0.1;
            npc.setCoins(newUserCoins);

            newNpcCoins = user.getCoin() - user.getCoin()*0.1;
            user.setCoins(newNpcCoins);
        }
    }

    public void stratWar(List<Army> userArmy,List<Army> npcArmy){
        int truns = 20;

        while(truns-- >0){

        }
    }
    
}
