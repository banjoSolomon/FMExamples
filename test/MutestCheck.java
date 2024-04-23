import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
}

