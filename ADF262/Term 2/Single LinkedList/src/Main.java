

public class Main {
    public static void main(String[] args) {
//Pass Elements(data) of the nodes are 3, 2, 6 ,9
        Node firstNode = new Node(3);
        Node secNode = new Node(2);
        Node thirdNode = new Node(6);
        Node forthNode = new Node(9);

        firstNode.next = secNode;
        secNode.next = thirdNode;
        thirdNode.next = forthNode;

        Node currentNode = firstNode;

        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}