package com.swust.队列;

import com.swust.数组.Array;

public class ArrayQueue<E> implements Queue<E>{
	
    private Array<E> array;

    public ArrayQueue(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayQueue(){
        array = new Array<>();
    }

	@Override
	public int getSize() {
		return array.getSize();
	}

	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

	@Override
	public void offer(E e) {
		array.addLast(e);
	}

	@Override
	public E poll() {
		return array.removeFirst();
	}

	@Override
	public E peek() {
		return array.getFirst();
	}
	
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }


}
