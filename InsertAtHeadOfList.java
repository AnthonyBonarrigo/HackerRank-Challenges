Node Insert(Node head,int x) {
    Node insert = new Node();
    insert.data = x;
    
    //if head is null, insert node
    if(head == null){
        head = insert;
        head.next = null;
    }
    else{
        insert.next = head;
        head = insert;
    }
    
    return head;
    }
