
package ecommercesepatu;
import java.util.*;

public class Main {
    static ArrayList<Sepatu> DataSepatu = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    private static void clear(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    private static void sleep(int sec){
        try {
            Thread.currentThread().sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        boolean lanjut = true;
        while(lanjut){
            clear();
            System.out.println("==================");
            System.out.println("|   Data Sepatu  | ");
            System.out.println("==================");
            System.out.println("| 1.Tambah Stok");
            System.out.println("| 2.Lihat Stok");
            System.out.println("| 3.Update Stok");
            System.out.println("| 4.Hapus stok");
            System.out.println("| 5.Keluar");
            System.out.print("Masukan Pilihana Anda>>");
            int pilihan = input.nextInt(); 
            switch(pilihan){
                case 1:
                clear();
                    System.out.println("Tambah Stok");
                    nambahData();
                    sleep(1);
                    break;
                case 2:
                    System.out.println("Lihat Stok");
                    
                    break;
                case 3:
                    System.out.println("Update Stok");
                    UpdateData();
                    break;
                case 4:
                    System.out.println("Hapus Stok");
                    HapusData();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada.");
                        break;
            }

        }
    }

    static void nambahData(){
        System.out.print("Masukan Merk Sepatu>>");
        String MerkSepatu = input.next();
        System.out.println("Masukan harga>>");
        int HargaSepatu = input.nextInt();
        System.out.println("Masukan Size Sepatu>>");
        int Size = input.nextInt();
        System.out.println("Masukan warna sepatu>>");
        String Warna = input.next();
        Sepatu newdata = new Sepatu(HargaSepatu, MerkSepatu, Size, Warna);
        DataSepatu.add(newdata);
    }
    
    static void UpdateData(){
        System.out.print("Masukan Merk Sepatu>>");
            String MerkSepatu = input.next();
            for(Sepatu sepatu : DataSepatu){
                if(sepatu.getMerk().equals(MerkSepatu)){
                    System.out.print("Masukan Merk Sepatu>>");
                    sepatu.setMerk(input.next());
                    System.out.println("Masukan harga>>");
                    sepatu.setHarga(input.nextInt());
                    System.out.println("Masukan Size Sepatu>>");
                    sepatu.setSize(input.nextInt());
                    System.out.println("Masukan warna sepatu>>");
                    sepatu.setWarna(input.next());
                    System.out.println("=====================");
                    System.out.println("Data Berhasil di Ubah");
                    System.out.println("=====================");
                    break;
                }

            }
    }

    static void HapusData(){
            System.out.print("Masukan Merk Sepatu>>");
            String MerkSepatu = input.nextLine();
            for(int i=0; i < DataSepatu.size();i++){
                if(DataSepatu.get(i). getMerk().equals(MerkSepatu)){
                    DataSepatu.remove(i);
                    System.out.println("=====================");
                    System.out.println("Data Berhasil Dihapus");
                    System.out.println("=====================");
                }
            }
    }
}
