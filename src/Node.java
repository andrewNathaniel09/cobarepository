public class Node {
    String customerName;
    int tableNumber;
    String foodName;
    Node next;
    Node prev;

    public Node(String customerName, int tableNumber, String foodName) {
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.foodName = foodName;
        this.next = null;
        this.prev = null;
    }
}
