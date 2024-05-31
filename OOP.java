class Calculator{

    int n1;
    int n2;
    
    public Calculator(int n1, int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
    public int add()
    {
        return n1+n2;
    }
}
public class OOP {
    public static void main(String[] args) {

        Calculator c1 = new Calculator(1,2);
        Calculator c2 = new Calculator(3,4);
        Calculator c3 = new Calculator(6,7);

        Calculator calc[] = new Calculator[3];
        calc[0] = c1;
        calc[1] = c2;
        calc[2] = c3;
         
        //Enhanced for loop

         
        for(Calculator c : calc)    
        {
            System.out.println(c.add());
        }

        System.out.println("OOP CLASS");
    }
}
