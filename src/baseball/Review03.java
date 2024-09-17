package baseball;

public class Review03 {

    public static void main(String[] args) {
        // セ・リーグ６球団を生成
        BaseBallTeam name01 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        name01.report();

        BaseBallTeam name02 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        name02.report();

        BaseBallTeam name03 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        name03.report();

        BaseBallTeam name04 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        name04.report();

        BaseBallTeam name05 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        name05.report();

        BaseBallTeam name06 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        name06.report();

    }

}
