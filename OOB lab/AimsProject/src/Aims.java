import java.util.ArrayList;
import Media.DigitalVideoDics;

public class Aims {

    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDics dvd1 = new DigitalVideoDics("The lion king", "Animation", "Roger", 87, 19.95f);
        anOrder.addMedia(dvd1);
        DigitalVideoDics dvd2 = new DigitalVideoDics("The lion king", "Animation", "Roger", 87, 24.95f);
        anOrder.addMedia(dvd2);
        DigitalVideoDics dvd3 = new DigitalVideoDics("The lion king", "Animation", "Roger", 87, 18.99f);
        anOrder.addMedia(dvd3);
        anOrder.addMedia(dvd1);
        ArrayList<DigitalVideoDics> dvdList = new ArrayList<DigitalVideoDics>();
        DigitalVideoDics dvd4 = new DigitalVideoDics("The lion king", "Animation", "Sir", 87, 19.95f);
        DigitalVideoDics dvd5 = new DigitalVideoDics("The lion king", "Movie", "Roger", 87, 19.95f);
        DigitalVideoDics dvd6 = new DigitalVideoDics("The lion king", "Movie", "Roger", 87, 20.f);
        Cart anotherCart = new Cart();
        dvdList.add(dvd4);
        dvdList.add(dvd5);
        dvdList.add(dvd6);
        // anotherCart.addMedia(dvdList);
        anOrder.printCart();
        System.out.println("Total numbers of dvd is: " + DigitalVideoDics.nb());
        anOrder.cartTest("The lion");
    }
}