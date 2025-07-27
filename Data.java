public class DataTypesDemo {
    public static void main(String[] args) {
        // Integer types
        byte b = 100;                // 1 byte
        short s = 10000;             // 2 bytes
        int i = 100000;              // 4 bytes
        long l = 10000000000L;       // 8 bytes

        // Floating-point types
        float f = 5.75f;             // 4 bytes
        double d = 19.99;            // 8 bytes

        // Character type
        char c = 'A';                // 2 bytes (Unicode)

        // Boolean type
        boolean isJavaFun = true;

        // Display the values
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + isJavaFun);
    }
}
