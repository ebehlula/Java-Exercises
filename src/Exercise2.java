
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise2 {

    public static void main(String[] args) {

        String sentence = "Hello World How are you doing";
        String[] test = sentence.split("");
        List<String> unorderedList= new ArrayList<>(Arrays.asList(test));
        System.out.println(unorderedList);
        List<String> orderedList = reverseNaturalOrder(unorderedList);
        System.out.println(orderedList);

    }

    private static List<String> reverseNaturalOrder(List<String> unorderedList) {
        Stream<String> resultStream = unorderedList.stream().filter(s -> !s.equals(" "));
        List<String> result = resultStream.collect(Collectors.toList());
        Collections.sort(result, (o1,o2)-> o2.compareToIgnoreCase(o1) );
        return result;
    }


}