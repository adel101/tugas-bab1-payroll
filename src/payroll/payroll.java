package payroll;

public class Payroll {

    public static void main(String[] args) {
        int nik[] = {101, 102, 103};
        String nama[] = {"paijo", "lulu", "lala"};
        int gaji[] = {900, 875, 1000};
        int tg[] = new int[3];
        int tunjangan[] = {200, 200, 350};
        int bonus[] = {150, 100, 200};
        int bonus2[] = new int[3];
        int denda[] = {75, 100, 125};
        int denda2[] = new int[3];
        int jam_masuk[] = {8, 8, 8};
        int jam_pulang[] = {18, 15, 17};

        for (int i = 0; i <= 2; i++) {
            if (jam_masuk[i] > 8) {
                denda2[i] = (jam_masuk[i] - 8) * denda[i];
            } else {
                denda2[i] = denda[i];
            }
            if (jam_pulang[i] > 17) {
                bonus2[i] = (jam_pulang[i] - 17) * bonus[i];
                bonus[i] = bonus2[i];
            } else if (jam_pulang[i] < 17) {
                bonus2[i] = bonus[i] - denda[i];
            }

            tg[i] = (gaji[i] + tunjangan[i] + bonus[i]) - denda2[i];

            System.out.println(nik[i] + "," + nama[i] + "," + gaji[i] + "," + tunjangan[i] + "," + bonus[i] + "," + denda2[i] + "," + tg[i]);
        }
    }

}
