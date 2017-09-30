package map;


/**
 * map的底层实现
 */
public class MyMap<Key,Value> {
	private Node<?, ?> first;
	
	public void put(Key key,Value value) {			
		if(first == null) {
			first = new Node<Key, Value>(key,value);
		}
		else {
			for(Node x = first; x != null; x = x.next) {
				if(key.equals(x.key)) {
					x.value = value;
					return;
				}
			}
			first.next = new Node<Key, Value>(key,value);
			first = first.next;
		}
	}

	public Value get(Key key) {
		Value v = null;
		for(Node x = first; x != null; x = x.next) {
			if(key.equals(x.key)) {
				v = (Value) x.value;
			}
			else {
				v = null;
			}
		}
		return v;
	}
}



class Testl {
	public static void main(String[] args) {
		MyMap mm = new MyMap();
		mm.put("李明", 123);
		mm.put("小红", 456);
		mm.put("李明", 456);
		System.out.println(mm.get("李明"));
	}
}