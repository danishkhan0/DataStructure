package linkedlist;

public class MainList {

	public static void main(String[] args) {
    LinkedList l=new LinkedList();
    l.insert(5);
    l.insert(7);
    l.insert(9);
    l.insertAtStart(2);
    l.insertAt(2, 11);
    l.insertAt(0, 1);
    l.deleteAt(0);
    l.deleteAt(2);
    l.show();
	
	}

}
