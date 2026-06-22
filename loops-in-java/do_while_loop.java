public class do_while_loop {
    public static void main(String[] args) {
        // int i = 0;
        // do {
        // System.out.print(i + " ");
        // i++;
        // } while (i < 11);

        int i = 12;
        while (i < 11) {
            System.out.print("Altaf Shaikh\n"); // This will not execute as the condition is false at the beginning
            i++;
        } // while loop me koi terminal condition nahi hai

        do {
            System.out.print("Altaf Shaikh\n"); // yeh print hoga kyuki do-while loop me pehle body execute hoti hai fir
                                                // condition check hoti hai
            i++;
        } 
    }
}
