import java.util.Arrays;

public class sodoku{
     public static void main(String []args){
        Object[][] board = {new Object[]{1,2,3,4,5,6,7,8,9},new Object[]{1,2,3,4,5,6,7,8,9},new Object[]{1,2,3,4,5,6,7,8,9},new Object[]{1,2,3,4,5,6,7,8,9},new Object[]{1,2,3,4,5,6,7,8,9},new Object[]{1,2,3,4,5,6,7,8,9},new Object[]{1,2,3,4,5,6,7,8,9},new Object[]{1,2,3,4,5,6,7,8,9},new Object[]{1,2,3,4,5,6,7,8,9}};
        for(int i = 0; i < board.length; i++){
            String line = "";
            for(int j = 0; j < board[i].length; j++){
                line += board[i][j] + " ";
            }
            System.out.println(line);
        }
     }
}
