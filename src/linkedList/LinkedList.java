package linkedList;


public class LinkedList implements List{

	private Node head;
	private Node tail;
	private Integer size;

	private class Node {
		private Integer element;
		private Node next;

		public Node(Integer element) {
			this.element = element;
		}

		public void setElement(Integer element) {
			this.element = element;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Integer getElement() {
			return element;
		}

		public Node getNext() {
			return next;
		}
	}
	
	public LinkedList(){
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(int element) {
		if (!isEmpty()) {
			Node nd = head;
			while (nd != null) {
				if (nd.getElement() == element) {
					return true;
				}
				nd = nd.getNext();
			}
		}
		return false;
	}

	@Override
	public void add(int element) {
		
		Node nd = new Node(element);
		if (head == null & tail == null) {
			head = tail = nd;
		} else {
			tail.setNext(nd);
			tail = nd;
		}
		size++;
	}

	@Override
	public void addIdx(int idx, int element) {
		
		checkIndex(idx);
		Node nd = new Node(element);
		Node position = head;
		Integer count = 0;
		
		if (idx != 0){
			while (position != null) {
				if (count == idx - 1){
					break;
				}
				position = position.getNext();
				count++;
			}
			nd.setNext(position.getNext());
			position.setNext(nd);
		} else {
			nd.setNext(position);
			head = nd;
		}
		size++;
	}

	private void checkIndex(Integer idx) {
		if (size < idx || idx < 0) {
			throw new IndexOutOfBoundsException();
		}
	}
	@Override
	public int set(int idx, int element) {
		checkIndex(idx);
		int oldValue = 0;
		Node position = head;
		int count = 0;
		
		while (count != idx) {
			position = position.getNext();
			count++;
		}
		oldValue = position.getElement();
		position.setElement(element);
		
		return oldValue;
	}

	@Override
	public int get(int idx) {
		checkIndex(idx);
		Node position = head;
		for (int i = 0; i != idx; i++) {
			position = position.getNext();
		}
		return position.getElement();
	}

	@Override
	public int remove(int idx) {
		checkIndex(idx);
		Node position = head;
		
		for (int i = 0; i != idx - 1; i++) {
			position = position.getNext();
		}
		
		Node deleteNode = position.getNext();
		position.setNext(position.getNext().getNext());
		
		int removeValue = deleteNode.getElement();
		deleteNode.setNext(null);
		return removeValue;
	}

	@Override
	public int indexOff(int element) {
		if (!isEmpty()) {
            Node position = head;
            int count = 0;
            while (position != null) {
                if (position.getElement() == element) {
                    return count;
                }
                position = position.getNext();
                count++;
            }
        }

        return -1;
	}

	
	@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        if (head != null) {
            Node nd = head;
            while (nd != null) {
                if (nd.next != null) {
                    builder.append(nd.getElement() + ", ");
                } else {
                    builder.append(nd.getElement());
                }
                nd = nd.getNext();
            }
        }
        builder.append("]");
        return builder.toString();
    }

	@Override
	public void reverse() {
		
		Node reversed = null;
		Node position = head;
		
		if(!isEmpty()) {
			while (position != null) {
				Node nd = position.next;
				position.next = reversed;
				reversed = position;
				position = nd;
			}
			head = reversed;
		} System.out.println("Empty");
		
	}
}
