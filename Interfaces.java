interface Apple{

    //variables in an interface are by default FINAL and STATIC!!!

    int price = 1000;   //so you cannot just declare a variable without assigning a value to it

    void start();
    void showType();
    void showPrice();

    //ALL THE METHODS OF AN INTERFACE ARE PUBLIC ABSTRACT, NO NEED TO EXPLICITLY SPECIFY!!!!
}

interface Google{

    int cost = 1500;

    void aiModel();
}

//IMPLEMENTS keyword is used in interfaces instead of EXTENDS as in inheriting a class

class Macintosh implements Apple, Google{

    //compulsory to define all the methods in the interface

    public void start(){
        System.out.println("Namaste! Welcome to Mac");
    }

    public void showType(){
        System.out.println("I'm the Mac");
    }

    public void showPrice(){
        System.out.println(price);
    }

    public void aiModel(){
        System.out.println("Welcome to Gemini AI");
    }

}

public class Interfaces {
    public static void main(String[] args) {
        
        Apple mac1;     //We can create a reference of an interface, but cannot create an object of it

        /*
        ---ANALOGY---

        Interface -> Like a design or blueprint; cannot be directly implemented into something real
        Class -> Where actual implementation takes place

        Therefore, interfaces can just specify the methods, but they are implemented in a class 
        */

        mac1  = new Macintosh();
        mac1.showType();
        mac1.start();
        mac1.showPrice();

        System.out.println(Apple.price);    //accessing a static variable

        //instantiating objeect of class Macintosh

        Macintosh m1 = new Macintosh();

        //Macintosh implements two interfaces: Apple and Google, so both of their abstract methods can be called 

        m1.showType();  //in Apple
        m1.start();     //in Apple  
        m1.showPrice(); //in Apple
        m1.aiModel();   //in Google

    }
}
