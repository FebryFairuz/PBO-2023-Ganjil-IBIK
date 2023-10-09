package pbo.ka;

public class QuizOop {
    public static void main(String[] args) {
        int total = 0;
        for (int x = 2; x > 0; x--) {
            total -= x-2;
            System.out.print(x + ((x > 1) ? "-" : "="));
        }
        System.out.println(total);
    }
}