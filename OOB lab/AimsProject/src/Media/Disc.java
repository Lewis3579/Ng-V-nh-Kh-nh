package Media;

public class Disc extends Media {
    private String director;
    private int length;

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean equals(Media o) {
        if (o.getTitle() == this.getTitle())
            return true;
        else
            return false;
    }
}
