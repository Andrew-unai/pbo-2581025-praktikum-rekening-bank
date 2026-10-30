import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rekening rekening = new Rekening("001", "Ani", 100000);

        rekening.saldo = 1000000;
        //java: saldo has private access in Rekening

        System.out.println("============ BANK MINI ============");
        System.out.println("Rekening 001 a.n. Ani");

        int pilihan;
        do {
            System.out.print("Menu (1 setor, 2 tarik, 3 info, 0 keluar): ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Jumlah: ");
                    System.out.println(rekening.setor(in.nextInt()) ? "  Berhasil" : "  Ditolak");
                    break;
                case 2:
                    System.out.print("Jumlah: ");
                    System.out.println(rekening.tarik(in.nextInt()) ? "  Berhasil" : "  Ditolak");
                    break;
                case 3:
                    rekening.cetakInfo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Menu tidak dikenal");
            }
        } while (pilihan != 0);

        System.out.println();
        System.out.println("=========== SALDO AKHIR ===========");
        rekening.cetakInfo();
    }
}
