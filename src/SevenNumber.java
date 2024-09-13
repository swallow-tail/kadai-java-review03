public class SevenNumber {

    public static void main(String[] args) {
        // iの値が0から100までの数値を順番に出力する
        for (int i = 0; i <= 100; i++) {
            // iの値が7の倍数または7が入っている数
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                // "clap!"を表示する
                System.out.println("clap!");
            } else {
                // 数値を出力する
                System.out.println(i);
            }
        }

    }
}
