import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nama: ");
        String nama = scanner.nextLine();

        System.out.println("Jenis Kelamin (L/P): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = (jenisKelaminInput.equalsIgnoreCase("L")) ? "Laki-laki" : "Perempuan";

        System.out.println("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        LocalDate now = LocalDate.now();
        Period period = Period.between(tanggalLahir, now);
        int umurTahun = period.getYears();
        int umurBulan = period.getMonths();

        System.out.println("\nOutput:\n");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur Anda: " + umurTahun + " tahun " + umurBulan + " bulan");
    }
}

