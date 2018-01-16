/*
Queue serves the requests based on FIFO(First in First out). Now the question is: What if we want to serve the request based on the priority rather than FIFO? In a practical scenario this type of solution would be preferred as it is more dynamic and efficient in nature. This can be done with the help of PriorityQueue, which serves the request based on the priority that we set using Comparator.
Java PriorityQueue Example
In this example, I am adding few Strings to the PriorityQueue, while creating PriorityQueue I have passed the Comparator(named as MyComparator) to the PriorityQueue constructor.
In the MyComparator java class, I have sorted the Strings based on their length, which means the priority that I have set in PriorityQueue is String length. That way I ensured that the smallest string would be served first rather than the string that I have added first.
*/

import java.util.PriorityQueue;
public class PriorityQueueExample
{
    public static void main(String[] args)
    {
        
        PriorityQueue<String> queue = 
            new PriorityQueue<String>(15, new MyComparator());
        queue.add("Tyrion Lannister");
        queue.add("Daenerys Targaryen");
        queue.add("Arya Stark");
        queue.add("Petyr 'Littlefinger' Baelish");
      
        /*
         * What I am doing here is removing the highest
         * priority element from Queue and displaying it.
         * The priority I have set is based on the string
         * length. The logic for it is written in Comparator
         */
        while (queue.size() != 0)
        {
            System.out.println(queue.poll());
        
        }
    }
}
