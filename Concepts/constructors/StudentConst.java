class StudentConst  
{
    int sno;    // instance variable 
    String sname;   // instance variable 

public void talk()
{
    System.out.println("My roll number is :" + sno);
    System.out.println("My name is : "+ sname);
}
public static void main (String [] args)
{
    StudentConst s1 = new StudentConst();
    s1.talk();

}
}