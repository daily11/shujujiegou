package com.swust.数组;

public interface ArrayInterface<E> {
	
	// 获取数组的容量
    public int getCapacity();
    
    // 获取数组中的元素个数
    public int getSize();
    
    // 返回数组是否为空
    public boolean isEmpty();
    
    // 在index索引的位置插入一个新元素e
    public void add(int index, E e);
    
    // 向所有元素后添加一个新元素
    public void addLast(E e);
    
    // 在所有元素前添加一个新元素
    public void addFirst(E e);
    
    // 修改index索引位置的元素为e
    public void set(int index, E e);

    // 查找数组中是否有元素e
    public boolean contains(E e);
    
    // 获取index索引位置的元素
    public E get(int index);
    
    public E getFirst();
    
    public E getLast();
    
    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e);
    
    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index);
    
    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst();
    
    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast();
    
    // 从数组中删除元素e
    public void removeElement(E e);
    
    public void swap(int i, int j);
    
    @Override
    public String toString();

}
