import java.util.Scanner;

public class test_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество раз: ");
        int cnt_1 = scanner.nextInt();

        System.out.print("Введите количество раз за неделю: ");
        int cnt_week = scanner.nextInt();

        int result = 0;

        for (int i = 1; i <= 16; i++){
            result += cnt_1*cnt_week;
            System.out.println("К " + i + " неделе будет выпито " + result + " литров жидкости");
        }
        if (result < 120){
            System.out.println("К сожалению, студент не принят в клуб");
        }else{
            System.out.println("Студент принят в IT-клуб");
        }
        System.out.println(result);
    }
}
