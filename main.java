import java.util.Arrays;
import java.util.Random;

public class sodoku {
  public static void main(String args[]){
    int[] board = new int[81];
    for(int i = 0; i < board.length; i++){
      Random r = new Random();
      board[i] = r.nextInt((9 - 1) + 1) + 1;
      System.out.println(board[i]);
    }
  }
}
