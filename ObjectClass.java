class Phone{

    String name;
    int price;


    //overriding the toString method from the Object class
    public String toString(){
        return name + price;
    }

    //overriding the equals method from the Object class to compare name and price of the two Phone objects
    public boolean equals(Phone other){
        if(this.name.equals(other.name) && this.price == other.price)
            return true;
        return false;
    }
}

public class ObjectClass {
    
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.name = "Pixel";
        p1.price = 500;
        System.out.println(p1);

        //Any class by default extends the Object class in Java, which has it's own methods
        //Whenever we print an object reference directly in sop statement, it prints some hex value by calling toString() method
        //eg) Phone@7344699f, here Phone us classname and 7344699f is a hash value

        Phone p2 = new Phone();
        p2.name = "iPhone";
        p2.price = 1000;

        //equals() method as defined in the Object class compares two objects based on hash values
        System.out.println(p1.equals(p2));
        p2 = p1;
        System.out.println(p1.equals(p2));

        Phone p3 = new Phone();
        p3.name = "Pixel";
        p3.price = 500;


        //in this case, hashes of p1 and p3 are not the same, but data members have same values, hence the fucntion redefined in Phone class will return true

        System.out.println(p1.equals(p3));

        //try commenting the redefined method definition in class Phone and observe the o/p


    
    }
}
