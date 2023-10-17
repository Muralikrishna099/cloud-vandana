import java.util.Arrays;
import java.util.*;

class Example {
    public static void main(String[] args) {
       
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> shuffledList = Arrays.asList(array);
        Collections.shuffle(shuffledList);

        System.out.println("The shuffled array: " + shuffledList);
    }
}
