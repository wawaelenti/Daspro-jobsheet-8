import java.util.Scanner;

public class AngkaPersegi25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = scanner.nextInt();
        
        if (n < 3) {
            System.out.println("Nilai n harus minimal 3.");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Cek jika berada di tepi luar persegi
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print("3 ");
                    } else {
                        System.out.print("  "); // Bagian tengah kosong
                    }
                }
                System.out.println();
            }
        }
        
    }
}
