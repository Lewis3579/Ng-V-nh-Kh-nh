package Media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public void play() {
        System.out.printf("Playing %d DVDs:\n", tracks.size());
        for (int i = 0; i < tracks.size(); i++) {
            tracks.get(i).play();
        }
    }

    public void addTrack(Track track) {
        for (int i = 0; i < tracks.size(); i++) {
            if (tracks.get(i) == track) {
                return;
            }
        }
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        for (int i = 0; i < tracks.size(); i++) {
            if (tracks.get(i) == track) {
                tracks.remove(i);
            }
        }
    }

    public int sumLength() {
        int sumlenght = 0;
        for (int i = 0; i < tracks.size(); i++) {
            sumlenght = sumlenght + tracks.get(i).getLength();
        }
        return sumlenght;
    }
}
