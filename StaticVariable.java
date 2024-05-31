class Vehicle{

    String brand;
    int capacity;

    //static variable is a common variable used by all objects. 
    //if it is changes using a particular object, its value changes for all the objects

    static String type;

    //static block initializes the value of static variable
    //it is called even before the constructor
    static
    {
        type = "SUV";
    }

    public void showInfo()
    {
        System.out.println(brand + " " + capacity + "000cc " + type);
    }
}
public class StaticVariable {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        Vehicle v1 = new Vehicle();
        v1.brand = "Jeep";
        v1.capacity = 2;
        v1.type = "Car";

        Vehicle v2 = new Vehicle();
        v2.brand = "BMW";
        v2.capacity = 3;
        
        v1.showInfo();
        v2.showInfo();

        v1.type = "SUV";

        //type of both v1 and v2 object set to SUV

        v1.showInfo();
        v2.showInfo();

        //static variable can be called by class name

        System.out.println(Vehicle.type);

        //Class is a class in Java

        Class.forName("Vehicle");
    }

}
