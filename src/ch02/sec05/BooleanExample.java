package ch02.sec05;

public class BooleanExample {
    public static void main(String[] args) {
        int x =10;
        boolean result1 = (x == 20); // x의 값이 20과 같니?
        boolean result2 = (x != 20); // x의 값이 20과 다른가?

        System.out.println(result1); //false
        System.out.println(result2); // true

        boolean stop = true;

        if(stop) {
            System.out.println("중지합니다");
        } else {
            System.out.println("시작합니다");
        }
    }
}
