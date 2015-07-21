Node InsertNth(Node head, int data, int position) {
        Node insert = new Node();
        insert.data = data;
    
        //List is empty, insert node at the head
        if(head == null){
            head = insert;
            return head;
        }
        //Insert new node at head
        if(position == 0){
            insert.next = head;
            head = insert;
            return head;
        }
        
        else{
            Node currentNode = head;
            while((position - 1) > 0){
                if(currentNode.next != null){
                    currentNode = currentNode.next;
                    position--;
                }
                else break;
            }
            insert.next = currentNode.next;
            currentNode.next = insert;
            return head;
        }
}
