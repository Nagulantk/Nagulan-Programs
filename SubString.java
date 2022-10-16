import java.util.Scanner;
public class SubString {
    public  static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
    String string=input.nextLine();
    string=string.toLowerCase();
    findingSubString(string);
    }
    public static void findingSubString(String string)
    {
        boolean condition;
        int indexOne;
        int count,countOne=0;
        for(int i=0;i<string.length();i++)
        {
            for(int j=i+1;j<string.length();j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    count = 0;
                    indexOne = i;
                  int indexTwo=j;
                    condition = true;
                    while (condition) {

                        if (indexOne < string.length() && indexTwo < string.length()) {
                            if (string.charAt(indexOne) == string.charAt(indexTwo)) {
                                count++;
                                indexTwo++;
                                indexOne++;
                            }
                            else {
                                if (count > 2) {
                                    printingString(i,indexOne,string);
                                 countOne=1;
                                    i=indexOne-1;
                                    j=string.length();
                                }


                                condition = false;
                            }
                        }
                        else {
                          if (count >=2) {

                              printingString(i,indexOne,string);
                             i = string.length();
                                j = string.length();countOne=1;
                           }
                            condition = false;
                        }
                    }
                }
            }
        }
        if(countOne==0)
        {
            System.out.println("None");
        }
    }
    public static void printingString(int indexOne,int indexTwo,String string)
    {
        for (int k = indexOne ; k < indexTwo; k++) {
            System.out.print(string.charAt(k));
        }
        System.out.println();

    }
}