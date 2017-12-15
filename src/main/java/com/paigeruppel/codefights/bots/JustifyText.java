package com.paigeruppel.codefights.bots;

public class JustifyText {

    String[] textJustification(String[] words, int l) {
        int lines = findLineNumber(words, l);
        String[] justified = new String[lines];
        int[] wordsPerLine = findWordsPerLine(words, l, lines);

        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int i = 0; i < justified.length; i++) {
            for (int j = start; j < wordsPerLine[i]; j++) {
                sb.append(words[j] + " ");
            }
            justified[i] = sb.toString();
            start += wordsPerLine[i];
        }

        int charCount = 0;
        int index = 0;


        return justified;
    }

    int findLineNumber(String[] words, int l) {
        int charCount = 0;
        for (String s : words) {
            charCount += s.toCharArray().length;
        }
        charCount += words.length - 1;
        int remainder = charCount % l;
        int lines = (remainder > 0) ? (charCount / l + 1) : charCount/l;
        return lines;
    }

    int[] findWordsPerLine(String[] words, int l, int lines) {
        int[] wordsPerLine = new int[lines];
        int count = 0;
        int index = 0;
        int charCount = 0;
        for (String s : words) {
            int sLength = s.length() + 1;
            if (charCount + sLength <= l) {
                count++;
                charCount += sLength;
            } else {
                wordsPerLine[index] = count;
                count = 0;
                charCount = 0;
                index++;
            }
        }
        wordsPerLine[index] = count;
        return wordsPerLine;
    }

}
