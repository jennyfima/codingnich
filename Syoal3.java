package syoal3;

import java.util.Scanner;

public class Syoal3 {

    public static void main(String[] args) {
        int barang, jumlahItem, cashback;
        Scanner input = new Scanner(System.in);

        System.out.println("Beli 3, Gratis 1 GAISSS");
        System.out.println("======================SELAMAT DATANG DI TOKO JENYY===============");
        System.out.println(
                "Masukan jumlah barang agar anda mendapatkan BONUS ");

        System.out.println("====================================================");
        System.out.print("Jumlah Barang : ");
        barang = input.nextInt();

        if (barang % 7 == 0 && barang % 3 == 0) {
            cashback = 5500 * (barang / 7);
            jumlahItem = barang + (barang / 3);
        } else {
            cashback = 5500 * (int) (barang / 7);
            jumlahItem = barang + (barang / 3);

            System.out.println("Banyak barang pembelian anda : " + barang);
            System.out.println("Cashback : " + (jumlahItem - barang));
            System.out.println("Item dan mendapat CASHBACK sebesar:" + cashback);

            System.out.println("Total belanjaan Anda sebanyak : " + jumlahItem + " Item");

        }
    }
}
