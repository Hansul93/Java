package loopCondition;

import org.testng.annotations.Test;

public class Loop_Condition {
	
	
@Test
	public void looping(){
		// Java program to illustrate while loop
System.out.println("####################### WHILE LOOP #############################");
		        int x = 1;
		 
		        // Exit when x becomes greater than 4
		        while (x <= 4)
		        {
		            System.out.println("Value of x:" + x);
		 
		            // Increment the value of x for
		            // next iteration
		            x++;
		        }
		        System.out.println("####################### DO - WHILE LOOP #############################");
		        int y = 28;
		        do
		        {
		            // The line will be printed even
		            // if the condition is false
		            System.out.println("Value of y:" + y);
		            y++;
		        }
		        while (y < 40);
		        {
		        	System.out.println(y);
		        	y++;
		        }
	
		        System.out.println("####################### FOR LOOP #############################");
		        // for loop begins when x=2
		        // and runs till x <=4
		        for (int z = 2; z <= 4; z++)
		            System.out.println("Value of z:" + z);
		      
		        
		        System.out.println("####################### FOR EACH LOOP #############################");
		        String array[] = {"Ron", "Harry", "Hermoine","Shamil", "Hansul", "BITA"};
		        
		        //enhanced for loop
		        for (String a:array)
		        {
		            System.out.println(a);
		        }
		 
		        /* for loop for same function
		        for (int i = 0; i < array.length; i++)
		        {
		            System.out.println(array[i]);
		        }
		        */
	
	}
}
