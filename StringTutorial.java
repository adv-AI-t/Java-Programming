public class StringTutorial {
    
    //a String is Java is not a data type, it is a CLASS 

    public static void main(String[] args) {

        String name = new String("Advait");   //typical way of creating reference to an object 
        String surname = "Joshi";                      //shorter syntax -- preffered
        System.out.println(name + surname);            //+ is for concatenation of strings


        String appname = "Scalp";
        appname = appname + "Smart";    //same object is NOT updated...new object is created and original one is garbage
        System.out.println(appname);

        //----STRING CONSTANT POOL----
        //Collection of all the strings used in the program
        //If a string is present in the pool and same string reference is created again, new object is NOT created
        //Same string is pointed out by all multiple  references 


    }
}