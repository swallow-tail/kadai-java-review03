package baseball;

public class BaseBallTeam {
    // フィールド
    private String name; // チーム
    private int win;     // 勝利
    private int lose;    // 敗北
    private int draw;    // 引分
    private double rate;  // 勝率

    //int型変数 win, lose を一時的にdouble型に変換して除算する（結果はdouble型・戻り値あり)
    public static double getRate(double win, double lose) {
        double rate = (win) / (win + lose);
        return rate;     // 勝率
    }

    // 引数なしのコンストラクタ（念のための記述)
    public BaseBallTeam() {
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝敗情報(レポート)のメソッド
    public void report() {
    System.out.println(name +" の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、 " + "勝率は " + rate + "です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

}
