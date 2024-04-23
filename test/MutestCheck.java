import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MutestCheck {
    @Test
    public void testWordsToBeReversed(){
        MyList lists = new MyList();
        String words = "it is still a beautiful world";
        String newWords = "world beautiful a still is it";
        assertEquals(newWords,lists.wordsToBeReversed(words));
    }
}

