

public class Inventory {
	
	protected int attack, defence, health, speed;
	protected int price;
	protected String name;
	
    public int getPrice(){
        return this.price;
    }

    public void buy_armor(Army ar,Inventory in){
        if (!ar.armor && user.getCoins()>in.getPrice()) {
            ar.updateCharacter(in,ar);
            ar.armor=true;
            int coin=user.getCoins()-in.getPrice();
            user.setCoins(coin);
        }else if(!ar.armor){
            System.out.println("Your coins are not enough");
        }else if(user.getCoins()>in.getPrice()){
            System.out.println("Your"+ar.name+"already has an armor");
        }
        
    }

    public void sell_armor(Army ar,Inventory in){
        if (ar.armor) {
            ar.removeEquipment(in,ar);
            ar.armor=false;
            
        }else if(!ar.armor){
            System.out.println("You dont have an armor");
        }
        
    }

    public void buy_artfact(Army ar,Inventory in){
        if (!ar.artfact && user.getCoins()>in.getPrice()) {
            ar.updateCharacter(in,ar);
            ar.artfact=true;
            int coin=user.getCoins()-in.getPrice();
            user.setCoins(coin);
        }else if(!ar.artfact){
            System.out.println("Your coins are not enough");
        }else if(user.getCoins()>in.getPrice()){
            System.out.println("Your"+ar.name+"already has an artfact");
        }
        
    }
    public void sell_artfact(Army ar,Inventory in){
        if (ar.artfact) {
            ar.removeEquipment(in,ar);
            ar.artfact=false;
            
        }else if(!ar.artfact){
            System.out.println("You dont have an artfact");
        }
        
    }



}

class Armour extends Inventory{
	
}


class Artefact extends Inventory{
	
}

class Chainmail extends Armour{
	public Chainmail() {
		
	this.name = "Chainmail";
	this.price = 70;
	this.attack = 0;
	this.defence = 1;
	this.health = 0;
	this.speed = -1;
	
	}
	
}

class Regalia extends Armour{
	public Regalia() {
		
	this.name = "Regalia";
	this.price = 150;
	this.attack = 0;
	this.defence = 1;
	this.health = 0;
	this.speed = 0;
	
	}
	
}


class Fleece extends Armour{
	public Fleece() {
		
	this.name = "Fleece";
	this.price = 150;
	this.attack = 0;
	this.defence = 2;
	this.health = 1;
	this.speed = -1;
	
	}
	
}

class Excalibur extends Artefact{
	public Excalibur() {
		
	this.name = "Excalibur";
	this.price = 150;
	this.attack = 2;
	this.defence = 0;
	this.health = 0;
	this.speed = 0;
	
	}
	
}

class Amulet extends Artefact{
	public Amulet() {
		
	this.name = "Amulet";
	this.price = 200;
	this.attack = 1;
	this.defence = -1;
	this.health = 1;
	this.speed = 1;
	
	}
	
}

class Crystal extends Artefact{
	public Crystal() {
		
	this.name = "Crystal";
	this.price = 210;
	this.attack = 2;
	this.defence = 1;
	this.health = -1;
	this.speed = -1;
	
	}
	
}