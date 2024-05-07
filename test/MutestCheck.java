import org.junit.Test;

import static org.junit.Assert.*;

public class MutestCheck {
    @Test
    public void testWordsToBeReversed(){
        MyList lists = new MyList();
        String words = "it is still a beautiful world";
        String newWords = "world beautiful a still is it";
        assertEquals(newWords,lists.wordsToBeReversed(words));
    }

    @Test
    public void testAllLettersContainsAlphabet(){
        MyList lists = new MyList();
        String words = "the quick brown fox jumps over the lazy dog";
        assertTrue(lists.allLettersContainsAlphabet(words));
    }
    @Test
    public void testSortingNumbersInAnArray(){
        MyList lists = new MyList();
        int[] numbers = {8, 3, 1, 7, 0, 10, 2};
        int[] newNumbers = {0, 1, 2, 3, 7, 8, 10};
        assertArrayEquals(newNumbers,lists.sortingNumbersInAnArray(numbers));
    }
    @Test
    public void testContainerWithMostWater(){
        MyList lists = new MyList();
        int[] height = {1,8,6,2,5,4,8,3,7};
        assertEquals(49,lists.containerWithMostWater(height));
    }
    @Test
    public void testToFIndTheMissingNumber(){
        MyList lists = new MyList();
        int[] numbers = {9,6,4,2,3,5,7,0,1};
        assertEquals(8,lists.toFIndTheMissingNumber(numbers));
    }
    @Test
    public void testToFIndThePickElement(){
        MyList lists = new MyList();
        int[] numbers = {9,6,4,2,3,5,7,0,1};
        assertEquals(4,lists.toFIndThePickElement(numbers));
    }
    @Test
    public void testPlusOneToTheLastNumberInTheIndex(){
        MyList lists = new MyList();
        int[] numbers = {2,4,0,9,9};
        int[] newNumbers = {2,4,1,0,0};
        assertArrayEquals(newNumbers,lists.plusOneToTheLastNumberInTheIndex(numbers));

    }
    @Test
    public void testToFindTheMostOccuredNumberInTheArray(){
        MyList lists = new MyList();
        int[] numbers = {1,1,3,3,3};
        assertEquals(3,lists.toFindTheMostOccuredNumberInTheArray(numbers));
    }
    @Test
    public void testToFindTheMaximumSubarraySum(){
        MyList lists = new MyList();
        int[] numbers = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6,lists.toFindTheMaximumSubarraySum(numbers));

    }

    @Test
    public void RotateArray(){
        MyList lists = new MyList();
        int[] numbers = {1,2,3,4,5,6,7};
        int[] newNumbers = {5,6,7,1,2,3,4};
        assertArrayEquals(newNumbers,lists.RotateArray(numbers,3));

    }

    @Test
    public void testToPlusTwoNumbersWithoutPlusMethod(){
        MyList lists = new MyList();
        int numbers = 4;
        int numbers2 = 2;
        assertEquals(6,lists.toPlusTwoNumbersWithoutPlusMethod(numbers,numbers2));

    }

    @Test
    public void testStringPalindrum(){
        MyList lists = new MyList();
        String words = "madam";
        assertTrue(lists.stringPalindrum(words));
    }



}

