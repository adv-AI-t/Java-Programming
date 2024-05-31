class Computer{
    public void show(){
        System.out.println("Welcome to iMac");
    }
}

class Laptop extends Computer{
    public void show(){
        System.out.println("Welcome to MacBook");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        
        //CASE1: Creating reference of Computer type and storing object of Computer type

        Computer comp = new Computer();
        comp.show();

        //CASE2: Creating reference of Laptop type and storing object of Laptop type

        Laptop book = new Laptop();
        book.show();

        //CASE3: Storing object of type Laptop in reference of Computer type

        comp = new Laptop();
        comp.show();

        //CASE4: Storing object of type Computer in reference of Laptop type --ERROR!!! Type mismatch


        /*MORAL OF THE STORY: 1) The method which is called is of the type of object and not of that of the reference variable
         2) Cannot assign object of Parent class to Reference of Child class
         */
    }
}