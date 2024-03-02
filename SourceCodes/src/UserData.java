// import java.util.HashSet;
// import java.util.Scanner;
// import java.util.Properties;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;

// public class UserData {
//     private String name;
//     private String userName;
//     private static HashSet<String> listOfUserNames = new HashSet<>();
//     private static Properties properties = new Properties();
//     private static final String USER_NAME_FILE = "Usernames.properties";

//     public UserData(){
//         loadUserNames();
//         getUserData();
//     }

//     private void loadUserNames() {
//         try {
//             FileInputStream read = new FileInputStream(USER_NAME_FILE);
//             properties.load(read);
//             read.close();
//             for (String key : properties.stringPropertyNames()) {
//                 listOfUserNames.add(properties.getProperty(key));
//             }
//         } catch (IOException e) {
//             System.out.println("Error loading usernames: " + e.getMessage());
//         }
//     }

//     private void saveUserName(String name, String userName) {
//         try {
//             properties.setProperty(name, userName);
//             FileOutputStream write = new FileOutputStream(USER_NAME_FILE);
//             properties.store(write, null);
//             write.close();
//         } catch (IOException e) {
//             System.out.println("Error saving username: " + e.getMessage());
//         }
//     }

//     private void getUserData(){
//         Scanner input = new Scanner(System.in);
        
//         System.out.println("Enter your name :"); 
//         name = input.nextLine();
    
//         String newUserName;
//         boolean userNameExists;
//         do{
//             System.out.println("Enter your UserName:"); 
//             newUserName = input.nextLine();
//             userNameExists = listOfUserNames.contains(newUserName);
//             if(userNameExists){
//                 System.out.println("Username already exists. Please enter a different username.");
//             }
//         }while(userNameExists);
    
//         userName = newUserName;
//         listOfUserNames.add(newUserName);
//         saveUserName(name,newUserName);
//         input.close();
//     }
    
//     public String getName(){
//         return this.name;
//     }

//     public String getUserName(){
//         return this.userName;
//     }


// }

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserData {
    private String name;
    private String userName;
    private int id;
    private static HashSet<Integer> listOfInteger = new HashSet<>();
    private static HashSet<String> listOfUserNames = new HashSet<>();
    private static final String USER_NAME_FILE = "Usernames.txt";

    public UserData(){
        loadUserNames();
        getUserData();
    }

    private void loadUserNames() {
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

    private void getUserData(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name : "); 
        name = input.nextLine();
    
        String newUserName;
        boolean userNameExists;
        do{
            System.out.print("Enter your UserName: "); 
            newUserName = input.nextLine();
            userNameExists = listOfUserNames.contains(newUserName);
            if(userNameExists){
                System.out.println("Username already exists. Please enter a different username.");
            } else {
                userName = newUserName;
                id = getID();
                listOfUserNames.add(newUserName);
                saveUserName(name,newUserName,id);
            }
        }while(userNameExists);
    
        input.close();
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





