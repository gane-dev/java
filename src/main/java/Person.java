import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
public class Person {
    private String name;
    public  Person(){}
    public  Person(String name){ this.name = name;}
    public  Person(Person p){ this.name = p.name;}
    public  static void main(String[] args) {
        List<String> names =
                Arrays.asList("Grace Hopper", "Barbara Liskov", "Ada Lovelace",
                        "Karen Spärck Jones");
        List<Person> people = names.stream()
                .map(Person::new)
                .collect(Collectors.toList());
        people.forEach(x -> System.out.println(x.name));
    }
}
