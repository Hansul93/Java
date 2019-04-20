package dataTypes;

public class DataTypes {
	

	public static void main(String[] args) {

	 boolean b = true;       
     if (b == true)
     {
         System.out.println("Hi Samil your value is true");
	}
     
     char g = 'z';
	 int i= -8998798;
	 short s = 56;
	 double d = 4.355453532879;
	 float f = -4.7333434f;
	 byte t = 48;
	 long l = 43434535;
	 
	 System.out.println("char: " + g); 
     System.out.println("integer: " + i); 
     System.out.println("byte: " + t); 
     System.out.println("short: " + s); 
     System.out.println("float: " + f); 
     System.out.println("double: " + d); 
     System.out.println("long: " + l);

	
	String value = "Shamil is an automation test engineer";
	if(value.contains("Shamil"))
	{
		System.out.println(value);
	}
	else 
	{
		System.out.println("Shamil is not present");
	}
	
	int[] arr;
    
    // allocating memory for 5 integers.
    arr = new int[5];
       
    // initialize the first elements of the array
    arr[0] = 9;       
    // initialize the second elements of the array
    arr[1] = 20;
       
    //so on...
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
       
    // accessing the elements of the specified array
    System.out.println("Array Length"+arr.length);
    for (int i1 = 0; i1 < arr.length; i1++)
    	
       System.out.println("Element at index " + i1 + 
                                    " : "+ arr[i1]);  
    
    
    
    
	
    @SuppressWarnings("unused")
	int[][] intArray = new int[10][20]; //a 2D array or matrix
    @SuppressWarnings("unused")
	int[][][] intArray1 = new int[10][20][10]; //a 3D array
	
    // declaring and initializing 2D array
    int arr1[][] = { {2,7,9,4},{3,6,1,4},{7,4,2,4} };

    // printing 2D array
    for (int i2=0; i2< 4 ; i2++)
    {
        for (int j=0; j <4 ; j++)
        
        System.out.print(arr1[i2][j] + " ");
        System.out.println();
        
    }
	
	}
}