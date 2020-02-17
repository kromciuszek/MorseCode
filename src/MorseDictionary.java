public class MorseDictionary {
    
    private final char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?' };

    private final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.." };

    public MorseDictionary() {

    }

    public String translate (String english) {
        char[] englishArray= english.toLowerCase().toCharArray();
        String translated = "";

        for (char c : englishArray) {
            int index = indexOf(c);
            translated += morse[index];
            translated += " ";
        }

        return translated;
    }

    private int indexOf(char c) {
        int index = 0;

        for (int i=0 ; i<this.english.length ; i++) {
            if (c == this.english[i])
                index = i;
        }
        return index;
    }
}
