public class Player {
    private long coins = 500;
    private int xp;
    private String name;
    private int homeground;

    public Player(UserData user){
        this.name = user.getName();
    }

    public Player(UserData user, int xp, int coins){
        this.name = user.getName();
        this.xp = xp;
        this.coins = coins;
    }

    public long getCoins(){
        return this.coins;
    }

    public void setCoins(long newUserCoins){
        this.coins = newUserCoins;
    }

    public int getXp(){
        return xp;
    }

    public String getName(){
        return this.name;
    }
    

}
