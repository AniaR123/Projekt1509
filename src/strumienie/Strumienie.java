package strumienie;

import java.util.Arrays;
import java.util.List;

public class Strumienie {
    public static void main(String[] args) {
        List<String> myList= Arrays.asList("a1","a2","b1","c2","c1");   //lista Stringów
        myList.stream()
                .filter(s->s.startsWith("c"))   //filtrujemy tylko to co zaczyna się od c
                .map(String::toUpperCase)   //zamiana liter na duże
                .sorted()   //sortowanie
                .forEach(System.out::println);      //wydrukowanie tego co zostało z listy po wszystkich operacjach
        }
    }

