import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        String str = "My name is Pavan";

        List<String> words = Arrays.asList((str.split(" ")));

        Collections.reverse(words);
        String reversedWords = words.stream().collect(Collectors.joining(" "));

        System.out.println(reversedWords);
    }
}