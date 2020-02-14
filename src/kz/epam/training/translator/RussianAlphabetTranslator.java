package kz.epam.training.translator;

public class RussianAlphabetTranslator implements Translatable {
    private final char[] russianAlphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м',
            'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ь',
            'ы', 'э', 'ю', 'я', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};
    private final String[] morseRussianAlphabet = {".-", "-...", ".--", "--.", "-..", ".", ".-.--", "...-", "--..", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-",
            "..-.", "....", "-.-.", "---.", "----", "--.-", "-..-", "-..-", "-.--", "..-..", "..--", ".-.-", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};

    @Override
    public String translateToMorse(String text) {
        text.toLowerCase();
        String translatedText = " ";
        for (int i = 0; i < text.length(); i++) {
            int indexOfEnglishAlphabet = text.charAt(i);
            for (int j = 0; j < russianAlphabet.length; j++) {
                if (russianAlphabet[j] == indexOfEnglishAlphabet) {
                    translatedText = translatedText + "," + morseRussianAlphabet[j];
                }
            }
        }
        return translatedText;
    }

    public String[] translateToRussian() {
        return null;
    }
}
