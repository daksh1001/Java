import java.util.Scanner;
public class BinaryOctal {

    public static void main(String[] args) {
        long binary;
        
        Scanner sc=new Scanner (System.in);
        System.out.println("enter value of binary to convert it in octal");
        binary=sc.nextLong();
        int octal = convertBinarytoOctal(binary);
        System.out.printf("%d in binary = %d in octal", binary, octal);
    }

    public static int convertBinarytoOctal(long binaryNumber)
    {
        int octalNumber = 0, decimalNumber = 0, i = 0;

        while(binaryNumber != 0)
        {
            decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
            ++i;
            binaryNumber /= 10;
        }

        i = 1;

        while (decimalNumber != 0)
        {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }

        return octalNumber;
    }
}
