import java.util.Deque;
import java.util.LinkedList;

public final class DequeJavaQueueTest {

    // 1. Private constructor prevents instantiation from within and outside the class
    private DequeJavaQueueTest() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    public static Deque<String> test() {
        Deque<String> S = new LinkedList<>();  // contents: ()
        String returnItem;

        // TODO: put in Java Deque functions equivalent
        // to the queue example in Participation Activity 6.25
        // in the Zybook text
        // Use addLast and removeFirst
        S.addLast("A");                        // contents: (A)
        S.addLast("B");                        // contents: (A, B)
        S.addLast("C");                        // contents: (A, B, C)

        returnItem = S.removeFirst();          // removes A; contents: (B, C)
        System.out.println("Removed item: " + returnItem);

        S.addLast("D");                        // contents: (B, C, D)

        returnItem = S.removeFirst();          // removes B; contents: (C, D)
        System.out.println("Removed item: " + returnItem);

        // Now print the final deque
        // Now convert to String and print
        String dequeString = S.toString();
        System.out.println("\nFinal queue is: " + dequeString);
        return S;
    }

    public static void main (String[] args) {
        test();
    }
}