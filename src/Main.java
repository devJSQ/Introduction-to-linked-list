
public class Main {
     public static void main(String[] args) {

        Node firstNode = new Node(40);
        Node secNode = new Node(78);
        Node thNode = new Node(97);
        firstNode.next = secNode;
        secNode.next = thNode;
        System.out.println(firstNode.next.data);

        Node currentNode = firstNode;
        while (currentNode != null) {
            currentNode.data += 2;
            currentNode = currentNode.next;
        }
        System.out.println(firstNode.data);
        System.out.println(firstNode.next.data);
        System.out.println(firstNode.next.next.data);
        
    }

}

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
} 
