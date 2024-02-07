package ch02.sec02;

public class IntergerLiteralExample {
    public static void main(String[] args) {
        //2진수(0과 1로 작성) : 1011 => 0b를 붙여서 작성
        int var1 = 0b1011;
        System.out.println(var1); //11출력

        //8진수(0~7사이의 숫자로 작성) : 206 =>0을 붙여서 작성
        int var2 = 0206;
        System.out.println(var2); // 134 출력

        //16진수(0~9사이의 숫자와 a~f 까지의 문자로 작성) => 0X를 붙여서 작성
        int var3 = 0xB3;
        System.out.println(var3); //179출력
    }
}
