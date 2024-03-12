class Army {
	private String name;
	private double price, attack, defence, health, speed;
    private boolean armor = false, artfact = false;
    
    private int homeground;
	
    public void setHomeGround(int homeground){
        //highlanders = 1;
        //marshlanders = 2;
        //sunchildren = 3;
        //mystics = 4;
        this.homeground = homeground;
    }
    public int getHomeGround(){
        return this.homeground;
    }
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
	public String getter(){
        return this.name;
    }
	public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public double getAttack() {
        return this.attack;
    }
    public double getDefence() {
        return this.defence;
    }
    public double getHealth() {
        return this.health;
    }
    public double getSpeed() {
        return this.speed;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
    public void setDefence(double defence) {
        this.defence = defence;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
	public void addEquipment(Inventory i , Army ar) {
		ar.setPrice(ar.getPrice()+(int)(i.getPrice()*0.2));
		ar.setAttack(ar.getAttack()+i.getAttack());
		ar.setDefence(ar.getDefence()+i.getDefence());
		ar.setHealth(ar.getHealth()+i.getHealth());
		ar.setSpeed(ar.getSpeed()+i.getSpeed());
	}	
	
	public void removeEquipment(Inventory i, Army ar) {
		ar.setPrice(ar.getPrice()-(int)(i.getPrice()*0.2));
		ar.setAttack(ar.getAttack()-i.getAttack());
		ar.setDefence(ar.getDefence()-i.getDefence());
		ar.setHealth(ar.getHealth()-i.getHealth());
		ar.setSpeed(ar.getSpeed()-i.getSpeed());
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
    setHomeGround(1);
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
    setHomeGround(1);
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
    setHomeGround(3);
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
    setHomeGround(3);
    
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
    setHomeGround(4);

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
    setHomeGround(2);
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
    setHomeGround(1);

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
    setHomeGround(3);

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
    setHomeGround(1);

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
    setHomeGround(2);

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
    setHomeGround(2);

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
    setHomeGround(4);

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
    setHomeGround(1);

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
    setHomeGround(1);

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
    setHomeGround(4);
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
    setHomeGround(3);
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
    setHomeGround(1);

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
    setHomeGround(2);
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
    setHomeGround(4);

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
    setHomeGround(3);

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
    setHomeGround(3);
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
    setHomeGround(2);
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
    setHomeGround(2);
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
    setHomeGround(3);
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
    setHomeGround(4);

	}
}