

public class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static void traverseAndprint(Node head) {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
//Pass Elements(data) of the nodes are 8, 2, 6 ,9
        Node firstNode = new Node(8);
        Node secNode = new Node(2);
        Node thirdNode = new Node(6);
        Node forthNode = new Node(9);

        firstNode.next = secNode;
        secNode.next = thirdNode;
        thirdNode.next = forthNode;

        Node.traverseAndprint(firstNode);


    }
}