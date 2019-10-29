package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();

        // Enqueue items
        queue.add("Sam");
        queue.add("Anna");
        queue.add("Heidi");
        queue.add("Susan");
        queue.add("Charlotte");

        System.out.println(queue);

        String nextInQueue = queue.peek();
        System.out.println("Next up! "+ nextInQueue);
        String recentlyRemoved = queue.remove();
        System.out.println(recentlyRemoved);
        System.out.println(queue);

    }
}
