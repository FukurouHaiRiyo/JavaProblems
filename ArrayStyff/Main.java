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
                System.out.println("What do you want to do? (add - 1, remove - 2, edit - 3)");
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
                        System.out.println("How many tasks do you want to remove? Note that you can only remove 1 item at a time!");
                        int remove = scanner.nextInt();
                        scanner.nextLine();

                        if (remove > backCode.getCapsuleStuff().size()) {
                            System.out.println("You can't remove more than you have!");
                            System.exit(0);
                        } else if ((remove > 0 && remove <=1) && (backCode.getCapsuleStuff().size() > 0)){
                            System.out.println("Task to remove: ");
                            int index = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < remove; i++) {
                                backCode.removeCapsuleStuff(index);
                            }
                        } else if( remove > 1 ){
                            System.out.println("You can't remove more than 1 item at a time");
                        } else {
                            System.out.println("You can't remove 0 items!");
                        }

                        // print the array
                        System.out.println(backCode.getCapsuleStuff());
                        break;
                    
                    case 3: //edit task
                        System.out.println("What item do you want to edit?");
                        int index = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter the new task: ");
                        String edit = scanner.nextLine();
                        backCode.editCapsuleStuff(index, edit);
                        // print the array
                        System.out.println(backCode.getCapsuleStuff());
                        if (backCode.getCapsuleStuff().size() == 0) {
                            System.out.println("You have no tasks!");
                        }
                }
            }
        }
    }
}
