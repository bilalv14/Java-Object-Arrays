package arrayPlay;

public class main {

    public static void main(String[] args) {

      

        String[] employeeArray = {"Susan", "Bill", "Margo", "Pamela", "Abe"}; /// create employee names array
        int[] IDArray = {123, 245, 789, 354, 256}; // create the ID array

        arrayPlay employee = new arrayPlay(); // creates the employee object 

       

        employee.displayResults(employeeArray, IDArray);

               
    }
}
