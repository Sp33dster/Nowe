import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        IntStream stream = IntStream.builder().add(10).add(10).build();
        int sum = stream.sum();
        System.out.println(sum);
        return;
    }
}
