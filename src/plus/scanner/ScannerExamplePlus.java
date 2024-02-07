package plus.scanner;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExamplePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nextLine()입력 : ");

        String inputNextLine= scanner.nextLine();
        System.out.println(inputNextLine);  // nextLine()입력 :  hi java //  hi java 가 출력

        System.out.print("next()입력 : ");
        String inputNext = scanner.next();
        System.out.println(inputNext); // next()입력 : hi java  // hi 가 출력


        System.out.println("int 형 입력 : ");
        int inputInt = scanner.nextInt(); // 7 입력 // int 타입으로 값을 입력 받음
        System.out.println(inputInt);

        System.out.print("double 형 입력");
        double inputDouble = scanner.nextDouble(); // 5.5 입력 //double 타입으로 값을 입력 받음
        System.out.println(inputDouble);

        System.out.println("int + double = " + (inputInt + inputDouble )); // int + double = 12.5
        System.out.println("boolean 형 입력 : ");
        Boolean inputBoolean = scanner.nextBoolean();
        System.out.println(inputBoolean);

    }
}
