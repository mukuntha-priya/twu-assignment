package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mukuntha on 28/11/15.
 */
public class PrimeFactorsPrinter {
    public List<Integer> generatePrimeFactors(int n){
        List<Integer> primeFactors = new ArrayList<>();
        for(int i=2; i<n; i++){
            if((n%i==0)&&isPrime(i)){
                primeFactors.add(i);
            }
        }
        return primeFactors;
    }
    public boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        List<Integer> output;
        PrimeFactorsPrinter primeFactorsPrinter = new PrimeFactorsPrinter();
        output = primeFactorsPrinter.generatePrimeFactors(30);
        for(int i: output)
            System.out.print(i+" ");
    }
}
