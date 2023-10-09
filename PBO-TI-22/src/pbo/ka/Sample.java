package pbo.ka;

public class Sample {
    public static void main(String[] args) {
        plush(8);
    }

    public static void minus(int num){
        int total = 0;
        for (int x = num; x > 0; x--) {
            total -= x;
            System.out.print(x + ((x > 1) ? "-" : "="));
        }
        System.out.println(total);
    }

    public static void plush(int num){
        int total = 0, length=5;
        for(int x = 1; x <= length; x++){
            total += x;
            System.out.print(x + ((x < length) ? "+":"=") );
        }
        System.out.println(total);
    }
}
