import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSortTest {
    @Test
    public void testSelectionSort() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        input = new ArrayList<>(Arrays.asList("hi","hello","howdy","apple"));
        expectedOutput = new ArrayList<>(Arrays.asList("apple","hello","hi","howdy"));
        StringListSort.selectionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput,actualOutput);




        input = new ArrayList<>(Arrays.asList("Keaton","Tammy","James"));
        expectedOutput = new ArrayList<>(Arrays.asList("James","Keaton","Tammy"));
        StringListSort.selectionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput,actualOutput);


        input = new ArrayList<>(Arrays.asList("James","Keaton","Tammy"));
        expectedOutput = new ArrayList<>(Arrays.asList("James","Keaton","Tammy"));
        StringListSort.selectionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput,actualOutput);


        input = new ArrayList<>(Arrays.asList());
        expectedOutput = new ArrayList<>(Arrays.asList());
        StringListSort.insertionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput,actualOutput);

    }

    @Test
    public void testInsertionSort(){


        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        input = new ArrayList<>(Arrays.asList("hi","hello","howdy","apple"));
        expectedOutput = new ArrayList<>(Arrays.asList("apple","hello","hi","howdy"));
        StringListSort.insertionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput,actualOutput);




        input = new ArrayList<>(Arrays.asList("Keaton","Tammy","James"));
        expectedOutput = new ArrayList<>(Arrays.asList("James","Keaton","Tammy"));
        StringListSort.insertionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput,actualOutput);


        input = new ArrayList<>(Arrays.asList("James","Keaton","Tammy"));
        expectedOutput = new ArrayList<>(Arrays.asList("James","Keaton","Tammy"));
        StringListSort.insertionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput,actualOutput);



        input = new ArrayList<>(Arrays.asList());
        expectedOutput = new ArrayList<>(Arrays.asList());
        StringListSort.insertionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput,actualOutput);
    }
}
