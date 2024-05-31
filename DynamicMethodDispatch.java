class A{
    public void show(){
        System.out.println("A ko hello bolo");
    }
}

class B extends A{
    public void show(){
        System.out.println("B ko hello bolo");
    }
}

class C extends A{
    public void show(){
        System.out.println("C ko hello bolo");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        //creating object of A and assign it to reference of A

        A obj = new A();
        obj.show();

        //creating object of B and assign it to reference of A

        obj = new B();
        obj.show();

        //creating objeect of C and assign it to reference of A

        obj = new C();
        obj.show();

        //this is runtime polymorphism...obj.show() will o=invoke method of which class is decided at the run time
        
    }
}
