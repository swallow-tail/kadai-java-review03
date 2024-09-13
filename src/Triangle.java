
public class Triangle {

    public static void main(String[] args) {
        // 代入する数値は自由に変更してください
        int a = 5;
        int b = 4;
        int c = 4;

        if ( a == b && b == c) {
            System.out.println("正三角形");
        } else if (a == b || b == c || c == a) {
            System.out.println("二等辺三角形");
        } else {
            System.out.println("不等辺三角形");
        }
    }

}
