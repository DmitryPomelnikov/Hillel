package test.homework13.playableRecordable;

public class Player implements Playable, Recordable {
    public void play() {
        System.out.println("Playing...");
    }

    public void record() {
        System.out.println("Recording...");
    }

    public void pause() {
        System.out.println("Pausing...");
    }

    public void stop() {
        System.out.println("Stopping...");
    }
}
