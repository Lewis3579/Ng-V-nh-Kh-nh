import java.util.ArrayList;
import Media.Book;
import Media.DigitalVideoDics;
import java.util.Scanner;

public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void main(String[] args) {
        Scanner keybroad = new Scanner(System.in);
        /*
         * Cart anOrder = new Cart();
         * DigitalVideoDics dvd1 = new DigitalVideoDics("The lion king", "Animation",
         * "Roger", 87, 19.95f);
         * anOrder.addMedia(dvd1);
         * 
         * DigitalVideoDics dvd2 = new DigitalVideoDics("The lion king", "Animation",
         * "Roger", 87, 24.95f);
         * anOrder.addMedia(dvd2);
         * DigitalVideoDics dvd3 = new DigitalVideoDics("The lion king", "Animation",
         * "Roger", 87, 18.99f);
         * anOrder.addMedia(dvd3);
         * anOrder.addMedia(dvd1);
         * // anotherCart.addMedia(dvdList);
         * anOrder.printCart();
         * System.out.println("Total numbers of dvd is: " + DigitalVideoDics.nb());
         * anOrder.cartTest("The lion");
         */
        Cart cart = new Cart();
        int inMenu, inStore, inMedia;
        do {
            showMenu();
            inMenu = keybroad.nextInt();
            switch (inMenu) {
                case 1:
                    do {
                        storeMenu();
                        keybroad.nextLine();
                        inStore = keybroad.nextInt();
                        switch (inStore) {
                            case 1:
                                do {
                                    mediaDetailsMenu();
                                    String fititle = keybroad.nextLine();
                                    inMedia = keybroad.nextInt();
                                    keybroad.nextLine();
                                    switch (inMedia) {
                                        case 1:
                                            if (Store.cartTest(fititle) == null) {
                                                System.out.println("THERE IS NO ITEM WITH NAME LIKE THAT!");
                                            } else
                                                cart.addMedia(Store.cartTest(fititle));
                                            break;
                                        case 2:
                                            DigitalVideoDics disc = (DigitalVideoDics) Store.cartTest(fititle);
                                            disc.play();
                                            break;
                                        case 3:
                                            break;
                                    }
                                } while (inMedia != 0);
                            case 2:
                                cart.addMedia(null);
                                break;
                            case 3:
                                break;
                        }
                    } while (inStore != 0);
                case 2:
                    Store.addMedia(null);
                    break;
                case 3:
                    cart.printCart();
                case 4:
                    break;
            }
        } while (inMenu != 0);
    }
}
