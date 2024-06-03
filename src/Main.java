
public class Main {
    public static void main(String[] args) {
        while(true){
            try{
                // run the code here.
                NumberConverter.binaryToDecimal();
                break;
            }catch (Exception e){
                System.out.println("Invalid input try again.");
            }
        }
    }
}