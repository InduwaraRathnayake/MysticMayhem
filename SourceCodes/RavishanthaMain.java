import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static List<Army> your_army() {
		
		Scanner inp = new Scanner(System.in);

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int k=0; k<5;k++) {
			int key,value;
			key = inp.nextInt();
			
			value = inp.nextInt();
	        map.put(key, value); 

		}

        // Create a list to store the characters
        List<Army> characters = new ArrayList<>();

        // Loop through the HashMap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            // Create the corresponding character and add it to the list
            switch (key) {
                case 1: // Archer
                    switch (value) {
                        case 1:
                            characters.add(new Shooter());
                            break;
                        case 2:
                            characters.add(new Ranger());
                            break;
                        case 3:
                            characters.add(new Sunfire());
                            break;
                        case 4:
                            characters.add(new Zing());
                            break;
                        case 5:
                            characters.add(new Saggitarius());
                            break;
                    }
                    break;
                case 2: // Knight
                    switch (value) {
                        case 1:
                            characters.add(new Squire());
                            break;
                        case 2:
                            characters.add(new Cavalier());
                            break;
                        case 3:
                            characters.add(new Templar());
                            break;
                        case 4:
                            characters.add(new Zoro());
                            break;
                        case 5:
                            characters.add(new Swiftblade());
                            break;
                    }
                    break;
                case 3: // Mage
                    switch (value) {
                        case 1:
                            characters.add(new Warlock());
                            break;
                        case 2:
                            characters.add(new Illusionist());
                            break;
                        case 3:
                            characters.add(new Enchanter());
                            break;
                        case 4:
                            characters.add(new Conjurer());
                            break;
                        case 5:
                            characters.add(new Eldritch());
                            break;
                    }
                    break;
                case 4: // Healer
                	switch (value) {
                    case 1:
                        characters.add(new Soother());
                        break;
                    case 2:
                        characters.add(new Medic());
                        break;
                    case 3:
                        characters.add(new Alchemist());
                        break;
                    case 4:
                        characters.add(new Saint());
                        break;
                    case 5:
                        characters.add(new Lightbringer());
                        break;
                }
                	break;
                case 5: // MythicalCreature
                	switch (value) {
                    case 1:
                        characters.add(new Dragon());
                        break;
                    case 2:
                        characters.add(new Basilisk());
                        break;
                    case 3:
                        characters.add(new Hydra());
                        break;
                    case 4:
                        characters.add(new Phoenix());
                        break;
                    case 5:
                        characters.add(new Pegasus());
                        break;
                	}
            }
        }
        
        
        for (Army character : characters) {
            System.out.println(character.getter());
        }

		
		return characters;
	}
	
	
	
	
	public static void main(String[] args) {
		
		//Player p1 = new Player();
		
		List<Army> army = your_army();
        
        
		
		
		
		
	}
	

}