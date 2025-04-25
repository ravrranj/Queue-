
import java.util.*;
import java.util.LinkedList;

public class BinaryNumber {
    public static List generateBinaryNumbers(int n) {

        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
     
        queue.offer("1");

        while (n-- > 0) {
            String binary = queue.poll();
            result.add(binary);
            queue.offer(binary + "0");
            queue.offer(binary + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 10;
        List<String> binaryList = generateBinaryNumbers(N);
        System.out.println(binaryList);
    }
}