import java.util.Deque;
import java.util.ArrayDeque;

public final class DequeJavaStackTest {

    // 1. Private constructor prevents instantiation from within and outside the class
    private DequeJavaStackTest() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    public static Deque<String> test() {
        Deque<String> S = new ArrayDeque<>();  // contents: ()
        String returnItem;

        // TODO: put in Java Deque functions equivalent
        // to the stack example in Participation Activity 6.1.1
        // in the Zybook text
        // Use addLast and removeLast
        S.addLast("A");                        // contents: (A)
        S.addLast("B");                        // contents: (A, B)
        S.addLast("C");                        // contents: (A, B, C)

        returnItem = S.removeLast();           // removes C; contents: (A, B)
        System.out.println("Removed item: " + returnItem);

        S.addLast("D");                        // contents: (A, B, D)

        returnItem = S.removeLast();           // removes D; contents: (A, B)
        System.out.println("Removed item: " + returnItem);

        // Now print the final deque
        // Now convert to String and print
        String dequeString = S.toString();
        System.out.println("\nFinal deque is: " + dequeString);
        return S;
    }

    public static void main (String[] args) {
        test();
    }
}