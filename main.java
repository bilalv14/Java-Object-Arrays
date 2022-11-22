package arrayPlay;



/**
 *
 * My words and actions will reflect Academic Integrity. I will not cheat or lie
 * or steal in academic matters. I will promote integrity in the UNCG community.
 * Muhammad Zahid 2/23/22
 */
/**
 *
 * Muhammad Zahid CSC 230, Sec 03 2/23/22
 */
public class main {

    public static void main(String[] args) {

        System.out.println("Muhammad Zahid, CSC 230, Sec 03, 2/23/22"
                + "\n"
                + "\nThis program creates 2 objects of array type and works with them"
                + "\nThe arrays create student names and IDs."
                + "\n");

        String[] employeeArray = {"Susan", "Bill", "Margo", "Pamela", "Abe"}; /// create employee names array
        int[] IDArray = {123, 245, 789, 354, 256}; // create the ID array

        arrayPlay employee = new arrayPlay(); // creates the employee object 

       

        employee.displayResults(employeeArray, IDArray);

        // The total run time is n        
    }
}
