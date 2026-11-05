package com.my_project.morse.core;

/**
 * Ядро программы - два метода, каждый работает с одной строкой текста
 */

public class MorseCoder {

    public String encode(String line) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < line.length() ; i++) {
            if (i > 0 ) {
                result.append(' ');
            }
            result.append(Alphabet.toMorse(line.charAt(i)));
        }
        return result.toString();
    }

    public String decode(String line) {
        StringBuilder result = new StringBuilder();
        for (String code : line.trim().split(" +")) {
            if (!code.isEmpty()) {
                result.append(Alphabet.fromMorse(code));
            }
        }
        return result.toString();
    }

}
