import org.junit.Test;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MutestCheck {
    @Test
    public void testWordsToBeReversed() {
        MyList lists = new MyList();
        String words = "it is still a beautiful world";
        String newWords = "world beautiful a still is it";
        assertEquals(newWords, lists.wordsToBeReversed(words));
    }

    @Test
    public void testToReverseArrayWithStream() {
        MyList lists = new MyList();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] newNumbers = {7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(newNumbers, lists.toReverseArrayWithStream(numbers));
    }

    @Test
    public void testAllLettersContainsAlphabet() {
        MyList lists = new MyList();
        String words = "the quick brown fox jumps over the lazy dog";
        assertTrue(lists.allLettersContainsAlphabet(words));
    }

    @Test
    public void testSortingNumbersInAnArray() {
        MyList lists = new MyList();
        int[] numbers = {8, 3, 1, 7, 0, 10, 2};
        int[] newNumbers = {0, 1, 2, 3, 7, 8, 10};
        assertArrayEquals(newNumbers, lists.sortingNumbersInAnArray(numbers));
    }

    @Test
    public void testContainerWithMostWater() {
        MyList lists = new MyList();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, lists.containerWithMostWater(height));
    }

    @Test
    public void testToFIndTheMissingNumber() {
        MyList lists = new MyList();
        int[] numbers = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(8, lists.toFIndTheMissingNumber(numbers));
    }

    @Test
    public void testToFIndThePickElement() {
        MyList lists = new MyList();
        int[] numbers = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(4, lists.toFIndThePickElement(numbers));
    }

    @Test
    public void testPlusOneToTheLastNumberInTheIndex() {
        MyList lists = new MyList();
        int[] numbers = {2, 4, 0, 9, 9};
        int[] newNumbers = {2, 4, 1, 0, 0};
        assertArrayEquals(newNumbers, lists.plusOneToTheLastNumberInTheIndex(numbers));

    }

    @Test
    public void testToFindTheMostOccuredNumberInTheArray() {
        MyList lists = new MyList();
        int[] numbers = {1, 1, 3, 3, 3};
        assertEquals(3, lists.toFindTheMostOccuredNumberInTheArray(numbers));
    }

    @Test
    public void testToFindTheMaximumSubarraySum() {
        MyList lists = new MyList();
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, lists.toFindTheMaximumSubarraySum(numbers));

    }

    @Test
    public void RotateArray() {
        MyList lists = new MyList();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] newNumbers = {5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(newNumbers, lists.RotateArray(numbers, 3));

    }

    @Test
    public void testToPlusTwoNumbersWithoutPlusMethod() {
        MyList lists = new MyList();
        int numbers = 4;
        int numbers2 = 2;
        assertEquals(6, lists.toPlusTwoNumbersWithoutPlusMethod(numbers, numbers2));

    }

 @Test
 public void testForAbsoluteValue(){
        MyList lists = new MyList();
     int[] array = {1, 3, 5, 4, 8, 2, 4, 3, 6, 5 };
     int x= 3;
     int y= 2;
     int expected = 2;
     assertEquals(expected, lists.absoluteValue(array, x, y));


 }


    @Test
    public void testStringPalindrum() {
        MyList lists = new MyList();
        String words = "madam";
        assertTrue(lists.stringPalindrum(words));
    }

    @Test
    public void testMostOccurredNumber() {
        MyList lists = new MyList();
        int[] numbers = {1, 1, 3, 3, 3};
        assertEquals(3, lists.mostOccurredNumber(numbers));
    }
    @Test
    public void testGetEvenNumbers(){
        MyList lists = new MyList();
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = getEvenNumbers(numbers);
        assertNotNull(evenNumbers);
        assertEquals(5, evenNumbers.size());


    }

    @Test
    public void testMapCodePointToCharacter(){
        MyList lists = new MyList();
        List<Integer> codePoint = List.of(65, 97, 66, 98, 66, 69, 48);
        Map<Integer, String> map = mapCodePointToCharacter(codePoint);
        Map<Integer, String> expected = Map.of(
                65, "A",
                97, "a",
                98, "b",
                66, "B",
                69, "E",
                48, "0"
        );
        assertNotNull(map);
        System.out.println(map);
        assertEquals(expected, map);


    }

    @Test
    public void testNumbersFormatted(){
        MyList lists = new MyList();
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        String result = lists.getNumberFormatted(numbers);
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]";
        assertNotNull(result);
        assertTrue(result.startsWith(("[")));
        assertTrue(result.endsWith(("]")));
        assertEquals(expected, result);


    }

    private Map<Integer, String> mapCodePointToCharacter(List<Integer> codePoint) {
        return codePoint.stream()
               .collect(Collectors.toMap((codepoint)->codepoint, Character::toString, (a,b)->b, ()->new Hashtable<>()));
    }

    private List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
               .filter(number -> number % 2 == 0)
               .collect(Collectors.toList());//toSet, toCollection
    }


}
