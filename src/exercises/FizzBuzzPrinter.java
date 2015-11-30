package exercises;

/**
 * Created by mukuntha on 28/11/15.
 */
public class FizzBuzzPrinter {
    public void FizzBuzz(){
        for(int i=1; i<=100; i++){
            if(i%3==0&&i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
    public static void main(String args[]){
        FizzBuzzPrinter fizzBuzzPrinter = new FizzBuzzPrinter();
        fizzBuzzPrinter.FizzBuzz();
    }
}
