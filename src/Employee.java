
public class Employee {
    // フィールド
    public String employeeName;    // 社員名
    public String divisionName;    // 部署名
    public int vitarity;           // 体力

    // 引数なしのコンストラクタ
    public Employee() {
        this("未設定です");
        System.out.println("引数なしコンストラクタを終了しました");
    }

    // String型引1つがあるコンストラクタ
    public Employee(String employeeName) {
        this(employeeName, "営業部");
        System.out.println("String型引数1つがあるコンストラクタを終了しました");
    }
    // String型引2つがあるコンストラクタ
    public Employee(String employeeName, String divisionName) {
        this(employeeName, divisionName, 150);
        System.out.println("String型引数2つがあるコンストラクタを終了しました");
    }

    // String型引2つ、int型引数1つがあるコンストラクタ
    public Employee(String employeeName, String divisionName, int vitarity) {
        System.out.println("インスタンス化時に引数ありコンストラクタが呼ばれました");
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitarity = vitarity;
    }

    // 自己紹介メソッド
    public void introduce() {
        vitarity = vitarity - 10;
        System.out.println("私の名前は" + employeeName + "です。");
        System.out.println("所属部署は" + divisionName + "です。");
    }

    // 挨拶をするメソッド
    public void greeting() {
        vitarity = vitarity - 10;
        System.out.println("おはようございます");
    }

    // 報告するメソッド
    public void report() {
        vitarity = vitarity - 10;
        System.out.println("今日は10件アポイントを取りました");
    }

    // 残り体力を知らせるメソッド
    public void showVitarity() {
        vitarity = vitarity - 10;
        System.out.println("残り体力は" + vitarity);
    }

    // 出勤するメソッド
    public void goToWork() {

    }

    // 退勤するメソッド
    public void leaveWork() {

    }
}