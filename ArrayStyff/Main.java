package ArrayStyff;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // declare capsuleStuff
        ArrayList<String> capsuleStuff = new ArrayList<String>();

        // initialize scanner
        Scanner scanner = new Scanner(System.in);

        // initialize BackCode
        BackCode backCode = new BackCode();

        // initialize the array
        backCode.setCapsuledStuff(capsuleStuff);

        // add to the array, let the user choose how many items
        System.out.println("How many tasks do you want to add?");
        int items = scanner.nextInt();
        scanner.nextLine();
        backCode.setCapsuledTasks(items);


        // see how many tasks are there
        System.out.println("You have " + backCode.getCapsuledTasks() + " tasks.");

        for (int i = 0; i < items; i++) {
            System.out.println("Task " + (i + 1) + ":");
            String add = scanner.nextLine();
            backCode.setCapsuleStuff(add);
        }

        // print the array
        System.out.println(backCode.getCapsuleStuff());

        // make the user choose what to do: add, remove or edit
        System.out.println("What do you want to do? (add - 1, remove - 2, edit - 3)");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice){
            case 1: 
                System.out.println("How many tasks do you want to add?");
                scanner.nextInt();
                scanner.nextLine();
                
                // what tasks to add
                System.out.println("What tasks do you want to add?");
                String addTask = "";
                addTask = scanner.nextLine();
                backCode.addCapsuleStuff(addTask);
                // print the array
                System.out.println(backCode.getCapsuleStuff());
                break;

            case 2: 
                // remove from the array, let the user choose what items to remove
                System.out.println("How many tasks do you want to remove?");
                int remove = scanner.nextInt();
                scanner.nextLine();

                if (remove > backCode.getCapsuleStuff().size()) {
                    System.out.println("You can't remove more than you have!");
                    System.exit(0);
                } else if (remove > 0) {
                    System.out.println("Task to add: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < remove; i++) {
                        backCode.removeCapsuleStuff(index);
                    }
                } else {
                    System.out.println("You can't remove 0 items!");
                }

                // print the array
                System.out.println(backCode.getCapsuleStuff());
                break;
            
            case 3:
                // edit the array, let the user choose what items to edit
                System.out.println("How many tasks do you want to edit?");
                int edit = scanner.nextInt();
                scanner.nextLine();
                
                if (edit > backCode.getCapsuleStuff().size()) {
                    System.out.println("You can't edit more than you have!");
                    System.exit(0);
                } else if (edit > 0) {
                    System.out.println("What item do you want to edit?");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < edit; i++) {
                        System.out.println("Task : ");
                        String editItem = scanner.nextLine();
                        backCode.editCapsuleStuff(index, editItem);
                    }
                } else {
                    System.out.println("You can't edit 0 items!");
                    
                }

                // print the array
                System.out.println(backCode.getCapsuleStuff());
        }

        scanner.close();
    }
}
