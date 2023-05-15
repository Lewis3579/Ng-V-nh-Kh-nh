import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDics[] itemsOrdered = new DigitalVideoDics[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;
    public int j;

    public void addDigitalVideoDics(DigitalVideoDics item) {
        if (qtyOrdered == MAX_NUMBER_ORDERED - 1)
            System.out.println("The cart is full.");
        else {
            itemsOrdered[qtyOrdered] = item;
            this.qtyOrdered++;
        }
    }

    public void addDigitalVideoDics(DigitalVideoDics item1, DigitalVideoDics item2) {
        if (qtyOrdered + 2 >= MAX_NUMBER_ORDERED - 1)
            System.out.println("The cart is full.");
        else {
            itemsOrdered[qtyOrdered] = item1;
            itemsOrdered[qtyOrdered + 1] = item2;
            this.qtyOrdered = this.qtyOrdered + 2;
        }
    }

    public void addDigitalVideoDics(ArrayList<DigitalVideoDics> dvdList) {
        if (qtyOrdered + dvdList.size() > MAX_NUMBER_ORDERED)
            System.out.println("The cart will be full");
        else {
            for (int i = 0; i < dvdList.size(); i++) {
                itemsOrdered[qtyOrdered] = dvdList.get(i);
                this.qtyOrdered++;
            }
        }
    }

    public void removeDigitalVideoDics(DigitalVideoDics item) {
        if (qtyOrdered == 0)
            System.out.println("There is no item!");
        else {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] == item) {
                    itemsOrdered[i] = null;
                    j = i;
                }
            }
            for (int i = j; i < qtyOrdered - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            this.qtyOrdered--;
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void printCart() {
        if (qtyOrdered == 0)
            System.out.println("There is no DVDs!");
        else {
            System.out.println("Number of dvds: " + qtyOrdered);
            System.out.println("****************CART****************");
            System.out.println("Ordered Items");
            for (int i = 0; i < qtyOrdered; i++) {
                System.out.printf("DVD - %s %s %s %d : %f", itemsOrdered[i].getTitle(), itemsOrdered[i].getCategory(),
                        itemsOrdered[i].getDirector(), itemsOrdered[i].getLength(), itemsOrdered[i].getCost());
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
        for (i = 0; i < qtyOrdered; i++) {
            if (id == itemsOrdered[i].getID()) {
                exist = true;
                break;
            }
        }
        if (exist == false) {
            System.out.println("There no DVD with that ID");
        } else {
            System.out.printf("Title of the DVD that contain input ID is: %s", itemsOrdered[i].getTitle());
        }
    }

    public void cartTest(String title) {
        boolean exist = false;
        int i;
        for (i = 0; i < qtyOrdered; i++) {
            if (title == itemsOrdered[i].getTitle()) {
                exist = true;
                break;
            }
        }
        if (exist == false) {
            System.out.println("There no DVD with that title");
        } else {
            System.out.printf("ID of the DVD that contain input title is: %d", itemsOrdered[i].getID());
        }
    }

    public Cart() {
    }
}
