import java.util.Scanner;

public class AtletPorseni25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlAtlet = 5;
        String namaAtlet;

        //judul 
        System.out.println("-----------------------------------");
        System.out.println("===============PORSENI=============");
        System.out.println("-----------------------------------");

        //input jumlah piliteknik yang mengikuti porseni
        System.out.println("Masukkan jumlah politeknik yang mendaftar : ");
        int jmlPoliteknik = sc.nextInt();
        sc.nextLine();

        //perulangan untuk setiap politeknik
        for (int i = 1; i <= jmlPoliteknik; i++) {
            System.out.println("");
            System.out.println("----------------------------------------\n");
            System.out.println("Politeknik ke-" + i);


            //perulangan tiap cabor 
            System.out.println("Cabor : Badminton");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t :");
                namaAtlet = sc.nextLine();
            }

            System.out.println("Cabor : Tenis Meja");
            for(int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t :");
                namaAtlet = sc.nextLine();
            }
            System.out.println("Cabor : Basket");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t :" );
                namaAtlet = sc.nextLine();
            }
            System.out.println("Cabor : bola voly");
            for ( int j = 1; j <= jmlAtlet; j++ ) {
                System.out.print("Nama Atlet " + j + "\t : ");
                namaAtlet = sc.nextLine();
            }
    }

    }
}