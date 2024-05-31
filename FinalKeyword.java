/*
 FINAL KEYWORD

 1)for variables: same as using const...value cannot be changed

 2)for method: to avoid method overriding

 3)for class: to not allow inheritance (extending)
 */

class A{
    public final void show(){
        System.out.println("Developed by AdvJo");
    }
}

class B extends A{
    // public void show(){

        //this is illegal is show() is final method in parent class A and hence cannot be overridden

    // }
}
public class FinalKeyword {
    
}
