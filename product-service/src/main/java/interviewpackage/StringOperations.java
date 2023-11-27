package interviewpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOperations {
    public static void main(String[] args) {
        System.out.println("Hi");


        //Given a string find out duplicate character and its count .
        //Ex: i/p- ”manojpandey”, o/p- a-2,n-2.


        String inputValue="manojpandey";

        char[] chararray = inputValue.toCharArray();
        HashMap<Character,Integer> redundancyCountMap = new HashMap<>();
        HashMap<String,Integer> redundancyCountMap1 = new HashMap<>();
       // Stream.of(chararray).forEach(a->redundancyCountMap.put("hello",2));

        redundancyCountMap.forEach((k,v)->System.out.println(k+" - "+v));

//
//        for(char a: chararray){
//if(redundancyCountMap.containsKey(a)){
//    redundancyCountMap.put(a,redundancyCountMap.get(a)+1);}
//    else{redundancyCountMap.put(a,1);}
//}

   //     redundancyCountMap.forEach((k,v)->System.out.println(k+" - "+v));
 redundancyCountMap.entrySet().stream().filter(characterIntegerEntry -> characterIntegerEntry.getValue()>=2).forEach(System.out::println);

        String[] stringArray =  {"hello","hi"};
        Arrays.stream(stringArray).forEach(a->redundancyCountMap1.put(a,5));
        redundancyCountMap1.forEach((k,v)->System.out.println(k+" - "+v));

        Character[] charArray = {'a','b'};

        Arrays.stream(charArray).forEach(a->redundancyCountMap.put(a,7));
        redundancyCountMap.forEach((k,v)->System.out.println(k+" - "+v));


    }
}
