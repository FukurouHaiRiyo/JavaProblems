package ArrayStyff;

// Create a helper class to help with a task like app 
// you can add, remove and edit the array

// imports
import java.util.ArrayList;

public class BackCode {
    private int capsuledTasks;
    private ArrayList<String> capsuleStuff;

    public BackCode() {
        this.capsuleStuff = new ArrayList<String>();
    }

    // initialize the array
    public void setCapsuledStuff(ArrayList<String> capsuleStuff) {
        this.capsuleStuff = capsuleStuff;
    }

    //GETTERS AND SETTERS
    public int getCapsuledTasks() {
        return capsuledTasks;
    }

    public void setCapsuledTasks(int capsuledTasks) {
        this.capsuledTasks = capsuledTasks;
    }

    // getter to print the array
    public ArrayList<String> getCapsuleStuff() {
        return capsuleStuff;
    }

    // setter to add to the array
    public void setCapsuleStuff(String capsuleStuff) {
        this.capsuleStuff.add(capsuleStuff);
    }

    // setter to remove from the array
    public void removeCapsuleStuff(int index) {
        this.capsuleStuff.remove(index);
    }

    // setter to edit the array
    public void editCapsuleStuff(int index, String capsuleStuff) {
        this.capsuleStuff.set(index, capsuleStuff);
    }

    // setter to add to the array
    public void addCapsuleStuff(String capsuleStuff) {
        this.capsuleStuff.add(capsuleStuff);
    }
}
