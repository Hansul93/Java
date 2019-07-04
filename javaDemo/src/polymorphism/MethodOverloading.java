package polymorphism;

public class MethodOverloading {

	public static void main(String args[]) { 
		
	//ClassName object = new ClassName
		
	 MethodOverloading s = new MethodOverloading();
	 
     System.out.println(s.sum(10, 20));
     System.out.println(s.sum("hansul", "fathima", "automation"));
     System.out.println(s.sum(10.5, 20.5));
     s.normaleMethod(3, 3, 45);
     
     
	}
	 public int sum(int x, int y, int z) {
	        return (x + y);
	    }
	 
	    // Overloaded sum(). This sum takes three int parameters
	    public String sum(String x, String y, String z) { 
	         return (x + y + z);
	    }
	    
	    public String sum(String x, String y) { 
	         return (x + y);
	    }
	 
	    // Overloaded sum(). This sum takes two double parameters
	    public double sum(double x, double y) { 
	         return (x + y);
	    }  
	    
	    public void normaleMethod(int x, int y, int z) {
	    	int result = sum(x,y,z) + 2;
	    	System.out.println(result);
	    }
}
