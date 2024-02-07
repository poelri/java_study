package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // 정밀도 ( Double > float )
        float var1 = 0.123f; // 실수형은 기본 리터럴을 Double 타입으로 인식
                            //float 형은 f 를 붙여준다
        double var2 = 0.1234567891523456789;

        System.out.println("var1: " + var1); // 0.123 출력
        System.out.println("var2: " + var2);  // 0.12345678915234568

        // 가수와 지수 나눠서 작성하기
        double var3 = 3e6; // 3.0 X 10^6 10의 6승
        System.out.println( "var3 : " + var3); // 3000000.0 출력

        float var4 = 3e6F;
        System.out.println("var4 : " + var4); // 3000000.0 출력

        double var5 = 2e-3; // 2.0 X 10^-3 10의 -3승
        System.out.println("var5 : " + var5); // 0.002 출력

    }
}
