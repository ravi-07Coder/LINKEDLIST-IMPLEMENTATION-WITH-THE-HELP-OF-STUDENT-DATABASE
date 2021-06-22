package LinkedList;

import com.sun.istack.internal.Pool;

public class MyMain {
    public static void main(String[] args) {
        Implementation first=new Implementation();
        first.addLast(1,"prashant");
        first.addLast(2,"ravi");
        first.addLast(3,"raj");
        first.addLast(4,"gaurav");
        first.addLast(5,"yash");
        first.display();
        first.deleteArFirst();
        System.out.println("Linked List after the update");
        first.display();

        System.out.println("data deleted from the last");
        first.deleteAtLast();
        System.out.println("Linked List after the update");
        first.display();


        System.out.println("get size");
        System.out.println(first.getSize());



    }
}
