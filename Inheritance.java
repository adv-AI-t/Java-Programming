/*
 Kya hai inheritance...umm?

 1) has
 A house has a room, TV, Fridge, etc

 2) is
 Jeep Compass is a car ...it is generalization of an entity...something belonging to some category
 "is" explains INHERITANCE

 Child class IS a Parent class with additional properties

 MULTIPLE INHERITANCE IN JAVA DOESNT WORK (WITHOUT INTERFACES) 
 */


class Calc{

    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class AdvancedCalc extends Calc{

    public int multi(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        return a/b;
    }
}

public class Inheritance {

    public static void main(String[] args) {
        
        Calc c1 = new Calc();
        System.out.println(c1.add(2,3));
        System.out.println(c1.sub(5,3));

        //creating object of child class which has add, sub as inherited features, multi, div as new features

        //FOR INHERITANCE YOU NEED A CLASS FILE; HAVING A JAVA FILE IS NOT MANDETORY

        AdvancedCalc c2 = new AdvancedCalc();
        System.out.println(c2.add(1,2));
        System.out.println(c2.sub(1,2));
        System.out.println(c2.multi(1,2));
        System.out.println(c2.div(1,2));

    }
   
    
}
