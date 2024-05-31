class X{

    int age;

    public void show(){
        System.out.println("A ko hello bolo");
    }

    class Y{
        public void config(){
            System.out.println("Inside config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        X obj = new X();
        obj.show();


        //instantiating inside class
        //having a reference of outer class is necessary
        
        X.Y obj2 = obj.new Y();
        obj2.config();
    }
}
