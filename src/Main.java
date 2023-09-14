public class Main
{
    public static void main(String[] args)
    {
        // intOperandA, intOperandB, intSum, intProduct, intDifference, intQuotient, intModulo

        int intOperandA = 4;
        int intOperandB = 7;

        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        double doubleOperandA = 3.14;
        double doubleOperandB = 3.50;
        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;
        double doubleModulo = 0;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);

        int numberKids = 2;
        boolean isRaining = false;
        double priceGas = 2.50;
        int favoriteNumber = 7;
        double shoeSize = 11.5;
        String birthMonth = "March";
        String fullName = "Saadvik Kotagiri";

        System.out.println("There are " + numberKids + " in the family.");
        System.out.println("It would be " + isRaining + " to say that it is raining.");
        System.out.println("The cost of gas is " + priceGas);
        System.out.println("My favorite number is " + favoriteNumber);
        System.out.println("My shoe size is " + shoeSize);
        System.out.println("My birth month is in " + birthMonth);
        System.out.println("My full name is " + fullName);

    }
}