public class ExceptionHandling{
    public static void main(String[] args) {
        
        int i = 8;
        int j = 0;
        int ans = 0;
        int nums[] = new int[5];
        try{
             ans = i/j;
             System.out.println(nums[6]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero!!");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index is out of bound!");
        }
    }
}