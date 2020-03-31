public class Links extends Node {
    private Node head;
    private Node tail;
    private int size;
    public Links() {
      head = null;
      tail = null;
      size = 0;
    } //constructor
    public void addLast(int data){
        Node temp = new Node(data);
        if (head == null){
            /* linked list is empty */
            temp.setNext(null);
            temp.setPrev(null);
            head = temp;
            tail = temp;
        }
        else{
            /* linked list is not empty */
            Node current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(temp);
            temp.setNext(null);
            temp.setPrev(current);
          	tail = temp;
        }
        size++;
        
    }

    public void addFront(int data){
        /* add your logic here! */
        Node temp = new Node(data);
        if (head == null){
            /* linked list is empty */
            temp.setNext(null);
            temp.setPrev(null);
            head = temp;
            tail = temp;
        }
        else{
            /* linked list is not empty */
            Node current = tail;
            while(current.getPrev() != null){
                current = current.getPrev();
            }
            current.setPrev(temp);
            temp.setPrev(null);
            temp.setNext(current);
            head = temp;
        }
        size++;
    }



    public void displayNodesForward() {
        if(size < 1) {
            //index not valid
            System.out.println("list is empty");
        }
        else{
            Node current = head;
            while(current != null){
                System.out.print(current.getData() + "->");
                current = current.getNext();
            }    
            System.out.print("\n");
        }
    }


    public void displayNodesReverse() {
        /* add  your logic here! */
        if( size < 1) { 
            System.out.println("List is empty!");
        }
        else{
            Node current = tail;
            while(current != null){
                System.out.print(current.getData() + "->");
                current = current.getPrev();
            }
            System.out.print("\n");
        }
    }

    public boolean deleteNode(int value){
       /* add logic here */
       if (head.getData() == value && tail.getData() == value){
           head = null;
           tail = null;
           size --;
           return true;
       }
       else{
            if (head.getData() == value){
                head = head.getNext();
                head.getPrev().setNext(null);
                head.setPrev(null);
                size --;
                return true;
            }
            else if (tail.getData() == value){ 
                tail = tail.getPrev();
                tail.getNext().setPrev(null);
                tail.setNext(null);
                size --;
                return true;
            }
            else{
                Node current = head;
                while (current != null){
                    if (current.getData() == value){
                        current.getPrev().setNext(current.getNext());
                        current.getNext().setPrev(current.getPrev());
                        size --;
                        return true;
                    }
                    current = current.getNext();

                }
       return false;

    }
}

}
    public int getSize(){
        return this.size;
    }
    
    
}