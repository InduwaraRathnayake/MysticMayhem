public class Inventory {
	
	private int attack, defence, health, speed;
	private int price;
	private String name;
	
    public Inventory returnInventory(){
        return this;
    }

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

    public void buyArmor(Army ar,Player user){
        if (!ar.getArmor() && user.getCoins()>this.getPrice()) {
            ar.addEquipment(this,ar);
            ar.setArmor(true);
            long coin=user.getCoins()-this.getPrice();
            user.setCoins(coin);
        }else if(!ar.getArmor()){
            System.out.println("You dont have enough coins!!!");
        }else if(user.getCoins()>this.getPrice()){
            System.out.println("Your"+ar.getName()+"already has an armor");
        }
    }

    public void sellArmor(Army ar){
        if (ar.getArmor()) {
            ar.removeEquipment(this,ar);
            ar.setArmor(false);
            
        }else if(!ar.getArmor()){
            System.out.println("You dont have an armor");
        }   
    }

    public void buyArtfact(Army ar,Player user){
        if (!ar.getArtfact() && user.getCoins()>this.getPrice()) {
            ar.addEquipment(this,ar);
            ar.setArmor(true);
            long coin=user.getCoins()-this.getPrice();
            user.setCoins(coin);
        }else if(!ar.getArtfact()){
            System.out.println("You dont have enough coins!!!");
        }else if(user.getCoins()>this.getPrice()){
            System.out.println("Your"+ar.getName()+"already has an artfact");
        }
        
    }
    public void sellArtfact(Army ar){
        if (ar.getArtfact()) {
            ar.removeEquipment(this,ar);
            ar.setArmor(false);
            
        }else if(!ar.getArtfact()){
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