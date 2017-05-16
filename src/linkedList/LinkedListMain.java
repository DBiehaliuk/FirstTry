package linkedList;

public class LinkedListMain {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(2);
		list.add(3);
		list.add(23);
		
		System.out.println(list);
		list.addIdx(2, 4);
		
		
		
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
	}
}
