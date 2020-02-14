package kz.epam.training.translator;

import kz.epam.training.service.Runnable;
import kz.epam.training.service.TextReader;
import kz.epam.training.service.TextWriter;

public class EnglishTranslator extends Translator implements Runnable {
    private TextReader textReader = new TextReader();
    private TextWriter textWriter = new TextWriter();
    private char[] englishAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};
    private final String[] morseEnglishAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", " -..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};

    @Override
    public void runTranslator(String filePathForRead, String filePathForWrite) {
        System.out.println("Процесс перевода из английского в морзе");
        String text = textReader.readText(filePathForRead);
        System.out.println("Переведенный текст: " + translateToMorse(text,englishAlphabet,morseEnglishAlphabet));
        textWriter.writeText(translateToMorse(text,englishAlphabet,morseEnglishAlphabet), filePathForWrite);
        System.out.println("Обратный перевод: "+ translate(translateToMorse(text,englishAlphabet,morseEnglishAlphabet), englishAlphabet,morseEnglishAlphabet));
        System.out.println("Ваш переведенный текст успешно сохранен в файле");
    }
}

