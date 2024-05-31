enum LaptopComp{
    
    Macbook(1000), Yoga(900), Spectre(650); //these are the objects

    private int price;

    LaptopComp(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
public class EnumClass {
    
    public static void main(String[] args) {
        
        LaptopComp lap = LaptopComp.Macbook;    //creating instance of LaptopComp of type Macbook
        System.out.println(lap.getPrice());     //prints price of Macbook 
    }
}
