//Creating a custom exception
class NewException extends Exception{
    public NewException(String message){
        super(message);
    }
}


public class ExceptionDemo {
    public static void main(String a[]){
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
                throw new NewException("Hate seeing zero hence updating to custom value");
        }
        catch(ArithmeticException e) {
            System.out.println("That's default output " + e);
        }
        catch(NewException e) {
            j = 18/1;
            System.out.println("Custom output " + e);
        }
        catch(Exception e) {
            System.out.println("Something went wrong..!" + e);
        }
        System.out.println(j);
        System.out.println("That's it Jack!!");
    }
}
