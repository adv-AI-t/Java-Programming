/*
In method overriding, if there exist method with same name, number of arguments, type of arguments,
 then the method of class whose object is used for calling it is executed
 and not the one in the parent class.
 */

class A{

    public int add(int a, int b){
        return a+b;
    }
}

class B extends A{

    //add is overriden in the child class B

    public int add(int a, int b){
        return a+b+1;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B bobj = new B();
        int r1 = bobj.add(2, 3);    //add method of class B is invoked!
        System.out.println(r1);
    }
}
