import Media.DigitalVideoDics;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDics jungleDVD = new DigitalVideoDics("Jungle");
        DigitalVideoDics cinderellaDVD = new DigitalVideoDics("Cinderella");

        System.out.println(String.format("jungle dvd title: %s", jungleDVD.getTitle()));
        System.out.println(String.format("cinderella dvd title: %s", cinderellaDVD.getTitle()));
        swap(jungleDVD, cinderellaDVD);
        System.out.println(String.format("jungle dvd title: %s", jungleDVD.getTitle()));
        System.out.println(String.format("cinderella dvd title: %s", cinderellaDVD.getTitle()));
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println(String.format("jungle dvd title: %s", jungleDVD.getTitle()));
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDics dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDics(oldTitle);
    }

    public static void swap(DigitalVideoDics o1, DigitalVideoDics o2) {
        String tmp = o1.getTitle();
        o1.setTitle(o2.getTitle());
        o2.setTitle(tmp);
    }
}