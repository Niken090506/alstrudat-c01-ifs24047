package del.alstrudat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    static class Pasien {
        String nama;
        int umur;
        int urgensi;
        int index;

        Pasien(String nama, int umur, int urgensi, int index) {
            this.nama = nama;
            this.umur = umur;
            this.urgensi = urgensi;
            this.index = index;
        }
    }

    public static void solve(int n, String[] names, int[] ages, String[] categories, int[] urgencies) {
        List<Pasien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Pasien(names[i], ages[i], urgencies[i], i));
        }
        // Prioritas: urgensi turun, umur turun, index naik (waktu datang lebih awal)
        Collections.sort(list, (a, b) -> {
            if (a.urgensi != b.urgensi) return Integer.compare(b.urgensi, a.urgensi);
            if (a.umur != b.umur) return Integer.compare(b.umur, a.umur);
            return Integer.compare(a.index, b.index);
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Pasien urutan " + (i + 1) + ": " + list.get(i).nama);
        }
    }
}