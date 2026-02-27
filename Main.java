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
      
  boolean isRunning = true;

   while ( isRunning != false) {
  
  
   
   System.out.print("Choose an option from 1 - 3 : ");
   int choice = scan.nextInt();
   System.out.println("*************************");

   System.out.println(" 1. Add Task");
   System.out.println(" 2. View Task");
   System.out.println(" 3. Complete Task");
   System.out.println(" 4. Quit program");
   System.out.println("*******************");
  
   
   if( choice == 1 ){
    
   String task = addTask(scan);
   }

   else if( choice == 4 ){
   
    isRunning = false;
    System.out.println("Thank you and welcome again");
   
   }
   }
  
  }
 //creating a function to add task, complete task, view task

    public static   String addTask(Scanner scan) {
     
      String task = " ";
        
      boolean isValid = true;
      
    while (isValid != false){
      
      task = scan.nextLine();
        
      System.out.print("Enter your task : "); 
      if (task.isBlank() & task.length() < 3 || task.length() > 100){    
      
    
      System.out.print("Enter your task : "); 
      
      }  
        else{
      isValid = true;
      System.out.println("You added Task:" + task);
      }
      }
     return task;
    }

}
