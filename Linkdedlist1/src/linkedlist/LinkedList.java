package linkedlist;

public class LinkedList {
         Node head;             //creating head variable of node type
         
         
         public void insert(int data) {
        	Node node = new Node();  //creating node(as node will have data and reference)
        	node.data=data;          //assigning data provided by user to the data variable
        	node.next=null;          //assigning null to the reference as the starting the reference will be null
        	if(head==null) {         //for the first node there only be one node(head) which will be null
        		head=node;           //node value will be given to null
        	}
        	else {
        		Node n=head;        //create a temporary node n and assign head to it.
        		while(n.next!=null) { //check the reference of next node if its not null
        			n=n.next;          //provide next node reference to the variable n
        		}
        		n.next=node;          //provide new node reference to the last traversed node
        	}
         }
         
         
         public void insertAtStart(int data) {
        	 Node node = new Node();  //creating node(as node will have data and reference)
         	 node.data=data;          //assigning data provided by user to the data variable
         	 node.next=null;          //assigning null to the reference as the starting the reference will be null 
             node.next=head;          //store the previous head as the reference of the new node
             head=node;               //make the new node head as we are adding at start
         }
         
         
         public void insertAt(int index, int data) {
        	Node node = new Node();  //creating node(as node will have data and reference)
         	node.data=data;          //assigning data provided by user to the data variable
         	node.next=null;          //assigning null to the reference as the starting the reference will be null 
            
         	if(index==0) {           //To add element at the start
         		insertAtStart(data); //call insertAtStart()
         	}
         	else {
         	Node n = head;           //traversing starts with head
         	for(int i=0;i<index-1;i++) {   // traverse from 0 index to index-1, as change will happen at index-1;
         		n=n.next;                  //traverse using n.next;
         	}
            node.next=n.next;  //assign new node the reference of previous node as the previous node have the reference of next node of the new node
            n.next=node;       //assign previous node the reference of new node
         	}
         }
         
         
        public void deleteAt(int index) {
        	if(index==0) {     //if we delete from the start of the list
        		head=head.next;  //to delete from the start just change the head position to the next node
        	}
        	else {
        		Node n=head;
        		Node n1=null;    //create a new empty node to store the value of the node to be deleted
        		for(int i=0;i<index-1;i++) {
        			n=n.next;
        		}
        		n1=n.next;      //store the reference in n1 of the next node which will be deleted
        		n.next=n1.next; //store the reference of the node to be deleted to the current node
        		n1=null;        //the removed node is assigned as null so that it can be garbage collected
        		}
        }
         
        
       public void show() {          //To display the data
    	   Node n=head;              //assign head to a variable n   
    	   while(n.next!=null) {     //traverse from head to last node and come out if null reference found
    		   System.out.println(n.data);//print corresponding data or value
    		   n=n.next;             //change the value of n to next reference 
    	   }
    	   System.out.println(n.data); //To print the last data which reference is null
       }
}
