package polymorphism;

class MainClass
{
    // This method can be used to print salary of
    // any type of employee using base class refernce
    static void printSalary(MethodOverriding_Parent e)
    {
        System.out.println(e.salary());
    }
 
    public static void main(String[] args)
    {
    	MethodOverriding_Parent obj1 = new MethodOverriding_Child();
 
        System.out.print("Manager's salary : ");
        printSalary(obj1);
    }
}
