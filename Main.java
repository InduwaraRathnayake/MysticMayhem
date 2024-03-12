package project3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
	
	// Create a list to store the characters
    static List<Army> characters = new ArrayList<>();
	
	
	public static Army getArmy(int key, int value) {
		
		switch (key) {
        case 1: // Archer
            switch (value) {
                case 1:
                    
                    return new Shooter();
                    
                case 2:
                	return new Ranger();
                    
                case 3:
                    return new Sunfire();
                    
                case 4:
                    return new Zing();
                    
                case 5:
                	return new Saggitarius();
                    
            }
            break;
        case 2: // Knight
            switch (value) {
                case 1:
                	return new Squire();
                    
                case 2:
                	return new Cavalier();
                    
                case 3:
                	return new Templar();
                    
                case 4:
                	return new Zoro();
                    
                case 5:
                	return new Swiftblade();
                    
            }
            break;
        case 3: // Mage
            switch (value) {
                case 1:
                	return new Warlock();
                    
                case 2:
                	return new Illusionist();
                    
                case 3:
                	return new Enchanter();
                    
                case 4:
                	return new Conjurer();
                    
                case 5:
                	return new Eldritch();
                    
            }
            break;
        case 4: // Healer
        	switch (value) {
            case 1:
            	return new Soother();
                
            case 2:
            	return new Medic();
                
            case 3:
            	return new Alchemist();
                
            case 4:
            	return new Saint();
                
            case 5:
            	return new Lightbringer();
                
        }
        	break;
        case 5: // MythicalCreature
        	switch (value) {
            case 1:
            	return new Dragon();
                
            case 2:
            	return new Basilisk();
                
            case 3:
            	return new Hydra();
                
            case 4:
            	return new Phoenix();
                
            case 5:
            	return new Pegasus();
                
        	}
    }
		return null;
		
		
		
	}
	
	
	
	
	
	public static List<Army> your_army() {
		
		Scanner inp = new Scanner(System.in);
		
		
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int k=0; k<5;k++) {
			int key,value;
			key = inp.nextInt();
			
			value = inp.nextInt();
	        map.put(key, value); 
		}

        
        
        // Loop through the HashMap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            characters.add(getArmy(key,value));
            
        }
        
        
        for (Army character : characters) {
            System.out.println(character.getter());
        }

		
		return characters;
	}
	
	
	
	public static void updateArmy(List<Army> characters ,int sellno , int buyno){
		characters.set(sellno-1,getArmy(sellno,buyno));
		
//		for (Army character : characters) {
//            System.out.println(character.getter());
//        }
	}
	
	
	
	
	public static void main(String[] args) {
		
		//Player p1 = new Player();
		
		List<Army> army = your_army();
		
		//updateArmy(characters,1,5);
        
        
		
		
		
		
	}
	

}
