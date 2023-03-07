package ecommercesepatu;


public class Sepatu {
    //atribut
    private int HargaSepatu;
    private String MerkSepatu;
    private int Size;
    private String Warna;

    //constructor
    Sepatu(int harga, String Merk, int Size, String warna){
        this.HargaSepatu = harga;
        this.MerkSepatu = Merk;
        this.Size = Size;
        this.Warna = warna;

    }
    public void setHarga(int harga){
        this.HargaSepatu = harga;    
    }
    public void setMerk(String merk){
        this.MerkSepatu = merk;    
    }
    public void setSize(int size){
        this.Size = size;    
    }
    public void setWarna(String warna){
        this.Warna = warna;    
    }
    
    public int getHarga(){
        return HargaSepatu;
    }
    public String getMerk(){
        return MerkSepatu;
    }
    public int getSize(){
        return Size;
    }
    public String getWarna(){
        return Warna;
    }

}
