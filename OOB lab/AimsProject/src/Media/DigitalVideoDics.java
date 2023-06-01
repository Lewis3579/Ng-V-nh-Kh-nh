package Media;

public class DigitalVideoDics extends Disc implements Playable {

    private static int nbDigitalVideoDiscs = 0;

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public DigitalVideoDics(String title) {
        this.setTitle(title);
        nbDigitalVideoDiscs++;
        this.setID(nbDigitalVideoDiscs);
    }

    public DigitalVideoDics(String category, String title, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        setID(nbDigitalVideoDiscs);

    }

    public DigitalVideoDics(String director, String category, String title, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.setDirector(director);
        nbDigitalVideoDiscs++;
        this.setID(nbDigitalVideoDiscs);
    }

    public DigitalVideoDics(String title, String category, String director, int length, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.setDirector(director);
        this.setLength(length);
        nbDigitalVideoDiscs++;
        this.setID(nbDigitalVideoDiscs);
    }

    public static float nb() {
        return nbDigitalVideoDiscs;
    }
}