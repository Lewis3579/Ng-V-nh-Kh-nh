public class Store {
    public static final int MAX_NUMBER_ORDERED = 1000;
    private static DigitalVideoDics[] itemInStore = new DigitalVideoDics[MAX_NUMBER_ORDERED];
    private static int qtyOrdered = 0;
    public static int j;

    public static void addDigitalVideoDics(DigitalVideoDics item) {
        if (qtyOrdered == MAX_NUMBER_ORDERED - 1)
            System.out.println("The cart is full.");
        else {
            itemInStore[qtyOrdered] = item;
            qtyOrdered++;
        }
    }

    public static void removeDigitalVideoDics(DigitalVideoDics item) {
        if (qtyOrdered == 0)
            System.out.println("There is no item!");
        else {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemInStore[i] == item) {
                    itemInStore[i] = null;
                    j = i;
                }
            }
            for (int i = j; i < qtyOrdered - 1; i++) {
                itemInStore[i] = itemInStore[i + 1];
            }
            qtyOrdered--;
        }
    }

    public Store() {

    }
}
