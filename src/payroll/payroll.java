package payroll;

public class payroll {

    private double  jmasuk, jpulang, bonus, denda, gaji;
    private String karyawan,tanggal, nik;
    private int tunjangan;

    //tanggal
    //calender ?
    public void setJamMasuk (int i){
        jmasuk = i;
    }
    public void setJamPulang (int i){
        jpulang = i;
    }
    public void setNIk( String s){
        nik = s;
    }
    public void setKaryawan(String s){
        karyawan = s;
    }
    public void setGaji(int i){
        gaji = i;
        
    }
    public void setTunjangan(int  i){
        tunjangan = i;
    }
    public void setBonus(Double d){
        bonus = d;
    }
    public void setDenda(Double d){
        denda = d;
    }
}
