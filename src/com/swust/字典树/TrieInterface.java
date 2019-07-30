package com.swust.字典树;

public interface TrieInterface {
	
//    private class Node{
//
//        public boolean isWord;
//        public TreeMap<Character, Node> next;
//
//        public Node(boolean isWord){
//            this.isWord = isWord;
//            next = new TreeMap<>();
//        }
//
//        public Node(){
//            this(false);
//        }
//    }
	
	//获得Trie中存储的单词数量
	int getSize();
	
	//判断Trie是否为空
	boolean isEmpty();
	
	/*
	 * 添加字符串
	 * 1 遍历字符串，查询需要填入的字符是否存在于节点中，存在就继续遍历Next对应的TreeMap，不存在就直接填入TreeMap中
	 * 2 最后判断cur.isWord，为真的话说明该节点之前已经存储过数据了，有重复值，则无需操作，反之设置为true，size自增
	 */
	void add(String word);
	
	/**
	 * 查询单词word是否在Trie中
	 * 
	 * 这个word是从根节点的Next开始的，并且该条路径应该已word为结尾，word不应该是该条路径上的中间一段字符串！
	 */
	boolean contains(String word);
	
	/**
	 *  查询是否在Trie中有单词以prefix为前缀
	 *  
	 *  这个word是从根节点的Next开始的，
	 */
	boolean isPrefix(String prefix);
}
