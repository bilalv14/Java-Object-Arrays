package arrayPlay;

import java.util.Arrays;

public class arrayPlay {

    private String[] employName;
    private int[] ID;

    arrayPlay() {

    }

    arrayPlay(String[] employName, int[] ID) {
        this.employName = employName;
        this.ID = ID;
    }

    public void sortArray(String[] employName) {
        Arrays.sort(employName);
    }

    public void sortArray(int[] ID) {
        Arrays.sort(ID);
    }

    public void linearSearch(int[] ID, int id) {
            if (ID.length == 0){
                System.out.println("ID not found");
                
            }
            else if (ID[0] == id){
                System.out.println("The employee with ID of " + id + " is on the list.");
            }
            else {
                linearSearch(Arrays.copyOfRange(ID,1, ID.length), id);
            }
    }

    public boolean binarySearch(String[] employName, String name) {

        

        int left = 0;
        int right = employName.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;

            if (employName[mid].compareTo(name) < 0) {
                left = mid + 1;
            } 
            else if (employName[mid].compareTo(name) > 0) {
                right = mid - 1;
            } 
            else {
                return true;
            }
        }

        return false;
    }
    
    public void displayResults(String [] employName, int [] ID ){
       
        sortArray(employName); // sorts the employee array in order 
        sortArray(ID); // sorst the ID array in order 
        
        
        for (int i = 0; i < ID.length; i++){
            System.out.println("Employee " +  ( i + 1) +  " name is " + employName[i] + " and the employee ID is " + ID[i]);
        }
        
        System.out.println();
        
        linearSearch(ID, 354); //calls linear search 
        
        String name = "Bill";
        
        
        if (binarySearch(employName,name)){
            System.out.println("The Employee with the name of " + name + " is on the list");
        }
        else {
            System.out.println("The Employee with the name of " + name + " is not on the list" );
        }
       
         
            }
}
