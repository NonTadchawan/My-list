package org.example;
public class Main
{
    public static void main( String[] args )
    {
        MyList myList = new MyList();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");

        for (Object value:myList){
            System.out.println(value);
        }

        System.out.println("Contain in mylist : "+myList.contain("c"));

        System.out.println(myList);
        myList.remove("B");
        for (Object value:myList){
            System.out.println(value);
        }
        System.out.println(myList);



    }
}
