package ch02.sec10;

public class StringConverExample {
    public static void main(String[] args) {
        String str = "10";
        int value1 = Integer.parseInt(str);
        double value2 = Double.parseDouble(str);
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 : " + value1); // 10 출력
        System.out.println("value2 : " + value2); // 10.0 출력
        System.out.println("value3 : " + value3); // true 출력


        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 : " + str1); //10 출력
        System.out.println("str2 : " + str2); //3.14 출력
        System.out.println("str3 : " + str3); // true 출력
    }
}
