package com.my_project.morse;

import com.my_project.morse.exception.MorseException;

import java.util.Scanner;

public class MorseApp {

    private static final Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {

        // CLI - command line interface
        System.out.println("Азбука Морзе: кодирование и декодирования файлов");

        while (true) {
            printMenu();
            String choice = ask("Выберите действие: ");

            switch (choice) {
                case "1":
                    encodeFile();
                    break;

                case "2":
                    decodeFile();
                    break;

                case "3":
                    printAlphabet();
                    break;

                case "0":
                    System.out.println("Пока!");
                    return;
                default:
                    System.out.println("Нет такого пункта: " + choice);
            }

        }
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("1. Закодировать файл");
        System.out.println("2. Декодировать файл");
        System.out.println("3. Показать алфавит");
        System.out.println("0. Выход");
    }

    private static void encodeFile() throws MatchException {
        // TODO: спросить файлы, прочитать строки, проверить и закодировать каждую, записать результат
        System.out.println("Кодировка пока не реализована");
    }

    private static void decodeFile() throws MatchException {
        // TODO: тоже для декодирования
        System.out.println("Декодирование пока не реализовано");
    }

    private static void printAlphabet() {
        // TODO: вывести азбуку
        System.out.println("Алфавит пока не работает");
    }

    private static String ask(String promt) {
        System.out.println(promt);
        return scanner.nextLine();
    }
}


