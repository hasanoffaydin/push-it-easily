// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[][][] sehirler = new String[3][3][2];//multi arraylar
        sehirler[0][0][0] = "Tovuz";
        sehirler[0][0][1] = "Gence";
        sehirler[0][1][0] = "Yevlax";
        sehirler[0][1][1] = "Baki";
        sehirler[0][2][0] = "Sumqayit";
        sehirler[0][2][1] = "Kurdemir";
        sehirler[1][0][0] = "Zaqatala";
        sehirler[1][0][1] = "Yevlax";
        sehirler[1][1][0] = "Ucar";
        sehirler[1][1][1] = "Agdam";
        sehirler[1][2][0] = "Agdere";
        sehirler[1][2][1] = "Fizuli";
        sehirler[2][0][0] = "Qubadli";
        sehirler[2][0][1] = "Zengilan";
        sehirler[2][1][0] = "Imisli";
        sehirler[2][1][1] = "Salyan";
        sehirler[2][2][0] = "Qusar";
        sehirler[2][2][1] = "Quba";
        for(int i = 0 ;i<=2;i++)
        {
            System.out.println("------------------");
            for(int j = 0;j<=2;j++)
            {
                System.out.println("******************");
                for(int k = 0 ;k<=1;k++){
                    System.out.println(sehirler[i][j][k]);
                }
            }
        }
    }
}