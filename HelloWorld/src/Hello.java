public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // int width of 32
        int minValue = -2_147_483_647;
        int maxValue = 2_147_483_647;

        // byte width of 8
        byte myByte = 127;

        // short width of 16
        short shortValue = 32767;

        // long has a width of 64
        long longValue = 10000000L;

        // Type Casting
        // Java will convert 2 to an int
        // Unless we use type casting. (byte)
        byte divided = (byte)(myByte/2);

        // float width of 32 (4 bytes)
        float floatValue = 5.6f;
        // append f to end or type cast with (float)

        // double width of 64 (8 bytes)
        double doubleValue = 5d;
        
    }

}
