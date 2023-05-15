import java.util.ArrayList;

public class Aims {

    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDics dvd1 = new DigitalVideoDics("The lion king", "Animation", "Roger", 87, 19.95f);
        anOrder.addDigitalVideoDics(dvd1);
        DigitalVideoDics dvd2 = new DigitalVideoDics("The lion king", "Animation", "Roger", 87, 24.95f);
        anOrder.addDigitalVideoDics(dvd2);
        DigitalVideoDics dvd3 = new DigitalVideoDics("The lion king", "Animation", "Roger", 87, 18.99f);
        anOrder.addDigitalVideoDics(dvd3);
        anOrder.removeDigitalVideoDics(dvd1);
        ArrayList<DigitalVideoDics> dvdList = new ArrayList<DigitalVideoDics>();
        DigitalVideoDics dvd4 = new DigitalVideoDics("The lion king", "Animation", "Sir", 87, 19.95f);
        DigitalVideoDics dvd5 = new DigitalVideoDics("The lion king", "Movie", "Roger", 87, 19.95f);
        DigitalVideoDics dvd6 = new DigitalVideoDics("The lion king", "Movie", "Roger", 87, 20.f);
        Cart anotherCart = new Cart();
        dvdList.add(dvd4);
        dvdList.add(dvd5);
        dvdList.add(dvd6);
        anotherCart.addDigitalVideoDics(dvdList);
        anOrder.printCart();
        System.out.println("Total numbers of dvd is: " + DigitalVideoDics.nb());
        anOrder.cartTest("The lion");
    }
}