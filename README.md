## Nested Conditional Statements
    Nested Conditional statement 
        ---> Is placing conditional statement inside another conditional statement 

        When we implement nested conditional statement

`
        if (outer condition) { // if the outer condition is true
           if (nested condition) { //inner nested is evaluated 
             Instruction to execute if both conditions are true
         }
       }

       int temp = 45;
       boolean raining = true;

       if(temp < 60) {
           System.out.println("Wear a jacket");
           if(raining == true) {
               System.out.println("Bring your umbrella");
           } else {
               System.out.println("Leave your umbrella at home.");
           }
       }

       if the outer conditional statement is not true, the nested condition will not be evaluated. 

       Switch Statement 

        ---> Alternative to chaining if then conditional statement together is to use the Switch Statement
            This conditional will check a given value against any number of conditions and run the code block where there is a match;   


    Creating an array explicitly 

    To create and array 
        We first need to declare the type of data it hold:
        For Example:
            double[] prices;

        Then we can explicitly initialize the array to contain the data we want to store:

        prices = {12, 15, 15.87, 14.22, 16.66};

        Just like with simple variables, we can declare and initialize in the same line 

        double[] prices = {12, 15, 15.87, 14.22, 16.66};

        We can also use arrays to hold Strings and other objects as well as primitives

        Example:
            String[] clothingItems = {"Tank Top", "Bennie", "Funny Socks", "Corduroys"};

## Printing arrays

        If we want to have more descriptive printout of the arrays itself, we need a toString() method that is provided by the Arrays package in Java.

        To import package from Java Arrays, we need to:

            import java.util.Arrays

            Tod print String[] topics = {"Opinion", "Tech", "Science", "Health"};
            
            System.out.println(Arrays.toString(topics));

##  ArrayList 

    In Java, when an array is created, it has a fixed size and we can add or remove elements. 

    To create mutable and dynamic list, we use JAva's ArrayLits:

    ArrayList Allow to:
        Store object reference as elements
        Store elements of the same type just like and arrays
        Access elements by index just like an arrays 
        add elements
        remove elements 

        To import ArrayList from Java package we need to:
            import java.util.ArrayList;

            // Declaring:
            ArrayList<Integer> ages;
            // Initializing:
            ages = new ArrayList<Integer>();

            Also 

                ArrayList<String> toDoList = new ArrayList<String>();

            
            ArrayList comes with and add() method which inserts and element into the structure.

            If we want to add an element at the end of the ArrayList, we will call add() method to add an index/element.

## ArrayList Size 

            To get the length of an ArrayList, we need to use the size() method to get the length.

            For Example:


            ArrayList<String> toDoList = new ArrayList<String>();

            String toDo1 = "Eat Healthy";
            String toDo2  = "Go my home show appointmenst";
            String toDo3 = "Finish the Java CodeAcademy Course by Monday";

            toDoList.add(toDo1);
            toDoList.add(toDo2);
            toDoList.add(toDo3);


            //Accessing the size of the ArrayList 
            System.out.println(toDoList.size());

## Accessing an index 

        With normal arrays[]
            We can use brackets notation to access the value of a particular index/element.
            double[] ratings = {3.2, 2.5, 1.7};
 
            System.out.println(ratings[1]);

        For ArrayList, brackets notations wont work. instead, we use the method get() to access and index/element.

## Changing the value

        When we were using array, we could rewrite entries by the using bracket notation to reassign value







            

