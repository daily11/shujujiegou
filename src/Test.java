import com.swust.堆.HeapInterface;
import com.swust.数组.Array;


public class Test<E extends Comparable<E>> implements HeapInterface<E>{

	private Array<E> data;
	
	@Override
	public int getSize() {
		return data.getSize();
	}

	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}

	@Override
	public boolean contains(E e) {
		return data.contains(e);
	}

	@Override
	public int parent(int index) {
		if(index<0)
			throw new IllegalArgumentException("");
		return (index-1)/2;
	}

	@Override
	public int leftChild(int index) {
		if(index<0)
			throw new IllegalArgumentException("");
		return index*2+1;
	}

	@Override
	public int rightChild(int index) {
		if(index<0)
			throw new IllegalArgumentException("");
		return index*2+2;
	}

	@Override
	public void add(E e) {
		data.addLast(e);
		siftUp(data.getSize()-1);
	}
	
	/**
     * 元素上浮
     * 从最末尾节点开始
     * 变动的子节点与父节点小，则交换位置
     * @param k 子节点索引值
     */
    private void siftUp(int k){
    	if(k<0)
    		return ;
    	
    	int parentIndex = parent(k);
    	E child = data.get(k);
    	E parent = data.get(parentIndex);
    	if(k<parentIndex){
    		data.swap(k,parentIndex);
    	}
    	k=parentIndex;
    	siftUp(k);
    }

	@Override
	public E extractMax() {
		// TODO Auto-generated method stub
		return null;
	}

}
