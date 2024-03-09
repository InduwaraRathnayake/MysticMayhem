public class Army {
    protected String name;
    public Army(String name){
        this.name = name;
    }

}
class Archer extends Army{
    protected String name1;
    public Archer(String name){
        super(name);
    }
}

class Shoorter extends Archer{
    public Shoorter(String name){
        super(name);
    }

    public String getName(){
        return this.name;
    }

    public String getName(String name, int id){
        return this.name;
    }
}
