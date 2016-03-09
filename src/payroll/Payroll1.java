package payroll;

public class Payroll1 {

    public static void main(String[] args) {
        Kerja p = new Kerja();
        p.setNik(101);
        p.setKaryawan("paijo");
        p.setMasukPulang();
        p.getGaji(900);
        p.getTunjangan(200);
        p.getBonus(150);
        p.getDenda(75);
        p.display();
        
        Kerja p1 = new Kerja();
        p1.setNik(102);
        p1.setKaryawan("lulu");
        p1.setMasukPulang();
        p1.getGaji(875);
        p1.getTunjangan(200);
        p1.getBonus(100);
        p1.getDenda(100);
        p1.display();
        System.out.println("");
        
        Kerja p2 = new Kerja();
        p2.setNik(103);
        p2.setKaryawan("lala");
        p2.getGaji(1000);
        p2.setMasukPulang();
        p2.getTunjangan(350);
        p2.getBonus(200);
        p2.getDenda(125);
        p2.display();
        System.out.println("");
        
       
    }
}
