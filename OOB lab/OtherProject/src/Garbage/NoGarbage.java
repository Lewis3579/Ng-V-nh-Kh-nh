package Garbage;

public class NoGarbage {
    public static void main(String[] args) {
        GabageCreator gc = new GabageCreator();
        System.gc();
    }
}