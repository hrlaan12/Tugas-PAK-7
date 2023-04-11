import java.util.*;

class Main1 {
    private ArrayList<DataZakatFitri> dataWarga;

    public static void main(String[] args) throws Exception {
        Main1 Screen = new Main1();
        Screen.inputData();
        Screen.cetakData();
    }

    public void inputData() {
        dataWarga = new ArrayList<DataZakatFitri>();
        String jawaban;
        int number = 1;
        do {
            System.out.println("======= Data Bayar Zakat =====");
            System.out.println("Data Warga ke " + number);
            System.out.print("Nama : ");
            String nama = System.console().readLine();
            System.out.print("Alamat : ");
            String alamat = System.console().readLine();
            System.out.println("Metode Pembayaran : ");
            System.out.println("1. Beras (2.5 Kg)");
            System.out.println("2. Uang (Rp 35.000)");
            System.out.print("Pilih metode pembayaran (1/2): ");
            int pilihan = Integer.parseInt(System.console().readLine());

            String metodePembayaran;
            switch (pilihan) {
                case 1:
                    metodePembayaran = "Beras";
                    break;
                case 2:
                    metodePembayaran = "Uang";
                    break;
                default:
                    metodePembayaran = "Tidak Valid";
                    break;
            }

            DataZakatFitri warga = new DataZakatFitri(nama, alamat, metodePembayaran);
            dataWarga.add(warga);
            System.out.print("Apakah Anda ingin menambahkan data warga lagi? (Y/N)");
            jawaban = System.console().readLine();
            number++;
        } while (jawaban.equals("Y") || jawaban.equals("y"));
    }

    public void cetakData() {
        System.out.println("Data Warga Penerima Zakat Fitrah");
        System.out.println("==============================================================");
        System.out.println("No\tNama\t\tAlamat\t\tMetode Pembayaran");
        System.out.println("==============================================================");
        for (int i = 0; i < dataWarga.size(); i++) {
            System.out.println((i+1) + "\t" + dataWarga.get(i).getNama() + "\t\t" + dataWarga.get(i).getAlamat() + "\t\t" + dataWarga.get(i).getMetodePembayaran());
        }
    }
}