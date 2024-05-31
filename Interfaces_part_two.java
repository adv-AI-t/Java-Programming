interface Comp{
    
    void code();
}

class Laptop implements Comp{
    public void code(){
        System.out.println("Coding on Laptop");
    }
}

class Desktop implements Comp{
    public void code(){
        System.out.println("Coding on Desktop");
    }
}

class Developer{

    public void startCoding(Comp c){
        c.code();
    }
}

public class Interfaces_part_two{
    
    public static void main(String[] args) {
        
        Developer advjo = new Developer();
        Laptop macbook = new Laptop();
        Desktop imac = new Desktop();

        //passing a laptop object
        advjo.startCoding(macbook);

        //passing a desktop object
        advjo.startCoding(imac);
    }
    
}
