import java.io.File;
import java.lang.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.*;
import java.util.List;
public class SampleClass {
    public  static void main1(String[] args) {
        //new Thread(() -> System.out.println("inside thread constructor using lambda")).start();
        /*Runnable r =() -> System.out.println("using lambda");
        new Thread(r).start();*/

//        File directory = new File("./src/main/java");
//        String[] names = directory.list((dir,name) -> name.endsWith(".java"));
//        System.out.println(Arrays.asList(names));

//        Stream.of(3,1,4,1,5,9).forEach(x-> System.out.println(x));
//        Stream.of(3,1,4,1,5,9).forEach(System.out::println);
//
//        Consumer<Integer> printer = System.out::println;
//        Stream.of(3,1,4,1,5,9).forEach(printer);

        /*Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);*/

        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        List<String> sorted = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
        Stream.of("this", "is", "a", "list", "of", "strings").map(String::length).forEach(System.out::println);

    }
}
