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
}

