package ch02.sec09;

public class StringConcatExample {
    public static void main(String[] args) {
        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2); //128 출력

        String result3 = 10 + "2"+ 8;
        System.out.println("result3: "+ result3); //1028 출력

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4); // 1028 출력

        String result5 = "10" + ( 2 + 8 );
        System.out.println("result5 : " +result5); //1010출력
    }
}
