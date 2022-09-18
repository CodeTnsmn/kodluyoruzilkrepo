public class Main {
    public static void main(String[] args) {
        String[][] meslekler = new String[3][3];

        meslekler[0][0] = "Hemşire";
        meslekler[0][1] = "Doktor";
        meslekler[0][2] = "Mühendis";
        meslekler[1][0] = "Avukat";
        meslekler[1][1] = "Savcı";
        meslekler[1][2] = "Hakim";
        meslekler[2][0] = "Terzi";
        meslekler[2][1] = "Marangoz";
        meslekler[2][2] = "Aşçı";

        for (int i = 0 ; i<=2 ; i++){
            for (int j = 0 ; j<=2 ; j++){
                System.out.println(meslekler[i][j]);
            }
        }
    }
}