import java.util.Scanner;

class App {

    public static void main(String[] args) {
        System.out.println(F(2, 10));
    }

    //
    // N ->
    // / F(N-1) , N mod 2 != 0
    // F(N) = { F(N-1) + F(N/2), N mod 2 = 0
    // \ 1, N = 2
    //
    //
    static int F(int a, int b) {
        if (b == a)
            return 1;
        else if (b < a) {
            return 0;
        } else if (b % 2 != 0)
            return F(a, b - 1);
        else
            return F(a, b - 1) + F(a, b / 2);
    }
}

// N ->