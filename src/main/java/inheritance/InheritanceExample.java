package inheritance;

/**
 *
 */
public class InheritanceExample {
    public static void main(String[] arg) {
        Car obj = new Car();

        obj.MyColor();

        obj = new BMW();
        obj.MyColor();

        obj = new Honda();
        obj.MyColor();

    }
}
