public abstract class Army implements Cloneable {
	private boolean highlander=false,marshlander=false,sunchildren=false,mystic=false;
	
	private String name;
	private double Price, Attack, Defence, Health, Speed;
	private boolean armor = false, artfact = false;
	
	public Army returnArmy(){
		return this;
	}
	public boolean getArmor(){
		return this.armor;
	}
	public void setArmor(boolean armor){
		this.armor = armor;
	}
	public boolean getArtfact(){
		return this.artfact;
	}
	public void setArtfact(boolean artfact){
		this.artfact = artfact;
	}

	@Override
	public Object clone(){
		try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported for this object", e);
        }
	}

	//getters
	public String getter(){
        return this.name;
    }
	
	public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.Price;
    }

    public double getAttack() {
        return this.Attack;
    }

    public double getDefence() {
        return this.Defence;
    }

    public double getHealth() {
        return this.Health;
    }

    public double getSpeed() {
        return this.Speed;
    }
    public boolean isHighlander() {
    	return this.highlander;
    }
    public boolean isMarshlander() {
    	return this.marshlander;
    }
    public boolean isSunchildren() {
    	return this.sunchildren;
    }
    public boolean isMystic() {
    	return this.mystic;
    }
    
    
    
    //setters
	public void setHighlander(boolean highlander) {
		this.highlander = highlander;
	}
	public void setMarshlander(boolean marshlander) {
		this.marshlander = marshlander;
	}
	public void setSunchildren(boolean sunchildren) {
		this.sunchildren = sunchildren;
	}
	public void setMystic(boolean mystic) {
		this.mystic = mystic;
	}
	public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setAttack(double Attack) {
		Attack=Math.round(Attack*10.0)/10.0;
        this.Attack = Attack;
    }

    public void setDefence(double Defence) {
		Defence=Math.round(Defence*10.0)/10.0;
        this.Defence = Defence;
    }

    public void setHealth(double Health) {
		Health=Math.round(Health*10.0)/10.0;
        this.Health = Health;
    }

    public void setSpeed(double Speed) {
		Speed=Math.round(Speed*10.0)/10.0;
        this.Speed = Speed;
    }
    
    public void hillcrestsUpdate() {
    	if (this.highlander) {
    		this.setAttack(this.getAttack()+1);
    		this.setDefence(this.getDefence()+1);
    	}
    	else if (this.marshlander) {
    		this.setSpeed(this.getSpeed()-1);
    	}
    	else if (this.sunchildren) {
    		this.setSpeed(this.getSpeed()-1);
    	}
    	
    }
    
    public void marshlandUpdate() {
    	if (this.marshlander) {
    		this.setDefence(this.getDefence()+2);
    	}
    	else if (this.sunchildren) {
    		this.setAttack(this.getAttack()-1);
    	}
		else if (this.mystic){
			this.setSpeed(this.getSpeed()-1);
		}
    }
    
    public void desertUpdate() {
    	if (this.marshlander) {
    		this.setHealth(this.getHealth()-1);
    	}
		else if (this.sunchildren){
			this.setAttack(this.getAttack()+1);
		}
    }
    
    public void arcaneUpdate() {
    	if (this.mystic) {
    		this.setAttack(this.getAttack()+2);
    	}
    	else if (this.highlander || this.marshlander) {
    		this.setSpeed(this.getSpeed()-1);
    		this.setDefence(this.getDefence()-1);
    	}
    	
    }
    
    public void arcaneHealthIncrease() {
        if (this.mystic){
    	    this.setHealth(this.getHealth()*1.1);
        }
    }
		
}

class Archer extends Army{
	
}

class Knight extends Army {
	
	
}

class Mage extends Army {
	
	
}

class Healer extends Army {
	
	
}

class MythicalCreature extends Army {
	
	
}

// creating archers...
class Shooter extends Archer {
	public Shooter() {
	setName("Shooter");
	setPrice(80);
	setAttack(11);
	setDefence(4);
	setHealth(6);
	setSpeed(9);
	setHighlander(true);
	}
}

class Ranger extends Archer{
	public Ranger() {
	setName("Ranger");
	setPrice(115);
	setAttack(14);
	setDefence(5);
	setHealth(8);
	setSpeed(10);
	setHighlander(true);
	}
}

class Sunfire extends Archer {
	public Sunfire() {
	setName("Sunfire");
	setPrice(160);
	setAttack(15);
	setDefence(5);
	setHealth(7);
	setSpeed(14);
	setSunchildren(true);
	}
}

class Zing extends Archer {
	public Zing() {
	setName("Zing");
	setPrice(200);
	setAttack(16);
	setDefence(9);
	setHealth(11);
	setSpeed(14);
	setSunchildren(true);
	}
}

class Saggitarius extends Archer {
	public Saggitarius() {
	setName("Saggitarius");
	setPrice(230);
	setAttack(18);
	setDefence(7);
	setHealth(12);
	setSpeed(17);
	setMystic(true);
	}
}

class Squire extends Knight{
	public Squire() {
	setName("Squire");
	setPrice(85);
	setAttack(8);
	setDefence(9);
	setHealth(7);
	setSpeed(8);
	setMarshlander(true);
	}
}

class Cavalier extends Knight{
	public Cavalier() {
	setName("Cavalier");
	setPrice(110);
	setAttack(10);
	setDefence(12);
	setHealth(7);
	setSpeed(10);
	setHighlander(true);
	}
}

class Templar extends Knight{
	public Templar() {
	setName("Templar");
	setPrice(155);
	setAttack(14);
	setDefence(16);
	setHealth(12);
	setSpeed(12);
	setSunchildren(true);
	}
}

class Zoro extends Knight{
	public Zoro() {
	setName("Zoro");
	setPrice(180);
	setAttack(17);
	setDefence(16);
	setHealth(13);
	setSpeed(14);
	setHighlander(true);
	}
}

class Swiftblade extends Knight{
	public Swiftblade() {
	setName("Swiftblade");
	setPrice(250);
	setAttack(18);
	setDefence(20);
	setHealth(17);
	setSpeed(13);
	setMarshlander(true);
	}
}

class Warlock extends Mage{
	public Warlock() {
	setName("Warlock");
	setPrice(100);
	setAttack(12);
	setDefence(7);
	setHealth(10);
	setSpeed(12);
	setMarshlander(true);
	}
}

class Illusionist extends Mage{
	public Illusionist() {
	setName("Illusionist");
	setPrice(120);
	setAttack(13);
	setDefence(8);
	setHealth(12);
	setSpeed(14);
	setMystic(true);
	}
}

class Enchanter extends Mage{
	public Enchanter() {
	setName("Enchanter");
	setPrice(160);
	setAttack(16);
	setDefence(10);
	setHealth(13);
	setSpeed(16);
	setHighlander(true);
	}
}

class Conjurer extends Mage{
	public Conjurer() {
	setName("Conjurer");
	setPrice(195);
	setAttack(18);
	setDefence(15);
	setHealth(14);
	setSpeed(12);
	setHighlander(true);
	}
}

class Eldritch extends Mage{
	public Eldritch() {
	setName("Eldritch");
	setPrice(270);
	setAttack(19);
	setDefence(17);
	setHealth(18);
	setSpeed(14);
	setMystic(true);
	}
}

class Soother extends Healer{
	public Soother() {
	setName("Soother");
	setPrice(95);
	setAttack(10);
	setDefence(8);
	setHealth(9);
	setSpeed(6);
	setSunchildren(true);
	}
}

class Medic extends Healer{
	public Medic() {
	setName("Medic");
	setPrice(125);
	setAttack(12);
	setDefence(9);
	setHealth(10);
	setSpeed(7);
	setHighlander(true);
	}
}

class Alchemist extends Healer{
	public Alchemist() {
	setName("Alchemist");
	setPrice(150);
	setAttack(13);
	setDefence(13);
	setHealth(13);
	setSpeed(13);
	setMarshlander(true);
	}
}

class Saint extends Healer{
	public Saint() {
	setName("Saint");
	setPrice(200);
	setAttack(16);
	setDefence(14);
	setHealth(17);
	setSpeed(9);
	setMystic(true);
	}
}
class Lightbringer extends Healer{
	public Lightbringer() {
	setName("Lightbringer");
	setPrice(260);
	setAttack(17);
	setDefence(15);
	setHealth(19);
	setSpeed(12);
	setSunchildren(true);
	}
}

class Dragon extends MythicalCreature{
	public Dragon() {
	setName("Dragon");
	setPrice(120);
	setAttack(12);
	setDefence(14);
	setHealth(15);
	setSpeed(8);
	setSunchildren(true);
	}
}

class Basilisk extends MythicalCreature{
	public Basilisk() {
	setName("Basilisk");
	setPrice(165);
	setAttack(15);
	setDefence(11);
	setHealth(10);
	setSpeed(12);
	setMarshlander(true);
	}
}

class Hydra extends MythicalCreature{
	public Hydra() {
	setName("Hydra");
	setPrice(205);
	setAttack(12);
	setDefence(16);
	setHealth(15);
	setSpeed(11);
	setMarshlander(true);
	}
}

class Phoenix extends MythicalCreature{
	public Phoenix() {
	setName("Phoenix");
	setPrice(275);
	setAttack(17);
	setDefence(13);
	setHealth(17);
	setSpeed(19);
	setSunchildren(true);
	}
}

class Pegasus extends MythicalCreature{
	public Pegasus() {
	setName("Pegasus");
	setPrice(340);
	setAttack(14);
	setDefence(18);
	setHealth(20);
	setSpeed(20);
	setMystic(true);
	}
}
