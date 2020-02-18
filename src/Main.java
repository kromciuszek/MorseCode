public class Main {

    public static void main(String[] args) {

        MorseDictionary dictionary = new MorseDictionary();
        PlayMorse playMorse = new PlayMorse();

        String name = "sos";
        String morse = dictionary.translate(name);
        System.out.println(morse);
        playMorse.playString(morse);



        /*
        * Make dictionary
        *
        *
        * */

    }
}
