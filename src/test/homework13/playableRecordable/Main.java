package test.homework13.playableRecordable;

import java.util.Scanner;

public class Main {
    public static void playMe() {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.println("Choice program:\nPlay\nStop\nRecord\nPause");
        String input = scanner.next().toLowerCase();
        scanner.close();
        switch (input) {
            case "play":
                player.play();
                break;
            case "stop":
                player.stop();
                break;
            case "record":
                player.record();
                break;
            case "pause":
                player.pause();
                break;
            default:
                System.err.println("Chosen incorrect program");
                break;
        }
    }

    public static void main(String[] args) {
        playMe();
    }
}
