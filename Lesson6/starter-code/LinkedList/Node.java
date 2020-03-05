public class Node {
        private int data;
        private Node next;
        protected Node(){} // default constructor
        protected Node(int data) {
            this.data = data;
            this.next = null;
        }
        protected int getData(){
            return this.data;
        }
        protected Node getNext(){
            return this.next;
        }
        protected void setData(int data){
            this.data = data;
        }
        protected void setNext(Node next){
            this.next = next;
        }

}