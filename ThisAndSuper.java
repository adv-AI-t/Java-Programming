class A{

    A(){
        System.out.println("A default");
    }

    A(int n){
        System.out.println("A parameter");
    }
}

class B extends A{

    B(){

        super();    //no need to write explicitly
        System.out.println("B default");
    }

    B(int n){

        super(n);    //passing the parameter n in to the super class, to invoke the parameterized constructor of A

        System.out.println("B parameter");
    }

}

class C extends A{

    C(){
        super();
        System.out.println("Default C");
    }

    C(int n){
        this();
        System.out.println("Parameterized C");
    }

}
public class ThisAndSuper {
    
    public static void main(String[] args) {

        B bobj = new B();

        /*
        When I create an object of class B which is a subclass of class A, 
        first the constructor of super class ie A is called
        and then constructor of class B is called
        */

        B paraobj = new B(5);

        /*
        When I create object of B with parameter,
        first the default constructor of class A is called
        and then the parameterized constructor of class B is called
         */

         /*
        "EVERY CONSTRUCTOR HAS A DEFAULT METHOD : SUPER --IT IS HIDDEN"
        It is used to call the constructor of the super class

        Passing the parameter in this super method will invoke the parametersized constructor of super class!!
          */

        /*
        Java by default extends each class by "Object" class which is built in in Java

        eg) class A extends Object

        calling super() is equivalent to calling constructor of Object class of there is no other super class
         */

        C cobj = new C(2);

        /*
         this() will execute the constructor of the same class
         In case of class C:

         C (parameterized) => C (default) => A (default)
         */

    }
    
}
