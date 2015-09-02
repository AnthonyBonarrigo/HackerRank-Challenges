/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

//Prints list in reverse
void ReversePrint(Node head) {
  if (head == null){}
    else{
        ReversePrint(head.next);
        System.out.println(head.data);
    }

}
