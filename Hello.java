public class Hello {

    static double num = 6.9;
    
    public static void main(String[] args) {

        byte n1 = 123;
        int n2 = 345;

        float f = 5.6f; //always use f at the end else it generates an error

        n1 = (byte)n2;  //typecasting


        //JAGGED ARRAY - fixed number of rows, but each subarray can have different number of elements
        int nums[][] = new int[3][];
        
        //individully define size of subarrays
        
        nums[0] = new int[4];
        nums[1] = new int[100];
        nums[2] = new int[67];

        //while converting from int to byte, range of byte restricted to -128 to 127. 
        //hence 345 - 2*128 = 89 will be the value stored in n1

        System.out.println("HELLO"+n1+f);
    }
}
