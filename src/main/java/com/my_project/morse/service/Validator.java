package com.my_project.morse.service;

import com.my_project.morse.exception.MorseException;

public class Validator {

    public void validateText(String line, int lineNumber) throws MorseException {
        // TODO: каждый символ строки есть в азбуке, иначе исключение с номером строки и позиции
    }

    public void validateMorse(String line, int lineNumber) throws MorseException {
        // TODO: каждый код строки есть в азбуке, иначе исключение с номером строки и кода
    }

}
