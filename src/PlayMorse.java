import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class PlayMorse {

    private final File shortSound = new File(getClass().getResource("media/short.wav").getPath());
    private final File longSound = new File(getClass().getResource("media/long.wav").getPath());

    public PlayMorse() {

    }


    private void playSound(File sound) {

        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();

            long sleepTime = clip.getMicrosecondLength()/1000;
            Thread.sleep(sleepTime + 50); // + 50 just to make bigger pause after every sound

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

   public void playString(String morse) {
        char[] chars = morse.toCharArray();

        // play dot, dash or make pause
        for (char c : chars) {
            if (c == '.') {
                playSound(shortSound);
            }

            else if (c == '-') {
                playSound(longSound);
            } else {
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
   }


}
