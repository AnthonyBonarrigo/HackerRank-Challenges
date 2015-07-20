Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 

  Node newNode = new Node();
  newNode.data = data;
    
  //Insert new node at head if head is null
  if(head == null){
      head = newNode;
      return head;
  }
  else{
      boolean added = false;
      Node currentNode = head;
      while(!added){
          if(currentNode.next == null){
              currentNode.next = newNode;
              added = true;
          }
          else{
              currentNode = currentNode.next;
          }
       
      }
  }
    return head;
}