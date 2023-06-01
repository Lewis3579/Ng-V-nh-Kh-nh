import Media.Media;
import java.util.ArrayList;
import java.util.List;

public class Store {
    public static final int MAX_NUMBER_ORDERED = 1000;
    private static ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public static int j;

    public static void addMedia(Media item) {
        if (itemsInStore.size() == MAX_NUMBER_ORDERED)
            System.out.println("The cart is full.");
        else {
            itemsInStore.add(item);
        }
    }

    public static void removeMedia(Media item) {
        if (itemsInStore.size() == 0)
            System.out.println("There is no item!");
        else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                if (itemsInStore.get(i) == item) {
                    itemsInStore.remove(i);
                    j = i;
                }
            }
        }
    }

    public static Media cartTest(String title) {
        int i;
        for (i = 0; i < itemsInStore.size(); i++) {
            if (title == itemsInStore.get(i).getTitle()) {
                return itemsInStore.get(i);
            }
        }
        return null;

    }
}
