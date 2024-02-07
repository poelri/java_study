package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        char var1 = 'A'; // char 타입은 큰따옴표 XX
        String var2 = "홍길동"; // char 타입은 문자를 1개만

        String name = "홍길동";
        String job = "프로그래머";

        System.out.println(name + "은 " + job +"입니다.");
        // 홍길동은 프로그래머 입니다 출력 됨

        //쌍따옴표 출력
        String str ="나는 \"자바\"를 배웁니다";
        System.out.println(str); // 나는 "자바"를 배웁니다 출력 됨

        //tab 만큼 띄어쓰기
        str = "번호\t이름\t직업";
        System.out.println(str); // 번호	이름	직업 출력
        
        //줄바꿈
        System.out.println("나는\n자바를\n 배웁니다"); // \n마다 줄바꿈 되서 출력
    }
}
