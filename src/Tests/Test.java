package Tests;

public class Test {

    public static boolean returnTrue() {
        return true;
    }

    public static boolean returnFalse() {
        return false;
    }

    public static void main(String[] args) {
        Boolean myBool = returnTrue();
        Boolean myBool2 = returnFalse();
        System.out.println(myBool);
        System.out.println(myBool2);
    }
}
