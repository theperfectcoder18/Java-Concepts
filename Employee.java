class Employee
{
    int eno;    // instance variable 
    String ename;   // instance variable 

public void accept()
{
    eno = 111;
     ename = "Ravi";
}
public void show()
{
    System.out.println("Employee name is :" + ename);
    System.out.println("Employee number is :" + eno );
}
public static void main (String [] args)
{
    Employee e1 = new Employee();
    e1.accept();
     e1.show();
}
}