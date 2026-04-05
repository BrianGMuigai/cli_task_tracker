import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{

 public static void main (String[] args){
  
   //create a TaskTracker instance  to manage our task 
  TaskTracker tracker = new TaskTracker();
  
  Scanner scanner = new Scanner(System.in);

  boolean running = true;


  //-------------------  WELCOME MESSAGE     ----------------
  
     System.out.println("\n╔══════════════════════════════════════╗");
     System.out.println("║   WELCOME TO TASK TRACKER v1.0       ║");
     System.out.println("║   Stay organized, get things done!   ║");
     System.out.println("╚══════════════════════════════════════╝\n");
 


     while (running) {


        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║      TASK TRACKER MENU        ║");
        System.out.println("╠═══════════════════════════════╣");
        System.out.println("║  1. Add Task                  ║");
        System.out.println("║  2. View Tasks                ║");    
        System.out.println("║  3. Complete Task             ║");
        System.out.println("║  4. Exit                      ║");
        System.out.println("╚═══════════════════════════════╝");
        System.out.print("Enter your choice (1-4): ");
 
        try{


          int choice = Integer.parseInt(scanner.nextLine());      
      
          switch (choice) {
              

            case 1:

              System.out.println("\n--- Add New Task ---");
              System.out.print("Enter task description: ");

              String description = scanner.nextLine();

              if (description.trim().isEmpty()) {
                
                System.out.println("❌ Task description cannot be empty!");

              }
               else  {
               
                 tracker.addTask(description);
                
              }

              break;

             case 2:

              tracker.listTasks();

              break;


             case 3:

              System.out.println("\n--- Complete Task ---");
              System.out.print("Enter task ID to complete: ");

              try {

                        
             int taskId = Integer.parseInt(scanner.nextLine());   
                
                tracker.completeTask(taskId);

              }

              catch(InputMismatchException e) {

                System.out.println("❌ Please enter a valid task ID (number).");

                scanner.nextLine(); 
              
              }
          
              break;

              case 4: 
             
              System.out.println("\n✨ Thank you for using Task Tracker!");
              
              System.out.println("Stay productive! 🚀\n");
              
              running = false;
              
              break;

            default:

             System.out.println("❌ Invalid choice! Please enter 1, 2, 3, or 4.\n");
             
             break;
          }
        } catch (InputMismatchException e){

              System.out.println("❌ Please enter a number (1-4)!\n");

             scanner.nextLine();
        }  
 }


        scanner.close();
 }
}
