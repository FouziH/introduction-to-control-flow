//import the ArrayList package here:
import java.util.ArrayList;

 class ToDos {

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();

        //Adding toDo1 to the ArrayList
        String toDo1 = "Eat Healthy";
        String toDo2  = "Go my home show appointmenst";
        String toDo3 = "Finish the Java CodeAcademy Course by Monday";

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);
        

        //To add element/index to an ArrayList 
        toDoList.add("Hamza");

        //To get and element/index of an ArrayList 
        System.out.println(toDoList.get(1));

        System.out.println(toDoList);
        System.out.println(toDoList.get(2));
    }

    
}
