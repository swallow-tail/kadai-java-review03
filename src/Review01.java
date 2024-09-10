
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double taxrate = 0.1;
        double result;
        result = taxMethod (price, taxrate);

       //resultをdouble型からint型へ変換
        System.out.println(price + "円の商品の税込価格は" + (price + (int)result) + "円" + "（消費税は" + (int)result + "円）です。");
    }

       //int型変数 price を一時的にdouble型に変換して除算する（結果はdouble型・戻り値あり)
        public static double taxMethod(double price, double taxrate) {
        double num = price * taxrate;
        return num;
    }

}