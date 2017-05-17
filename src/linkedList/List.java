package linkedList;

public interface List extends Collection {
	
	void add(int element);
	void addIdx(int idx, int element);
	int set(int idx, int element);
	int get(int idx);
	int remove(int idx);
	int indexOff(int element);
	

}
