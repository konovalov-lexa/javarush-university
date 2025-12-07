package com.javarush.morse.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Alphabet {

    public static final Map<Character, String> TEXT_TO_MORSE;
    public static final Map<String, Character> MORSE_TO_TEXT;

    // Этот код выполняется при загрузке
    static {
        // todo: инициализировать алфавит Морзе
        // - создать временные HashMap
        Map<Character, String> textToMorse = new HashMap<>();
        Map<String, Character> morseToText = new HashMap<>();

        // - заполнить русские буквы
        textToMorse.put('А', ".-");
        textToMorse.put('Б', "-...");
        textToMorse.put('В', ".--");
        textToMorse.put('Г', "--.");
        textToMorse.put('Д', "-..");
        textToMorse.put('Е', ".");
        textToMorse.put('Ё', ".");
        textToMorse.put('Ж', "...-");
        textToMorse.put('З', "--..");
        textToMorse.put('И', "..");
        textToMorse.put('Й', ".---");
        textToMorse.put('К', "-.-");
        textToMorse.put('Л', ".-..");
        textToMorse.put('М', "--");
        textToMorse.put('Н', "-.");
        textToMorse.put('О', "---");
        textToMorse.put('П', ".--");
        textToMorse.put('Р', ".-.");
        textToMorse.put('С', "...");
        textToMorse.put('Т', "-");
        textToMorse.put('У', "..-");
        textToMorse.put('Ф', "..-.");
        textToMorse.put('Х', "....");
        textToMorse.put('Ц', "-.-.");
        textToMorse.put('Ч', "---.");
        textToMorse.put('Ш', "----");
        textToMorse.put('Щ', "--.-");
        textToMorse.put('Ъ', "--.--");
        textToMorse.put('Ы', "-.--");
        textToMorse.put('Ь', "-..-");
        textToMorse.put('Э', "..-..");
        textToMorse.put('Ю', "..--");
        textToMorse.put('Я', ".-.-");

        // - заполнить цифры (*)
        textToMorse.put('1', ".----");
        textToMorse.put('2', "..---");
        textToMorse.put('3', "...--");
        textToMorse.put('4', "....-");
        textToMorse.put('5', ".....");
        textToMorse.put('6', "-....");
        textToMorse.put('7', "--...");
        textToMorse.put('8', "---..");
        textToMorse.put('9', "----.");
        textToMorse.put('0', "-----");

        // - заполнить пунктуацию (*)
        textToMorse.put('.', ".-.-.-"); // Точка
        textToMorse.put(',', "--..--"); // Запятая
        textToMorse.put('?', "..--.."); // Вопросительный знак
        textToMorse.put('!', "-.-.--"); // Восклицательный знак
        textToMorse.put(':', "---..."); // Двоеточие
        textToMorse.put(';', "-.-.-."); // Точка с запятой
        textToMorse.put('(', "-.--."); // Открывающая скобка
        textToMorse.put(')', "-.--.-"); // Закрывающая скобка
        textToMorse.put('"', ".-..-."); // Кавычки
        textToMorse.put('\'', ".----."); // Апостроф
        textToMorse.put('-', "-....-"); // Дефис / Минус
        textToMorse.put('/', "-..-."); // Косая черта
        textToMorse.put('=', "-...-"); // Знак равенства (также используется как разделитель)
        textToMorse.put('+', ".-.-."); // Знак плюс
        textToMorse.put('@', ".--.-."); // Символ @ (коммерческое at)
        textToMorse.put(' ', "/");

        // - создать обратное отображение
        for (Map.Entry<Character, String> entry : textToMorse.entrySet()) {
            morseToText.put(entry.getValue(), entry.getKey());
        }

        // - сделать коллекции неизменяемыми
        TEXT_TO_MORSE = Collections.unmodifiableMap(textToMorse);
        MORSE_TO_TEXT = Collections.unmodifiableMap(morseToText);
    }

    private Alphabet() {}
}
