package mycod01_1;

public class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playTopHat() {
        System.out.println("динь-динь");
    }

    void playSnare() {
        System.out.println("бах-бах");
    }
}

class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.snare = false;
        d.playSnare();
        d.playTopHat();
        if (d.snare == true) {
            d.playSnare();
        }
    }
}
