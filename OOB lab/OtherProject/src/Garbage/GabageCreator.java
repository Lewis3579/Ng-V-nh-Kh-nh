package Garbage;

public class GarbageCreator {
    public void creatGarbage() {
        for (int i = 0; i < 10000; i++) {
            garbage gb = new garbage();
        }
    }
}
