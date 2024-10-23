import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList orderList = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Tambah Pesanan");
            System.out.println("2. Hapus Pesanan yang Sudah Selesai");
            System.out.println("3. Tampilkan Daftar Pesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih aksi: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Nama Pelanggan: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Nomor Meja: ");
                    int tableNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Nama Makanan: ");
                    String foodName = scanner.nextLine();
                    orderList.addOrder(customerName, tableNumber, foodName);
                    break;

                case 2:
                    System.out.print("Nama Makanan yang Selesai: ");
                    String finishedFood = scanner.nextLine();
                    orderList.removeOrder(finishedFood);
                    break;

                case 3:
                    orderList.displayOrders();
                    break;

                case 4:
                    System.out.println("Keluar dari sistem.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

