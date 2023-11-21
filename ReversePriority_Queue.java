import java.util.PriorityQueue;
import java.util.Comparator;

public class ReversePriorityQueueEx {
    public static void main(String[] args) {
        // Create a priority queue with reverse ordering
        PriorityQueue<Integer> reversePriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        // Add elements to the priority queue
        reversePriorityQueue.add(18);
        reversePriorityQueue.add(52);
        reversePriorityQueue.add(20);
        reversePriorityQueue.add(15);

        // Remove and print elements in reverse order
        while (!reversePriorityQueue.isEmpty()) {
            System.out.println(reversePriorityQueue.poll());
        }
    }
}