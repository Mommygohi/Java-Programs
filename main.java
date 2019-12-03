import java.util.Arrays;
/*
https://en.wikipedia.org/wiki/Sudoku#/media/File:Sudoku_Puzzle_by_L2G-20050714_standardized_layout.svg
*/
public class sodoku{
    private static void printBoard(Object[][] board){
        for(int i = 0; i < board.length; i++){
            String line = "";
            for(int j = 0; j < board[i].length; j++){
                line += board[i][j] + " ";
            }
            System.out.println(line);
        }
    }
    
     public static void main(String []args){
        Object[][] board = {
            new Object[]{5,3,"@","@",7,"@","@","@","@"},
            new Object[]{6,"@","@",1,9,5,"@","@","@"},
            new Object[]{"@",9,8,"@","@","@","@",6,"@"},
            new Object[]{8,"@","@","@",6,"@","@","@",3},
            new Object[]{4,"@","@",8,"@",3,"@","@",1},
            new Object[]{7,"@","@","@",2,"@","@","@",6},
            new Object[]{"@",6,"@","@","@","@",2,8,"@"},
            new Object[]{"@","@","@",4,1,9,"@","@",5},
            new Object[]{"@","@","@","@",8,"@","@",7,9}
        };
        printBoard(board);
     }
}
