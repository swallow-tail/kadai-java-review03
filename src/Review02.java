
public class Review02 {

    public static void main(String[] args) {
        // iの値が1から100より小さい間、処理を繰り返す
        for (int i = 1; i <= 100; i++) {
            // iの値が3でも5でも割り切れるとき
            if (i % 3 == 0 && i % 5 ==0) {
                // "FizzBuzz" を表示する
                System.out.println("FizzBuzz");
            // iの値が3で割り切れるとき
            } else if (i % 3 == 0) {
                // "Fizz" を表示する
                System.out.println("Fizz");
            // iの値が5で割り切れるとき
                } else if (i % 5 == 0) {
                    // "Buzz" を表示する
                    System.out.println("Buzz");
            } else {
                // 数値を出力する
                System.out.println(i);
            }
        }
    }
}