package payroll;

public class payroll {

    private String karyawan, nik, hari;
    private int tunjangan, tanggal, total, denda, bonus, gaji, jmasuk, jpulang;

  
    public void setJamMasuk(int i) {
        jmasuk = i;
    }

    public void setJamPulang(int i) {
        jpulang = i;
    }

    public void setNik(String s) {
        nik = s;
    }

    public void setKaryawan(String s) {
        karyawan = s;
    }

    public void setGaji(int i) {
        gaji = i;
        this.gaji = gaji;
        this.bonus = bonus;
        tunjangan = tunjangan;
        boolean hari;

        if (hari == true) {
            bonus = bonus * (jpulang - jmasuk);
            if (jpulang > 29) {
                bonus = bonus + bonus / 2;
            }
        } else if (jpulang >= 17) {
            bonus = bonus * (jpulang - 17);

            if (jpulang > 29) {
                bonus += bonus / 2;
            }
        

    

    public void setBonus(int i) {

    }

    public void setDenda(int i) {
        denda = i;
        if (jpulang < 17 && jmasuk > 8) {

        }
    }

    public void getTotal(int i) {
        total = (gaji + tunjangan + bonus) - denda;
    }

    public void Display() {
        System.out.println(jpulang + "," + jpulang + "," + nik + "," + karyawan + "," + gaji + "," + tunjangan + "," + bonus + "," + denda + ",");
    }

}
