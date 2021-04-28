import java.util.Scanner;

public class meet2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PILIHLAH SALAH SATU MENU 1/2/3/4/5/6 : ");
        int in = input.nextInt();
        switch (in) {
        case 1:
            pilih1();
            break;

        case 2:
            pilih2();
            break;

        case 3:
            System.out.println("3");
            break;

        case 4:
            System.out.println("4");
            break;

        case 5:
            pilih5();
            break;

        case 6:
            pilih6();
            break;
        }
    }
    
    static void pilih1() {
        Scanner p1 = new Scanner(System.in);
        System.out.print("Masukkan banyaknya bilangan : ");
        int n1 = p1.nextInt();
        int bil[] = new int[100];
        for (int i = 1; i <= n1; i++) {
            System.out.print("Masukkan Bilangan Ke " + i + " : ");
            bil[i] = p1.nextInt();
        }

    }

    static void pilih2() {
        Scanner p2 = new Scanner(System.in);
        System.out.print("Masukkan banyaknya bilangan : ");
        double n2 = p2.nextDouble();
        double bil1 = 0;
        for (int i = 1; i <= n2; i++) {
            System.out.print("Masukkan Bilangan Ke " + i + " : ");
            double bil2 = p2.nextInt();
            bil1 = bil1 + bil2;
        }
        double mean = bil1 / n2;
        System.out.print("Mean dari " + n2 + " Bilangan Adalah : " + mean);
    }

    
    static void pilih5() {
        Scanner p5 = new Scanner(System.in);
        System.out.print("Masukkan banyaknya bilangan : ");
        int n5 = p5.nextInt();
        int bil5, x, genap;
        genap = 0;
        for (int i = 1; i <= n5; i++) {
            System.out.print("Masukkan Bilagan Ke " + i + " : ");
            bil5 = p5.nextInt();
            x = bil5 % 2;
            if (x == 0) {
                if (bil5 > genap) {
                    genap = bil5;
                }
            }
        }
        System.out.print("Bilangan genap terbesar adalah " + genap);
    }
    
    static void pilih6() {
        Scanner p6 = new Scanner(System.in);
        System.out.print("Masukkan banyaknya bilangan : ");
        int n6 = p6.nextInt();
        int bil6, x, ganjil;
        ganjil = 0;
        for (int i = 1; i <= n6; i++) {
            System.out.print("Masukkan Bilagan Ke "+i+" : ");
            bil6 = p6.nextInt();
            x = bil6 % 2;
            if (x != 0) {
                if (bil6 > ganjil) {
                    ganjil = bil6;
                }
            }
        }
        System.out.print("Bilangan ganjil terbesar adalah " + ganjil);
    }
    
}