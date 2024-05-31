class Advait{
    public void show(){
        System.out.println("Hello Advait!");
    }

    public void getAge()
            {
                System.out.println(20);
            }
}

public class AnonymousInnerClass{
    public static void main(String[] args) {
        
        //creating an instance of Advait class

        Advait ad1 = new Advait();
        ad1.show();
        ad1.getAge();

        //adding additional definition as anonymous inner class

        //IMPORTANT!!!!
        
        Advait ad2 = new Advait()
        {    

            //only those methods which are defined in the class can be redefined here
            //CANNOT DEFINE NEW METHODS

            public void show(){
                System.out.println("Hello AdvJo!");
            }

            public void getAge()
            {
                System.out.println(25);
            }
        };
        ad2.show();
        ad2.getAge();

        //this show is the redefined show in ano. class
    }
}