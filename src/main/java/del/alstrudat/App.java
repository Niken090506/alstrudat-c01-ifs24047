package del.alstrudat;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.err.print("Masukkan jumlah pasien: ");
    if (!scanner.hasNextInt()) {
      scanner.close();
      return;
    }
    int n = scanner.nextInt();

    String[] names = new String[n];
    int[] ages = new int[n];
    String[] categories = new String[n];
    int[] urgencies = new int[n];

    int actualCount = 0;
    for (int i = 0; i < n; i++) {
      System.err.println("\nPasien ke-" + (i + 1) + ":");
      
      System.err.print("Nama: ");
      names[i] = scanner.next();
      
      System.err.print("Umur: ");
      ages[i] = scanner.nextInt();
      
      System.err.print("Kategori: ");
      categories[i] = scanner.next();
      
      System.err.print("Tingkat Urgensi: ");
      urgencies[i] = scanner.nextInt();
      
      actualCount++;

      if (urgencies[i] == 10) {
        System.out.println("\nPASIEN " + names[i].toUpperCase() + " TERDETEKSI VIRUS MENULAR!");
        break;
      }
    }

    System.out.println("\n--- Urutan Pelayanan IGD ---");
    Program.solve(actualCount, names, ages, categories, urgencies);

    scanner.close();
  }
}
