package youtube;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Multiple type parameters
        Map<String, Integer> map = new HashMap<>();
        map.put("Hello", 42);
        map.put("world", 500);


        //You can create a pair of Strings or integers from the Pair class constuctor
        Pair<String,String> strings = new Pair<>("Hello", "World");
        Pair<Integer,Integer> integers = new Pair<>(42, 500);
        System.out.println(strings);
        System.out.println(integers);

        //Creating a pair of people from the Person class
        //Remember the new keyword to create a new person
        Pair<Person, Person> people = new Pair<>(new Person("Richard"), new Person("Casey"));
        System.out.println(people);

        //A pair of strings an integers
        Pair<String, Integer> stringIntegerPair = new Pair<>("hello" ,42);
        String first = stringIntegerPair.getFirst();
        Integer second = stringIntegerPair.getSecond();


        //these are for the reverse method at the bottom
        List<String> originalList = List.of("Hello", "World");
        System.out.println(reverse(originalList));
        System.out.println(originalList);

        List<Integer> anotherList = List.of(1,2,3,4,5);
        List<Integer> reversed = reverse(anotherList);
        System.out.println("Reversed:" + reversed);
        System.out.println("Original: " + anotherList);
           }
     //Type Parameter on a method
    //put them just before the methods return type

    private static <T> List<T> reverse(List<T> originalList){
        List<T> reversedList = new ArrayList<>(originalList);
        Collections.reverse(reversedList);
        return reversedList;
    }
}