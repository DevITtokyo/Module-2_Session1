import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        int rate = 23000;
        System.out.println("Tỉ giá hiện tại là " + rate);
        System.out.println("Nhập giá trị tiền USD ");
        Scanner scanner = new Scanner(System.in);
        double usdValue = scanner.nextFloat();
        double vndValue = usdValue * rate;
        System.out.println("Giá trị VND là: "+vndValue);
    }
}
