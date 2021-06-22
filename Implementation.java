package LinkedList;

public class Implementation {
 Student head;
 Student  tail;
 int size;
    public  void addLast(int roll,String name)
    {
        if(size==0)
        {
            Student temp=new Student(roll,name,null);
            head=tail=temp;
            size++;
        }
        else
        {
            Student temp=new Student(roll,name,null);
            tail.setNext(temp);
            tail=temp;
         size++;
        }

    }
    public void display()
    {
        Student temp=head;
        while(temp!=null)
        {
            System.out.println("rollno->"+temp.getRollno()+" name->"+temp.getName());
        temp=temp.getNext();
        }
    }
    public int getSize()
    {
        return size;
    }
    public void deleteAtLast()
    {
        Student temp=head;
        while(temp.getNext().getNext()!=null)
        {
            temp=temp.getNext();
        }
        System.out.println("rollno->"+tail.getRollno()+" name->"+tail.getName());
        temp.setNext(null);
        tail=temp;

        size--;
    }
    public void deleteArFirst()
    {
        head=head.getNext();
        size--;
    }

}
