public class StringBufferTutorial {
    public static void main(String[] args) {
        
        //STRING BUFFER - To create a mutable string (by default string as immutable)

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());      //default capacity is 16 characters

        StringBuffer name = new StringBuffer("Apple");
        System.out.println(name.capacity());    //length of name + 16
        System.out.println(name.length());      //just like length of a normal String

        name.append("iPhone");
        System.out.println(name);

        //convert StringBuffer to String

        String product = name.toString();
        System.out.println(product);

        //delete a char at index

        name.deleteCharAt(5);
        System.out.println(name);

        //insert at index

        name.insert(10, "15");
        System.out.println(name);

        //StringBuffer is thread safe; StringBuilder is not
    }
}