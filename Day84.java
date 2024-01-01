

package com.mycompany.day84;

import java.util.LinkedList;
import java.util.Queue;

public class Day84 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        System.out.println("Size: " + queue.size());
        System.out.println("IsEmpty: " + queue.isEmpty());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Poll: " + queue.poll());
        System.out.println("IsEmpty: " + queue.isEmpty());
    }
}
