public class MyList {
    public String wordsToBeReversed(String words) {
        StringBuilder reversedWordsBuilder = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        for (int count = 0; count < words.length(); count++) {
            char charred = words.charAt(count);
            if (charred != ' ') currentWord.append(charred);
            else {
                if (!currentWord.isEmpty()) {
                    if (!reversedWordsBuilder.isEmpty()) {
                        reversedWordsBuilder.insert(0, ' ');
                    }
                    reversedWordsBuilder.insert(0, currentWord);
                    currentWord.setLength(0);
                }
            }
        }
        if (!currentWord.isEmpty()) {
            if (!reversedWordsBuilder.isEmpty()) {
                reversedWordsBuilder.insert(0, ' ');
                reversedWordsBuilder.insert(0, currentWord);
            }

        }
        return reversedWordsBuilder.toString();
    }
}

