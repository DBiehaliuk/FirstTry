package linkedList;

public class LinkedListMain {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		//list.reverse();
		
		list.add(2);
		list.add(3);
		list.add(23);
		
		System.out.println(list);
		list.addIdx(2, 4);
		
		
		
		System.out.println(list);
		
		//list.remove(1);
		//System.out.println(list);
		
		list.reverse();
		System.out.println(list);
		list.set(0, 123);
		System.out.println(list);
		//list.remove(0);
		//System.out.println(list);
		
		System.out.println(list.indexOff(4));
		System.out.println(list.get(0));
	}
}
