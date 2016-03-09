package payroll;

public class Payroll1 {

    public static void main(String[] args) {
        Kerja p = new Kerja();
        p.setNik(101);
        p.setKaryawan("paijo");
        p.setGaji(900);
        p.setTunjangan(200);
        p.setBonus(150);
        p.setDenda(75);
        p.display();

        Kerja p1 = new Kerja();
        p1.setNik(102);
        p1.setKaryawan("lulu");
        p1.setGaji(875);
        p1.setTunjangan(200);
        p1.setBonus(100);
        p1.setDenda(100);
        p1.display();
        System.out.println("");

        Kerja p2 = new Kerja();
        p2.setNik(103);
        p2.setKaryawan("lala");
        p2.setGaji(1000);
        p2.setTunjangan(350);
        p2.setBonus(200);
        p2.setDenda(125);
        p2.display();

    }
}
