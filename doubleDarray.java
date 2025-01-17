
public class doubleDarray{
    public static void main(String[] args) {
        int[][] j = new int[3][5];
        j[0][0] = 1;
        j[0][1] = 2;
        j[0][2] = 3;
        j[0][3] = 4;
        j[0][4] = 5;
        j[1][0] = 6;
        j[1][1] = 7;
        j[1][2] = 8;
        j[1][3] = 9;
        j[1][4] = 10;
        j[2][0] = 11;
        j[2][1] = 12;
        j[2][2] = 13;
        j[2][3] = 14;
        j[2][4] = 15;
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(j[i][k] + " ");
            }
            System.out.println();
        
        }
    }

}