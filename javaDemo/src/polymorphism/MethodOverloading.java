package polymorphism;

public class MethodOverloading {

	public static void main(String args[]) { 
		
	 MethodOverloading s = new MethodOverloading();
	 
     System.out.println(s.sum(10, 20));
     System.out.println(s.sum("hansul", "fathima", "automation"));
     System.out.println(s.sum(10.5, 20.5));
     
     
	}
	 public int sum(int x, int y) {
	        return (x + y);
	    }
	 
	    // Overloaded sum(). This sum takes three int parameters
	    public String sum(String x, String y, String z) { 
	         return (x + y + z);
	    }
	 
	    // Overloaded sum(). This sum takes two double parameters
	    public double sum(double x, double y) { 
	         return (x + y);
	    }   
}
