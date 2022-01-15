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
