public class B02NullPointer{

    public static void main(String args[]){
        String str = null;
        //Try-catch-finally blocks
        try{
            // Below code will give null pointer exception as we are access null str
            // Note that string is a character array. And we are trying to access 1st character of this string.
            System.out.println("First character of str is:" + str.charAt(0));
       }
        catch (NullPointerException e){
            System.out.println("NullPointerException Caught in catch block...");
        }
        finally {
            System.out.println("Finally is executed always");
        }
    }
}

/*
Output
NullPointerException Caught in catch block...
Finally is executed always
*/
