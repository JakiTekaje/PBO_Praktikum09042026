/*
Nama    : Ahmad Zaky, NIM  : 2501082008
Desk    : 
 */
package praktikum09042026;

public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int JumlahObjek=0;
        
    public PersegiPanjangEnkapsulasi(){
        JumlahObjek++;
    }
        
    public PersegiPanjangEnkapsulasi(int p, int l){
        panjang = p;
        lebar = l;
        JumlahObjek++;
    }
    public void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    public int getPanjang(){
        return(panjang);
    }
    public void setLebar(int lebarBaru){
        lebar = lebarBaru;
    }
    public int getLebar(){
        return(lebar);
    }
    public static int getJumlahObjek(){
        return(JumlahObjek);
    }
    public int getLuas(){
        return(panjang*lebar);
    }
    public int getKeliling(){
        return(2*panjang+lebar);
    }
}
