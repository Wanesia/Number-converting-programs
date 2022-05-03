import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {

    public static void unicodeLoop(){
        IntStream.range(0, 144698).mapToObj(i ->  + i + new String(Character.toChars(i))+ "").forEach(System.out::print);
    }

    public static void main(String[] args){
        /*System.out.println("a");
        Converter.decimalToBinary(7);
        System.out.println();
        Converter.binaryToDecimal(110110111);*/

        unicodeDatabase.unicodeLoop();
    }
}
