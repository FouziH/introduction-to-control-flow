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


        

            

