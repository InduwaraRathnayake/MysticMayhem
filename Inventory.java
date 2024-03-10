package project3;

public class Inventory {
	
	protected int attack, defence, health, speed;
	protected int price;
	protected String name;

	public int getattack() {
		return attack;
	}

	public void setattack(int attack) {
		this.attack = attack;
	}

	public int getdefence() {
		return defence;
	}

	public void setdefence(int defence) {
		this.defence = defence;
	}

	public int gethealth() {
		return health;
	}

	public void sethealth(int health) {
		this.health = health;
	}

	public int getspeed() {
		return speed;
	}

	public void setspeed(int speed) {
		this.speed = speed;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
}

class Armour extends Inventory{
	
}

class Artefact extends Inventory{
	
}

class Chainmail extends Armour{
	public Chainmail() {
		
	setname("Chainmail");
	setprice(70);
	setattack(0);
	setdefence(1);
	sethealth(0);
	setspeed(-1);
	
	}
	
}

class Regalia extends Armour{
	public Regalia() {
		
	setname("Regalia");
	setprice(150);
	setattack(0);
	setdefence(1);
	sethealth(0);
	setspeed(0);
	
	}
	
}

class Fleece extends Armour{
	public Fleece() {
		
	setname("Fleece");
	setprice(150);
	setattack(0);
	setdefence(2);
	sethealth(1);
	setspeed(-1);
	
	}
	
}

class Excalibur extends Artefact{
	public Excalibur() {
		
	setname("Excalibur");
	setprice(150);
	setattack(2);
	setdefence(0);
	sethealth(0);
	setspeed(0);
	
	}
	
}

class Amulet extends Artefact{
	public Amulet() {
		
	setname("Amulet");
	setprice(200);
	setattack(1);
	setdefence(-1);
	sethealth(1);
	setspeed(1);
	
	}
	
}

class Crystal extends Artefact{
	public Crystal() {
		
	setname("Crystal");
	setprice(210);
	setattack(2);
	setdefence(1);
	sethealth(-1);
	setspeed(-1);
	
	}
	
}
