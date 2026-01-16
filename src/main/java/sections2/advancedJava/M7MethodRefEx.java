package sections2.advancedJava;

import java.util.Arrays;
import java.util.List;

public class M7MethodRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Harish dev", "John");
        List<String> uNames = names.stream()
                .map(String::toUpperCase).toList();
        System.out.println(uNames);
    }
}
