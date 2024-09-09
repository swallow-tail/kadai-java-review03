
public class Review01 {

    public static void main(String[] args) {
        //
        int price = 1500;
        int taxrate = 10;
        int result;
        result = taxMethod (price, taxrate);
        System.out.println(price + "円の商品の税込価格は" + (price + result) + "円" + "（消費税は" + result + "円）です。");
    }

        public static int taxMethod(int price, int taxrate) {
        int num = price / taxrate;
        return num;
    }

}