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

    public boolean allLettersContainsAlphabet(String words) {
        boolean[] letterPresent = new boolean[26];
        String lowercaseWords = words.toLowerCase();
        for (int count = 0; count < lowercaseWords.length(); count++) {
            char ch = lowercaseWords.charAt(count);
            if (ch >= 'a' && ch <= 'z') {
                letterPresent[ch - 'a'] = true;
            }
        }
        for (boolean present : letterPresent) {
            if (!present) {
                return false;
            }
        }
        return true;
    }

    public int[] sortingNumbersInAnArray(int[] numbers) {
        for (int count = 0; count < numbers.length - 1; count++) {
            for (int index = count + 1; index < numbers.length; index++) {
                if (numbers[count] > numbers[index]) {
                    int temp = numbers[count];
                    numbers[count] = numbers[index];
                    numbers[index] = temp;
                }
            }
        }
        return numbers;
    }

    public int containerWithMostWater(int[] height) {
        int maxArea = 0;
        for (int count = 0; count < height.length - 1; count++) {
            for (int index = count + 1; index < height.length; index++) {
                int area = (index - count) * Math.min(height[count], height[index]);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public int toFIndTheMissingNumber(int[] numbers) {
        int sum = 0;
        for (int count = 0; count < numbers.length; count++) {
            sum += numbers[count];
        }
        return (numbers.length * (numbers.length + 1)) / 2 - sum;
    }

    public int toFIndThePickElement(int[] numbers) {
        int sum = 0;
        for (int count = 0; count < numbers.length; count++) {
            sum += numbers[count];
        }
        return sum / numbers.length;
    }


    public int[] plusOneToTheLastNumberInTheIndex(int[] numbers) {
        int index = numbers.length - 1;
        while (index >= 0) {
            if (numbers[index] < 9) {
                numbers[index]++;
                return numbers;
            } else {
                numbers[index] = 0;
                index--;
            }
        }
        int[] newNumbers = new int[numbers.length + 1];
        newNumbers[0] = 1;
        return newNumbers;
    }

    public int toFindTheMostOccuredNumberInTheArray(int[] numbers) {
        int maxCount = 0;
        int mostOccoured = 0;
        for (int count = 0; count < numbers.length; count++) {
            int currentCount = 0;
            for (int index = 0; index < numbers.length; index++) {
                if (numbers[count] == numbers[index]) {
                    currentCount++;
                }

            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostOccoured = numbers[count];
            }
        }
        return mostOccoured;
    }

    public int toFindTheMaximumSubarraySum(int[] numbers) {
        int maxSum = 0;
        for (int count = 0; count < numbers.length; count++) {
            int currentSum = 0;
            for (int index = count; index < numbers.length; index++) {
                currentSum += numbers[index];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public int[] RotateArray(int[] numbers, int i) {
        int[] newNumbers = new int[numbers.length];
        for (int count = 0; count < numbers.length; count++) {
            newNumbers[(count + i) % numbers.length] = numbers[count];
        }
        return newNumbers;
    }


    public int toPlusTwoNumbersWithoutPlusMethod(int numbers, int numbers2) {
        return numbers2-(-numbers);


    }

    public boolean stringPalindrum(String words) {
        StringBuilder reversedWordsBuilder = new StringBuilder();
        for (int count = words.length() - 1; count >= 0; count--) {
            reversedWordsBuilder.append(words.charAt(count));
        }
        return words.equals(reversedWordsBuilder.toString());
    }
}
