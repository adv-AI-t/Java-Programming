class A{
    public void show1(){
        System.out.println("A ko hello bolo");
    }
}

class B extends A{
    public void show2(){
        System.out.println("B ko hello bolo");
    }
}

public class Casting {
    public static void main(String[] args) {
        
        //UPCASTING

        A obj = (A) new B();    //casting child class object to parent class
        obj.show1();  

        //Upcasting happens implicitly


        //DOWNCASTING

        B obj2 = (B) obj;
        obj2.show2(); 
    }
}
