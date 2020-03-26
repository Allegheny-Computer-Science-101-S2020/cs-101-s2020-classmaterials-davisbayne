public class Node {
        private int data;
        private Node next;
        private Node prev;
        protected Node(){} // default constructor
        protected Node(int data) {
            this.data = data;
            this.next = null;
        }
        protected int getData(){
            return this.data;
        }
        protected Node getPrev(){
            return this.prev;
        }
        protected Node getNext(){
            return this.next;
        }
        protected void setData(int data){
            this.data = data;
        }
        protected void setPrev(Node prev){
            this.prev = prev;
        }
        protected void setNext(Node next){
            this.next = next;
        }

}