import java.util.ArrayList;

public class Main2 {
    private ArrayList<Warga> dataWarga;
    public static void main(String[] args) throws Exception {
        Main2 Screen = new Main2();
        Screen.inputData();
        Screen.cetakData();
        Screen.totalPembayaran();
    }

    public void inputData() {
        dataWarga = new ArrayList<Warga>();
        String jawaban;
        int number = 1;
        do {
            System.out.println("====== SOAL NO 2 =====");
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

            Warga warga = new Warga(nama, alamat, metodePembayaran);
            dataWarga.add(warga);
            System.out.print("Apakah Anda ingin menambahkan data warga lagi? (Y/N)");
            jawaban = System.console().readLine();
            number++;
        } while (jawaban.equalsIgnoreCase("Y"));
    }

    public void cetakData() {
        System.out.println("=============================================================");
        System.out.println("Data Zakat Fitri");
        System.out.println("=============================================================");
        System.out.println("No\tNama\t\tAlamat\t\tMetode Pembayaran");
        System.out.println("=============================================================");
        for (int i = 0; i < dataWarga.size(); i++) {
            System.out.println((i+1) + "\t" + dataWarga.get(i).getNama() + "\t\t" + dataWarga.get(i).getAlamat() + "\t\t" + dataWarga.get(i).getMetodePembayaran());
        }
    }

    public void totalPembayaran() {
        int jumlahUang = 0;
        int jumlahBeras = 0;

        for (int i = 0; i < dataWarga.size(); i++) {
            if (dataWarga.get(i).getMetodePembayaran().equals("Uang")) {
                jumlahUang++;
            } else if (dataWarga.get(i).getMetodePembayaran().equals("Beras")) {
                jumlahBeras++;
            }
        }
    
        int totalUang = jumlahUang * 35000;
        double totalBeras = jumlahBeras * 2.5;
    
        System.out.println("\n========== TOTAL PEMBAYARAN ==========");
        System.out.println("Jumlah orang yang membayar dengan uang: " + jumlahUang);
        System.out.println("Jumlah orang yang membayar dengan beras: " + jumlahBeras);
        System.out.println("Total uang: Rp " + totalUang);
        System.out.println("Total beras: " + totalBeras + " Kg");
    }
}