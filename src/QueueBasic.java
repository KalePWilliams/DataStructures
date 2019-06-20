import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();//using linkedlist implemenation of a cue

        //Enqueue items
        queue.add("Sam");
        queue.add("Anna");
        queue.add("Heidi");
        queue.add("Susan");
        queue.add("Charlotte");

        System.out.println(queue);

        //to see what is next in the queue
        String nextInQueue = queue.peek();
        System.out.println("Next up! "+ nextInQueue);

        //to remove from the queue(all)
        /*for (int i = 0; i < queue.size(); i++){
        queue.remove();
        System.out.println(queue);
                                    }*/

        //remove something from the queue and print it
        String recentlyRemoved = queue.remove();
        System.out.println(recentlyRemoved);
        System.out.println(queue);

    }

}


