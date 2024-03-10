

public class Inventorynnnnn {
	
	private int attack, defence, health, speed;
	private int price;
	private String name;
	
    public int getPrice(){
        return this.price;
    }

    public int getAttack(){
        return this.attack;
    
    }

    public int getDefence(){
        return this.defence;
        
    }
    public int getHealth(){
        return this.health;
    }

    public int getSpeed(){
        return this.speed;
       
    }
    public String getName(){
        return this.name;
    }


    public void setPrice(int price){
        this.price=price;
    }


    public void setAttack(int attack){
        this.attack=attack;
    }

    public void setDefence(int defence){
        this.defence=defence;
    }
    public void setHealth(int health){
        this.health=health;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setName(String name){
        this.name=name;
    }

    public void buy_armor(Army ar,Inventorynnnnn in,Player user){
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

    public void sell_armor(Army ar,Inventorynnnnn in){
        if (ar.armor) {
            ar.removeEquipment(in,ar);
            ar.armor=false;
            
        }else if(!ar.armor){
            System.out.println("You dont have an armor");
        }
        
    }

    public void buy_artfact(Army ar,Inventorynnnnn in,Player user){
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
    public void sell_artfact(Army ar,Inventorynnnnn in){
        if (ar.artfact) {
            ar.removeEquipment(in,ar);
            ar.artfact=false;
            
        }else if(!ar.artfact){
            System.out.println("You dont have an artfact");
        }
        
    }



}

class Armour extends Inventorynnnnn{
	
}


class Artefact extends Inventorynnnnn{
	
}

class Chainmail extends Armour{
	public Chainmail() {
    setName("Chainmail");	
	setPrice(70);
	setAttack(0);
	setDefence(1);
	setHealth(0);
	setSpeed(-1);
	
	}
	
}

class Regalia extends Armour{
	public Regalia() {
    setName("Regalia");	
	setPrice(105);
	setAttack(0);
	setHealth(0);
	setSpeed(0);
	
	}
	
}


class Fleece extends Armour{
	public Fleece() {
    setName("Fleece");		
	setPrice(150);
	setAttack(0);
	setDefence(2);
	setHealth(1);
	setSpeed(-1);
	
	}
	
}

class Excalibur extends Artefact{
	public Excalibur() {
    setName("Excalibur");		
	setPrice(150);
	setAttack(2);
	setDefence(0);
	setHealth(0);
	setSpeed(0);
	
	}
	
}

class Amulet extends Artefact{
	public Amulet() {
    setName("Amulet");			
	setPrice(200);
	setAttack(1);
	setDefence(-1);
	setHealth(1);
	setSpeed(1);
	
	}
	
}

class Crystal extends Artefact{
	public Crystal() {
    setName("Crystal");			
	setPrice(210);
	setAttack(2);
	setDefence(1);
	setHealth(-1);
	setSpeed(-1);
	
	}
	
}