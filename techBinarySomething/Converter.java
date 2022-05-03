import java.util.ArrayList;

public class Converter {
    public static void decimalToBinary(int n){
        ArrayList<Integer> binary = new ArrayList<>();
        System.out.println(n+" Converted to Binary:");

        while(n>0){
            binary.add(n%2);
            n/=2;
        }

        for(int i=binary.size(); i>0; i--){
            System.out.print(binary.get(i-1)); //-1 because index starts from 0 size() gives 1 too much
        }
        System.out.println("");
    }

    public static void binaryToDecimal(int n){
        int i = 0;
        int remainder;
        int decimalNumber=0;
        System.out.println(n+" Converted to Decimal:");

        while (n != 0) {
            remainder = n % 10;
            n /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        System.out.println(decimalNumber);
    }
}
