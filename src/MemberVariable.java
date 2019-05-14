/* 3. Create a class named Member with Name, age, Salary as its variable, write an other
class named Member Variable that creates an instance of the Member class, initialises its
member variables, and then displays the value of each member variable.
Output: Members Name: Harry
Potter Members Age: 30
Members Salary: 2500.3 */

class Member
{
    String name;
    int age;
    double salary;
    public void display()
    {
        System.out.println("Member's name:"+name);
        System.out.println("Members age:"+age);
        System.out.println("Member's salary:"+salary);
    }
}

public class MemberVariable
{
    public static void main(String args[])
    {
        Member obj=new Member();
        obj.name="Harry Potter";
        obj.age=30;
        obj.salary=2500.3;
        obj.display();
    }
}

