package casting;

public class casting {
    public static void casting(){
        double a = 14354542.231113444233233;
        float b = (float) a;
        long c = (long) b;
        int d = (int) c;
        short e  = (short) d;
        byte f = (byte) e;

        System.out.println("Double -"+a);
        System.out.println("Float -"+b);
        System.out.println("Long -"+c);
        System.out.println("Int -"+d);
        System.out.println("Short -"+e);
        System.out.println("Byte -"+f);
    }
}
