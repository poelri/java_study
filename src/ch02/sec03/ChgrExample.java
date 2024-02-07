package ch02.sec03;

public class ChgrExample {
    public static void main(String[] args) {
        char c1 = 'A';//A 출력 문자1개만 쓸수 있다. 반드시 작은 따옴표
        char c2 = 65; //A 출력 유니코드 값
        char c3 = '가'; //가 출력
        char c4 = 44032; // 가 출력 유니코드값

        //char 타입에서 빈문자를 표현하고 싶을때
        // => 공백도 유니코드 값을 가지고 있다.

        //  char c5 = ''; 이건 에러가 난다
        char c6 = ' '; // 공백의 유니코드는 35이다 한칸띄워서 하셈

        System.out.println(c1);
        System.out.println(c2);        System.out.println(c3);
        System.out.println(c4);
    }
}
