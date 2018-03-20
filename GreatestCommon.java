import java.util.Scanner;

public class GreatestCommon {
    public static void main(String[] args) {
        int numbera;
        int numberb;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        numbera = input.nextInt();
        System.out.println("Nhập số b: ");
        numberb = input.nextInt();

        numbera = Math.abs(numbera);
        numberb = Math.abs(numberb);
        if (numbera == 0 || numberb == 0)
            System.out.println("Không có ước số chung");
        else {
            while (numbera != numberb) {
                if (numbera > numberb)
                    numbera = numbera - numberb;
                else
                    numberb = numberb - numbera;
            }
            System.out.println("Ước số chung: " + numbera);
        }
    }
}
