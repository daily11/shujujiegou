package com.swust.队列;

public class QueueTest {

    public static void main(String[] args) {

        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for(int i = 0 ; i < 10 ; i ++){
            queue.offer(i);
            System.out.println(queue);
            if(i % 3 == 2){
                queue.poll();
                System.out.println(queue);
            }
        }
    }
}
