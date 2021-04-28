import java.util.Scanner;
public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        pilihan5();
        // System.out.print("PILIHLAH SALAH SATU MENU 1/2/3/4/5/6 : ");
        // int in = input.nextInt();
        // if (in == 1) {
        //     pilihan1();
        // } else if (in==2){
        //     pilihan2("Yusup Maulana");
        // } else if (in == 3) {
        //     int hasil = luaspersegi(3);
        //     int kuadrat = hasil * hasil;
        //     System.out.println(kuadrat);
        // } else if (in == 4) {
        //     luaspersegi2(3);
        // }
        // switch (in) {
        // case 1:
        //     pilihan1();
        //     break;

        // case 2:
        //     System.out.println("2");
        //     break;

        // case 3:
        //     System.out.println("3");
        //     break;

        // case 4:
        //     System.out.println("4");
        //     break;

        // case 5:
        //     System.out.println("5");
        //     break;

        // case 6:
        //     System.out.println("6");
        //     break;
        // }
    }
    
    // SUB PROGRAM or Method or fungsi
    static void pilihan1() {
        System.out.print("PILIHAN 1");
    }
    
    // SubProgram Parameter tipe void
    static void pilihan2(String nama) {
        System.out.print("Nama anda adalah " + nama);
    }
    
    // SubProgram Parameter tipe int/double/float
    static int luaspersegi(int s) {
        int luas = s * s;
        return luas;
    }
    
    static void luaspersegi2(int s) {
        int luas = s * s;
        System.out.println(luas);
    }

    static void pilihan5() {
        Scanner input5 = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Bilangan : ");
        int in5 = input5.nextInt();
        int genap, bilangan, x;
        genap = 0;
        for (int i = 1; i <= in5; i++) {
            System.out.print("Masukkan Bilangan ke " + i + " : ");
            bilangan = input5.nextInt();
            x = bilangan % 2;
            if (x == 0) {
                if (bilangan > genap) {
                    genap = bilangan;
                }
            }
        }
        System.out.print("Bilangan Genap Terbesar Adalah " + genap);
    }
    // in5 = 5;
    // genap = 0 ; i=1; bilangan=2; x=0 ; genap =2 ;
    // genap = 2 ; i=2; bilangan=3; x=1;
    // genap = 2 ; i=3; bilangan=8; x=0; genap = 8;
    // genap = 8 ; i=4; bilangan=6; x=0; 
    // genap = 8 ; i=5; bilangan=5; x=1; 
    

    // 5:2= (2 x 2)
    // 5 = 4 sisa 1;
    // 8 : 2 (4 x 2)
    // 8 : 2= 4 sisa 0
    // 11 : 2 = 2 x 5 sisa 1
}
