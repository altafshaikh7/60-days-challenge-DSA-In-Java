public class Ascii_value {

    public static void main(String[] args) {
        // type casting - ek data type ko dusre data type me convert karna
        // har acter ki ASCII value hoti hai , integral value hoti hai , usko hum int me
        // store kar sakte hai

        char ch = 'z';
        int x = ch; // implicit type casting
        System.out.println("Character: " + x);

        char Altaf = '$';
        int y = (int) Altaf; // explicit type casting
        System.out.println("Character: " + y);

        char ch1 = '3';
        System.out.println("Character: " + (int) ch1);

        char ch2 = 'b';
        System.out.println(ch2 + 0); // char + int = int

        int v = 52;
        char ch3 = (char) v;
        System.out.println(ch3);
    }
}
