package dataStructure;

import java.util.LinkedList;

class HashTable {
	class Node {
		String key;
		String value;
		
		public Node (String key, String value) {
			this.key = key;
			this.value = value;
		}
		
		String value() {
			return value;
		}
		
		void value(String value ) {
			this.value = value;
		}
	}
	
	LinkedList<Node>[] data;
	
	HashTable(int size) {
		this.data = new LinkedList[size];
	}
	
	int getHashCode(String key) {
		int hashcode = 0;
		for(char c : key.toCharArray()) {
			hashcode += c;
		}
		return hashcode;
	}
	
	int convertToIndex(int hashcode) {
		return hashcode % data.length;
	}
	
	Node searchKey(LinkedList<Node> list, String key) {
		if (list == null) return null;
		for (Node node : list) {
			if (node.key.equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	void put(String key, String value) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		System.out.println(key + ", hashcode(" + hashcode + "), index(" + index + ")");
		LinkedList<Node> list = data[index];
		if (list == null) list = new LinkedList<Node>();
		Node node = searchKey(list, key);
		if( node == null) {
			list.addLast(new Node(key, value));
			data[index] = list;
		}else {
			node.value(value);
		}
	}
	
	String get(String key) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];
		Node node = searchKey(list, key);
		return node == null ? "Not Found" : node.value();
	}
} 

public class HashTableDemo {

	public static void main(String[] args) {
		HashTable h = new HashTable(3);
		h.put("yoon", "hyeonjun");
		h.put("stamcos", "jack");
		h.put("sylvaster", "isaiah");
		h.put("moudrak", "vitalii");
		h.put("stamcos", "john");
		System.out.println(h.get("yoon"));
		System.out.println(h.get("stamcos"));
		System.out.println(h.get("sylvaster"));
		System.out.println(h.get("moudrak"));
		System.out.println(h.get("paul"));
		
	}

}
