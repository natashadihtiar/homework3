package natashadihtiar;
import java.io.Console;
import java.util.Scanner;

public class Main {

    private static void Example_1() {
        System.out.println("Example 1");

        Scanner scanner = new Scanner(System.in);

        long n;
        int a = 1, b = 2;

        System.out.println("Введите натуральное число: ");
        n = scanner.nextLong();

        System.out.println(" Введите цифру а: ");
        a = scanner.nextInt();

        System.out.println("Введите цифру b: ");
        b = scanner.nextInt();
        int acount = 0, bcount = 0;
        while (n != 0) {
            if (a == (n % 10)) {
                acount++;
            }
            if (b == (n % 10)) {
                bcount++;
            }
            n /=10;
        }
        if (acount <= bcount) {
            System.out.println("Да цифра а встречается реже чем цифра b.");
        }
        else {
            System.out.println("Нет,цифра а встречается не реже чем цифра b.");
        }}


    private static void Example_2() {
        System.out.println("\nExample 2\n");

        int a = 3, b = -5;
        double y;

        for ( int x=1; x <= 5; x++) {

            y = a * Math.pow(x/2, 2) + b;
            System.out.println(y);
        }
    }

    private static void Example_3() {
        System.out.println("Example 3");

        Scanner scanner = new Scanner(System.in);
        int i, a, b, h;

        float fx=0;
        System.out.println("Введите a (a<b): ");
        a = scanner.nextInt();

        System.out.println("Введите b: ");
        b = scanner.nextInt();

        System.out.println("Введите h: ");
        h = scanner.nextInt();

        System.out.println(" F(x) = x - sinx ");
        System.out.println(" x \t f(x) \n ");

        System.out.println("******1****** ");
        for (i = a; i <= b; h++) {

            float x = i;
            fx = x - (float) Math.sin(x);

            System.out.println(i + "\t" + fx + "\n");}

        System.out.println("******2******");

        for (i = a; i <= b; h++)
        {
            float x = i;
            fx = (float)(Math.sin(x)*Math.sin(x));
            System.out.println(i + "\t" + fx+ "\n");}


        System.out.println("******3****** ");
        for (i = a; i <= b; h++)
        {
            float x = i;
            fx = (float)(2 * Math.cos(x)-1);
            System.out.println(i + "\t" + fx+ "\n");}

    }


    private static void Example_6() {
        System.out.println("Example 6");

        Scanner scanner = new Scanner(System.in);
        int x, y, k;

        System.out.println("Введите x: ");
        x = scanner.nextInt();

        System.out.println("Введите y: ");
        y = scanner.nextInt();

        System.out.println("Введите k: ");
        k = scanner.nextInt();

        for (x = 1; x <= 30; x++)
            for (y = 1; y <= 30; y++)
                for (k = 1; k <= 30; k++)

                {int result = x*x + y*y - k*k;
                    if(result == 0)
                        System.out.println(" x = "+ x + "; "+" y = "+y+ "; "+"k = "+k);}}



    private static void Example_7() {
        System.out.println("Example 7");

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int i = 0;
        while (count < 15)
        {
            if ((100 + i) % 19 == 0)
            {
                System.out.println(100 + i);
                count++;
            }
            i++;
        }
    }

    private static void Example_8() {
        System.out.println("Example 8");

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int i = 0;
        while (count < 20)
        {
            if ((500 + i) % 13 == 0 || (500 + i) % 17 == 0 )
            {
                System.out.println(500 + i);
                count++;
            }
            i++;
        }
    }

    private static void Example_10() {
        System.out.println("Example 10");

        Scanner scanner = new Scanner(System.in);
        int sum =0;
        for(int i =1; i<40 ; i=i+4) {
            sum=sum+i;
            System.out.println( +i);
        }
        System.out.println("\nСумма арифметической прогресии =" + sum);
    }



    public static void main(String[] args) {

        Example_1();
        Example_2();
        Example_3();
        Example_6();
        Example_7();
        Example_8();
        Example_10();

    }
}

