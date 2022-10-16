import java.util.Scanner;
public class SteppingNumber {
    static int startingNumber;
    static    int endingNumber;
    static int count=0;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        startingNumber=input.nextInt();
        endingNumber=input.nextInt();
        findingOrder();
        steppingNumber();
    }
    public static void findingOrder()
    {
        if(endingNumber<startingNumber)
        {
            int temp=startingNumber;
            startingNumber=endingNumber;
            endingNumber=temp;
        }
    }
    public static void steppingNumber()
    {
        int index;
        boolean condition;
        for(index=startingNumber;index<=endingNumber;index++)
        {
            if(index<=10)
            {
                System.out.println(index);
            }
            else
            {
                condition=findingSteppingNumber(index);
                if(condition)
                {
                    System.out.println(index);
                }

            }
        }
        if(count==0)
        {
            System.out.println("None");
        }
    }
    public static boolean findingSteppingNumber(int number) {

        int previousRemainder = number % 10;
        int onesDigit = previousRemainder;
        number = number / 10;
        int currentRemainder=0;
        while (number != 0) {
             currentRemainder = number % 10;
            number = number / 10;
            if (previousRemainder - currentRemainder == 1 || currentRemainder - previousRemainder == 1)
            {
                previousRemainder = currentRemainder;
            }
            else
            {
                return false;
            }
        }
        if (onesDigit - currentRemainder == 1 || currentRemainder - onesDigit == 1)
        {
            count=1;
            return true;

        }
        return false;
    }
}