package LinkedList;

public class Student {
    private int rollno;
    private String  name;
 private   Student next;

    public Student(int rollno, String name, Student next) {
        this.rollno = rollno;
        this.name = name;
        this.next = null;
    }

    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
