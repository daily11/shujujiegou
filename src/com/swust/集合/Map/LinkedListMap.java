package com.swust.集合.Map;

public class LinkedListMap<K, V> implements MapInterface<K, V>{

	private class Node{
        public K key;
        public V value;
        public Node next;

        public Node(K key, V value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node(K key, V value){
            this(key, value, null);
        }

        public Node(){
            this(null, null, null);
        }

        @Override
        public String toString(){
            return key.toString() + " : " + value.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedListMap(){
        dummyHead = new Node();
        size = 0;
    }
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

    private Node getNode(K key){
        Node cur = dummyHead.next;
        while(cur != null){
            if(cur.key.equals(key))
                return cur;
            cur = cur.next;
        }
        return null;
    }
	
	@Override
	public boolean contains(K key) {
		return getNode(key) != null;
	}

	/**
	 * 1 因为是Map，所以不能遍历到列表末尾直接添加元素，应先判断有没有对应的key值
	 * 2 列表有key，则更新对应key的value值；
	 * 3列表没有key，则在对头新增一个节点
	 */
	@Override
	public void put(K key, V value) {
        Node node = getNode(key);
        if(node == null){
            dummyHead.next = new Node(key, value, dummyHead.next);
            size ++;
        }
        else
            node.value = value;
	}

	@Override
	public V remove(K key) {
		Node prev = dummyHead;
        while(prev.next != null){
            if(prev.next.key.equals(key))
                break;
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = prev.next.next;
            size --;
            return delNode.value;
        }

        return null;
	}

	@Override
	public V get(K key) {
		Node node = getNode(key);
        return node == null ? null : node.value;
	}

}
