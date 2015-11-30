package exercises;

/**
 * Created by mukuntha on 28/11/15.
 */
public class AsteriskPrinter {
    public void printSingleAsterisk(){
        System.out.print("*");
    }

    public void printHorizontalLineAsterisk(int n){
        for(int i=0; i<n; i++)
            System.out.print("*");
    }

    public void printVerticalLineAsterisk(int n){
        for(int i=0; i<n; i++)
            System.out.println("*");
    }

    public void printRightTriangleAsterisk(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println(" ");
        }
    }

    public void printSpaces(int numOfSpaces){
        for(int j=1; j<=numOfSpaces; j++)
            System.out.print(" ");
    }

    public void printCentredTriangleAsterisk(int n, int lastRow){
        for(int i=1; i<=lastRow; i++){
            int numOfSpaces=n-i;
            int numOfAsterisk=2*(i-1)+1;
            printSpaces(numOfSpaces);
            printHorizontalLineAsterisk(numOfAsterisk);
            System.out.println(" ");
        }
    }

    public void printReversedCentredTriangleAsterisk(int n, int firstRow){
        for(int i=firstRow; i>=1; i--){
            int numOfSpaces=n-i;
            int numOfAsterisk=2*(i-1)+1;
            printSpaces(numOfSpaces);
            printHorizontalLineAsterisk(numOfAsterisk);
            System.out.println(" ");
        }
    }

    public void printTriangleAsterisk(int n){
        printCentredTriangleAsterisk(n, n);
    }

    public void printCentredDiamondAsterisk(int n){
        printCentredTriangleAsterisk(n, n);
        printReversedCentredTriangleAsterisk(n, n - 1);
    }

    public void printCentredDiamondWithName(int n, String name){
        printCentredTriangleAsterisk(n, n-1);
        System.out.println(name);
        printReversedCentredTriangleAsterisk(n, n-1);
    }

    public static void main(String args[]){
        AsteriskPrinter asteriskPrinter = new AsteriskPrinter();
        asteriskPrinter.printSingleAsterisk();
        System.out.println(" ");
        asteriskPrinter.printHorizontalLineAsterisk(3);
        System.out.println(" ");
        asteriskPrinter.printVerticalLineAsterisk(3);
        System.out.println(" ");
        asteriskPrinter.printTriangleAsterisk(3);
        System.out.println(" ");
        asteriskPrinter.printRightTriangleAsterisk(3);
        System.out.println(" ");
        asteriskPrinter.printCentredDiamondAsterisk(3);
        System.out.println(" ");
        asteriskPrinter.printCentredDiamondWithName(3, "Priya");
    }
}
