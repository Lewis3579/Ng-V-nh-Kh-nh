import java.util.ArrayList;
import java.util.Collections;

import Media.DigitalVideoDics;
import Media.Media;
import Media.Book;
import Media.CompactDisc;

public class Cart implements Comparator {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public int j;

    public void addMedia(Media item) {
        if (itemsOrdered.size() == MAX_NUMBER_ORDERED)
            System.out.println("The cart is full.");
        else {
            itemsOrdered.add(item);
        }
    }

    // public void addDigitalVideoDics(DigitalVideoDics item1, DigitalVideoDics
    // item2) {
    // if (qtyOrdered + 2 >= MAX_NUMBER_ORDERED - 1)
    // System.out.println("The cart is full.");
    // else {
    // itemsOrdered[qtyOrdered] = item1;
    // itemsOrdered[qtyOrdered + 1] = item2;
    // this.qtyOrdered = this.qtyOrdered + 2;
    // }
    // }

    // public void addDigitalVideoDics(ArrayList<DigitalVideoDics> dvdList) {
    // if (qtyOrdered + dvdList.size() > MAX_NUMBER_ORDERED)
    // System.out.println("The cart will be full");
    // else {
    // for (int i = 0; i < dvdList.size(); i++) {
    // itemsOrdered[qtyOrdered] = dvdList.get(i);
    // this.qtyOrdered++;
    // }
    // }
    // }

    // public void removeDigitalVideoDics(DigitalVideoDics item) {
    // if (qtyOrdered == 0)
    // System.out.println("There is no item!");
    // else {
    // for (int i = 0; i < qtyOrdered; i++) {
    // if (itemsOrdered[i] == item) {
    // itemsOrdered[i] = null;
    // j = i;
    // }
    // }
    // for (int i = j; i < qtyOrdered - 1; i++) {
    // itemsOrdered[i] = itemsOrdered[i + 1];
    // }
    // qtyOrdered--;
    // }
    // }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }

    public void printCart() {
        if (itemsOrdered.isEmpty())
            System.out.println("There is no DVDs!");
        else {
            System.out.println("Number of dvds: " + itemsOrdered.size());
            System.out.println("****************CART****************");
            System.out.println("Ordered Items");
            for (int i = 0; i < itemsOrdered.size(); i++) {
                DigitalVideoDics dig = (DigitalVideoDics) itemsOrdered.get(i);

                System.out.printf("DVD - %s %s %s %d: %f", dig.getTitle(), dig.getCategory(),
                        dig.getDirector(), dig.getLength(),
                        dig.getCost());
                System.out.println("\n");
            }
            System.out.print("Total cost: ");
            System.out.println(totalCost());
            System.out.println("************************************");

        }
    }

    public void cartTest(int id) {
        boolean exist = false;
        int i;
        for (i = 0; i < itemsOrdered.size(); i++) {
            if (id == itemsOrdered.get(i).getID()) {
                exist = true;
                break;
            }
        }
        if (exist == false) {
            System.out.println("There no DVD with that ID");
        } else {
            System.out.printf("Title of the DVD that contain input ID is: %s", itemsOrdered.get(i).getTitle());
        }
    }

    public void cartTest(String title) {
        boolean exist = false;
        int i;
        for (i = 0; i < itemsOrdered.size(); i++) {
            if (title == itemsOrdered.get(i).getTitle()) {
                exist = true;
                break;
            }
        }
        if (exist == false) {
            System.out.println("There no DVD with that title");
        } else {
            System.out.printf("ID of the DVD that contain input title is: %d", itemsOrdered.get(i).getID());
        }
    }

    public void sort() {
        for (int i = 0; i < itemsOrdered.size() - 1; i++) {
            for (int j = 0; j < itemsOrdered.size() - 1; j++) {
                String inx1 = itemsOrdered.get(j).getTitle();
                String inx2 = itemsOrdered.get(j + 1).getTitle();
                if (inx1.charAt(1) > inx2.charAt(1)) {
                    Collections.swap(itemsOrdered, j, j + 1);
                }
            }
        }
    }

    public Cart() {
    }
}