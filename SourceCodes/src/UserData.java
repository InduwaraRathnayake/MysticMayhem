import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UserData {
    private String name;
    private String userName;
    private int id;
    private static HashSet<Integer> listOfInteger = new HashSet<>();
    private static HashSet<String> listOfUserNames = new HashSet<>();
    private static final String USER_NAME_FILE = "Userdata.txt";

    public UserData(){
        loadUserNames();
        gatherUserData();
    }

    public UserData(String name, String userName, int id){{
        this.name = name;
        this.userName = userName;
        this.id = id;
    }

    }
    public void loadUserNames() {
        File file = new File(USER_NAME_FILE);
        if(file.exists()){
            try {
                BufferedReader read = new BufferedReader(new FileReader(USER_NAME_FILE));
                String readLine;
                while ((readLine = read.readLine()) != null) {
                    String[] line = readLine.split("-");
                    
                    userName = line[1];
                    listOfUserNames.add(userName);

                    id = Integer.parseInt(line[2]);
                    listOfInteger.add(id);
                }
                read.close();
            } catch (IOException e) {
                System.out.println("Error loading usernames: " + e.getMessage());
            }
        }
    }

    private void saveUserName(String name, String userName, int id) {
        try {
            BufferedWriter data = new BufferedWriter(new FileWriter(USER_NAME_FILE, true));
            data.write(name + "-" + userName + "-" + id +'\n');
            data.close();
        } catch (IOException e) {
            System.out.println("Error saving username: " + e.getMessage());
        }
    }
    public void gatherUserData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = input.nextLine();
        String newUserName;
        boolean userNameExists;
        do {
            System.out.print("Enter your UserName: ");
            newUserName = input.nextLine();
            userNameExists = listOfUserNames.contains(newUserName);
            if (userNameExists) {
                System.out.println("Username already exists. Please enter a different username.");
            } else {
                userName = newUserName;
                id = getID();
                listOfUserNames.add(newUserName);
                saveUserName(name, newUserName, id);
            }
        } while (userNameExists);
    }
    
    private int getID(){
        Random randNum = new Random();

        int newId;
        boolean idExist;
        do{
            newId = randNum.nextInt(100000000);
            idExist = listOfInteger.contains(newId);
        }while(idExist);

        listOfInteger.add(newId);
        
        return newId;
    }

    public void changeName(){
        Scanner prompt = new Scanner (System.in);

        System.out.print("Enter the new name : ");
        String newName = prompt.nextLine();
        name = newName;

        try{
            Path pathOffile = Paths.get(USER_NAME_FILE);
            List<String> data = Files.readAllLines(pathOffile);
            if (!data.isEmpty()) {
            data.remove(data.size() - 1);
            Files.write(pathOffile, data);
        }
        }catch (IOException e) {
            System.out.println("Error removing last line: " + e.getMessage());
        }
        saveUserName(this.name, this.userName, this.id);
        System.out.println("Your new player name is: " + name);
    }

    public String getName(){
        return this.name;
    }

    public String getUserName(){
        return this.userName;
    }

    public int getUserID(){
        return id;
    }


}


