import java.util.Scanner;

public class zuweisungsUndLogischeOperatoren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stunde = scanner.nextInt();
        System.out.println(stunde);

        if (stunde == 12) {
            System.out.println("Mittagspause");
        } else if (stunde >= 8 && stunde <= 15){
            System.out.println("Arbeitszeit");
        } else {
            System.out.println("Freizeit");
        }
    }
}
