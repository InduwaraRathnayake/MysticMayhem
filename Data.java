package project3;


class Army {
	private String name;
	private int Price, Attack, Defence, Health, Speed;
	
	public String getter(){
        return this.name;
    }
	
	
	public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public void setAttack(int Attack) {
        this.Attack = Attack;
    }

    public void setDefence(int Defence) {
        this.Defence = Defence;
    }

    public void setHealth(int Health) {
        this.Health = Health;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }
    
    
	public void updateCharacter(Inventory i , Army ar) {
		ar.Price += (int) (ar.Price * 0.2);
		ar.Attack = ar.Attack + i.attack;
		ar.Defence = ar.Defence + i.defence;
		ar.Health = ar.Health + i.health;
		ar.Speed = ar.Speed + i.speed;
	}
	
	public void removeEquipment(Inventory i, Army ar) {
		ar.Price -= (int) (ar.Price * 0.2);
		ar.Attack = ar.Attack - i.attack;
		ar.Defence = ar.Defence - i.defence;
		ar.Health = ar.Health - i.health;
		ar.Speed = ar.Speed - i.speed;
	}
	
	
	
}

class Archer extends Army{
	protected String name;
	
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
	}
}



public class Data {
	
	
	public static void main(String[] args) {
	
		Inventory i1 = new Chainmail();
		Army ar1 = new Zoro(); 
		
		System.out.println(ar1.Defence);
		ar1.updateCharacter(i1 , ar1);
		System.out.println(ar1.Defence);
		ar1.removeEquipment(i1, ar1);
		System.out.println(ar1.Defence);
		
	}
}

