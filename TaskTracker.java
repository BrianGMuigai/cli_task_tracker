import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class  TaskTracker{

  // This are objects to be used by the class i encapusalated them 

  private ArrayList <Task> tasks;
  private int nextId;
  private String filename;

  public TaskTracker (){

    // this initializes an new empty task ArrayList
    this.tasks = new ArrayList <> ();
 
    // starts the ArrayList from 1 rather than 0 
    this.nextId = 1;
 
    this.filename = "file.txt";

    loadTasks();

  }

  // for adding new task into the ArrayList
   public void addTask (String description){

     Task newTask = new Task(nextId, description);

     tasks.add(newTask);
    
     nextId++;

     saveTasks();

     System.out.println("✅ Task added: " + description);
     }

  public void listTasks (){

    if (tasks.isEmpty ()){

      System.out.println("\n📋 No tasks yet! Add one to get started.\n");

      return;

    }


    System.out.println("\n📋 Your Tasks:");

    System.out.println("==================================================");


    for (Task task : tasks){

    System.out.println(task);
}

    System.out.println("==================================================\n");

}

public  void completeTask(int taskId) {

    for ( Task task : tasks){

      if( task.getId() == taskId){

        task.markCompleted();

        saveTasks();
 
       System.out.println("✅ Task " + taskId + " marked as complete!");
 
      return;

      }
    }
 
      System.out.println("❌ Task " + taskId + " not found.");
  }


   private  void saveTasks(){


     PrintWriter writer = null;

     try{

       writer = new PrintWriter(filename);

       for(Task task : tasks){

         writer.println(task.toFileFormat());
       }

     }
       catch( FileNotFoundException e ){


        System.out.println("⚠️  Error saving tasks: " + e.getMessage());

       }
 
       finally{

         if(writer != null ){

          writer.close();

         }
       }
     }

   private void loadTasks(){

     File file  = new File( filename );

     if( !file.exists()){

     return;

     }

     Scanner scan = null;

     try {

      scan = new Scanner(file);

     while ( scan.hasNextLine()) {

       String line = scan.nextLine();

       if ( line.trim().isEmpty()){

         continue ;

       }

      String[] parts = line.split("\\|");

      if (parts.length != 3) {

        continue;

      }

      int id = Integer.parseInt(parts[0]);

       String description = parts[1];

       boolean isComplete = Boolean.parseBoolean(parts[2]);

      Task task = new Task( id, description, isComplete);

      tasks.add(task);

      if (id >= nextId) {

        nextId = id + 1 ;

      
      }

     }

     }

   catch ( FileNotFoundException e ){

      System.out.println("⚠️  Error loading tasks: " + e.getMessage());
 
   }

   finally{

     if (scan != null){

       scan.close();

     }
   }

   }
  }

