package kz.epam.training.translator;

public class EnglishAlphabetTranslator implements Translatable {

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
    public String translateToMorse(String text) {
        text.toLowerCase();
        String translatedText = " ";
        for (int i = 0; i < text.length(); i++) {
            int indexOfEnglishAlphabet = text.charAt(i);
            for (int j = 0; j < englishAlphabet.length; j++) {
                if (englishAlphabet[j] == indexOfEnglishAlphabet) {
                    translatedText = translatedText + " " + morseEnglishAlphabet[j];
                }
            }
        }
        return translatedText;
    }

    public String translateToEnglish(String text) {
       return null;
    }
}

