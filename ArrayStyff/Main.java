package ArrayStyff;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // declare capsuleStuff
        ArrayList<String> capsuleStuff = new ArrayList<String>();

        try (// initialize scanner
        Scanner scanner = new Scanner(System.in)) {
            // initialize BackCode
            BackCode backCode = new BackCode();

            // initialize the array
            backCode.setCapsuledStuff(capsuleStuff);

            while (true){
                // make the user choose what to do: add, remove or edit
                System.out.println("What do you want to do? (1 - add, 2 - remove, 3 - edit, 4 - exit)");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice){
                    case 1: // add task
                        System.out.println("How many tasks do you want to add?");
                        int nr = scanner.nextInt();
                        scanner.nextLine();
                        
                        for (int i = 0; i < nr; i++) {
                        // what tasks to add
                            System.out.println("What tasks do you want to add?");
                            String addTask = "";
                            addTask = scanner.nextLine();
                            backCode.setCapsuleStuff(addTask);
                        }
                        
                        // print the array
                        System.out.println(backCode.getCapsuleStuff());
                        break;

                    case 2: // remove task
                        // remove from the array, let the user choose what items to remove
                        // the user will be able to remove multiple items
                        System.out.println("How many tasks do you want to remove?");
                        int nr2 = scanner.nextInt();
                        scanner.nextLine();

                        for (int i = 0; i < nr2; i++) {
                            System.out.println(backCode.getCapsuleStuff());
                            System.out.println("What item do you want to remove?");
                            int remove = scanner.nextInt();
                            scanner.nextLine();
                            backCode.removeCapsuleStuff(remove);
                        }
                        // print the array
                        System.out.println(backCode.getCapsuleStuff());
                        break;
                    
                    case 3: //edit task
                        // edit a specific item from the array
                        if (backCode.getCapsuleStuff().isEmpty()) {
                            System.out.println("The array is empty!");
                            break;
                        }
                        
                        System.out.println("What item do you want to edit?");
                        int edit = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("What do you want to edit?");
                        String editTask = scanner.nextLine();
                        backCode.editCapsuleStuff(edit, editTask);
                        
                        // print the array
                        System.out.println(backCode.getCapsuleStuff());
                        
                    
                    case 4: // exit 
                        System.out.println("Bye!");
                        System.exit(0);
                        break;
                }
            }
        }
    }
}
