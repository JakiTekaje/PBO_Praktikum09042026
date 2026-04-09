/*
Nama    : Ahmad Zaky, NIM  : 2501082008
Desk    : 
 */
package praktikum09042026;

public class MahasiswaEnkapsulasi {
    private String nama,nim,jurusan;
    private int umur;
    private double ipk;
    private String nama1="Ahmad Zaky";
    private String nim1 ="2501082008";
    
    public MahasiswaEnkapsulasi(){
        
    }
    public MahasiswaEnkapsulasi(String nama1, String nim1){
        this.nama1 = nama1;
        this.nim1=nim1;
    }
    
    public MahasiswaEnkapsulasi(String nama, String nim, String jurusan, int umur, double ipk){
        this.nama = nama;
        this.nim=nim;
        this.ipk=ipk;
        this.jurusan=jurusan;
        this.umur=umur;
        this.ipk = ipk;
    }
    public String getNama(){
        return (nama);
    }
    public String getNim(){
        return (nim);
    }
    public String getJurusan(){
        return(jurusan);
    }
    public int getUmur(){
        return(umur);
    }
    public double getIpk(){
        return(ipk);
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
    
    public String statusKelulusan() {
        if (ipk >= 2.75) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
    
    public void tampilInfo() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Umur     : " + umur);
        System.out.println("IPK      : " + ipk);
        System.out.println("Status   : " + statusKelulusan());
    }

    public String getNama1(){
        return(nama1);
    }
    public String getNim1(){
        return(nim1);
    }
}
