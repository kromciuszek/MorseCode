public class Main {

    public static void main(String[] args) {

        MorseDictionary dictionary = new MorseDictionary();
        PlayMorse playMorse = new PlayMorse();

        String name = "K";
        String morse = dictionary.translate(name);

        playMorse.playString(morse);



        /*
        * Make dictionary
        *
        *
        * */

    }
}
