// This class create method and objects neeeded when creating new task sending the task to a file and confirming if the task are completed or not 

public  class Task {
  

  //creating private objects 
  private int id;
  private String description;
  private boolean isCompleted;

  // creating a method that accepts new task
  // the boolean is set to false since new task are not done
  public Task (int id, String description){

    this.id = id;
    this.description= description;
    this.Completed= false;

  }
 
  // creating a method that accepts task from a file 
  // This method is a constructor overloading method since it accepts more params than the first one
  
  Public Task( int id String description boolean isCompleted ){


    this.id = id;
    this.description= description;
    this.isCompleted= isCompleted;

  }


  /*
   *
   *This getter methods are used to access the objects outside the task class 
   *
   * */
  public int getId(){

      return id;

  }

  public String getDescription(){

    return description;
  
  } 

  public boolean getisCompleted(){

    return isCompleted;

  }

/*
 *
 *This method is used to pass a task as markCompleted
 *
 * */

  public void markCompleted(){
   
    this.isCompleted = true;

  }

  // create a method that shows the state of the task
  @override

 public String toString(){
  
   String status = isCompleted ? "✓" : "○";

   return "[ " + status + " ]" +  id + "." + description;


 }

 // create an method that saves a task to the file as desired format
 public  String toFileFormat(){

   return id + "|" + description + "|" + isCompleted; 

 }
}
