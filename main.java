import java.util.Arrays;
import java.util.Random;

public class sodoku {
  public static void main(String args[]){
    int[][] board = new int[9][9];
    for(int i = 0; i < 9; i++){
        for(int j = 0; j < 9; j++){
            Random r = new Random();
            board[i][j] = r.nextInt((9 - 1) + 1) + 1;
            System.out.println(board[i][j]);
        }
    }
  }
}
