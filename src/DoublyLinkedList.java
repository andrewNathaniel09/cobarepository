public class DoublyLinkedList {
    Node head;
    
    // Menambahkan pesanan baru
    public void addOrder(String customerName, int tableNumber, String foodName) {
        Node newNode = new Node(customerName, tableNumber, foodName);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println("Pesanan berhasil ditambahkan: " + foodName);
    }

    // Menghapus pesanan berdasarkan nama makanan
    public void removeOrder(String foodName) {
        if (head == null) {
            System.out.println("Daftar pesanan kosong.");
            return;
        }

        Node temp = head;
        while (temp != null && !temp.foodName.equals(foodName)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Pesanan " + foodName + " tidak ditemukan.");
        } else {
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            } else {
                head = temp.next;
            }
            
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
            System.out.println("Pesanan " + foodName + " telah dihapus.");
        }
    }

    // Menampilkan semua pesanan
    public void displayOrders() {
        if (head == null) {
            System.out.println("Tidak ada pesanan saat ini.");
            return;
        }

        Node temp = head;
        System.out.println("Daftar Pesanan:");
        while (temp != null) {
            System.out.println("Nama Pelanggan: " + temp.customerName + ", Nomor Meja: " + temp.tableNumber + ", Makanan: " + temp.foodName);
            temp = temp.next;
        }
    }
}
