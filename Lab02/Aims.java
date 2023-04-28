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

        System.out.println("Total cost is: " + anOrder.totalCost());
    }
}