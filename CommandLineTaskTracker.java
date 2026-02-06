import java.util.Scanner;


// creating a main class where a we can run the main code 

public class CommandLineTaskTracker {

   //Scanner scan = new Scanner (System.in);

  public static void main(String[] args) {
 
     // instantiating a scan object 

    Scanner scan = new Scanner (System.in);
   /*
    //testing if the scanner is working and finally commenting this block 
   System.out.print("Enter your name: ");
     String name = scan.nextLine();
*/

   System.out.println("**********************");
   System.out.println("CommandLine Task Tracker");
   System.out.println("**********************");

   // creating a method that shows option 1 - 3
      

   
   System.out.println(" 1. Add Task");
   System.out.println(" 2. View Task");
   System.out.println(" 3. Complete Task");
   System.out.println("*******************");

   System.out.println("Choose an option from 1 - 3 :");
   int choice = scan.nextInt();
   System.out.println("*************************");
   
   while (choice == 0) {
     
   
   if( choice == 1 ){
    

   String task = addTask(scan);
   System.out.println("************************");
   System.out.println("Task:" + task);
   }
   }
  
  }
 //creating a function to add task, complete task, view task

    public static   String addTask(Scanner scan) {
     

      System.out.print("Enter your task : "); 
      
      String task = scan.nextLine(); 
      

      return task;


    }

}
