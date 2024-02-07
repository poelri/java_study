package ch03.sec01;

public class incDecOperExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        // 값 자체는 전휘 후위든 증가와 감소를 한다
        x++;
        System.out.println("x = " + x ); // 11

        ++x;
        System.out.println("x = " + x ); // 12

        y--;
        System.out.println("y= " + y ); // 9
        --y;
        System.out.println("y= " + y );  // 8

        System.out.println("=-===========================================");

        // 선대입 후증가 ( z에 x 값을 먼저 대입 후 x 값을 증가시킨다)
        // 후위연산자 변수에 대입할때 주의
        z = x++; // 이게 후위연산자
        System.out.println("z=" + z); // z = 12 .
        System.out.println("x=" + x ); // x = 13


        z = ++x;
        System.out.println("z=" + z); // z = 14 .
        System.out.println("x=" + x ); // x = 14


        z = ++x + y++;
        // x는 14 였는데 1더해서 15가 되고 , 15 하고 8을 더해서 z에 넣음 이게 23.

        System.out.println("z=" + z );// z=23
        System.out.println("x=" + x ); //  x=15
        System.out.println("y=" + y ); // y=9
    }
}
