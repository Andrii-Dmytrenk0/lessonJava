package AcquisitionOfPrimitiveDataTypes;

public class Test {
    public static void main(String[] args) {
        float f = 123.2f;

        int a = 123;

        long l = a;
        int x = (int)l;
        System.out.println(x);

        double y = (double) a;
        int b = (int)y;
        System.out.println(y);
        System.out.println(b);

        double xyz = 124.6;
        long zyx = Math.round(xyz);
        System.out.println(zyx);

        byte u = (byte)128;
        System.out.println(u);

    }
}
