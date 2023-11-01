import java.util.Scanner;
public class test_1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.print("Введите количество выводов: ");
        int N = scanner.nextInt();

        do{
            System.out.println(str);
            N --;
        } while(N >= 1);

    }
}
