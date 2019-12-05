import java.util.Arrays;
import java.util.Scanner;
/*
https://en.wikipedia.org/wiki/Sudoku
*/
public class sodoku{
    private static void printBoard(Object[][] board){
        System.out.println("");
        System.out.println("    A B C D E F G H I");
        System.out.println("   -------------------");
        for(int i = 0; i < board.length; i++){
            String line = i + " | ";
            for(int j = 0; j < board[i].length; j++){
                line += board[i][j] + " ";
            }
            System.out.println(line);
        }
        System.out.println("");
    }
    
    private static Object[][] updateBoard(Object[][] board, int row, String col, int newNum){
        if(row < 0 || row > 9){
            System.out.println("");
            System.out.println("Invalid Row Value");
            return board;
        } else if(newNum < 0 || newNum > 9){
            System.out.println("");
            System.out.println("Invalid Replacement Value");
            return board;
        } else if(!("A".equals(col)) && !("B".equals(col)) && !("C".equals(col)) && !("D".equals(col)) && !("E".equals(col)) && !("F".equals(col)) && !("G".equals(col)) && !("H".equals(col)) && !("I".equals(col))){
            System.out.println("");
            System.out.println("Invalid Column Value");
            return board;
        }
        
        int actualCol = 0;
        switch(col){
            case "B":
                actualCol = 1;
                break;
            case "C":
                actualCol = 2;
                break;
            case "D":
                actualCol = 3;
                break;
            case "E":
                actualCol = 4;
                break;
            case "F":
                actualCol = 5;
                break;
            case "G":
                actualCol = 6;
                break;
            case "H":
                actualCol = 7;
                break;
            case "I":
                actualCol = 8;
                break;
        }
        board[row][actualCol] = newNum;
        return board;
    }
    
     public static void main(String []args){
         Object[][] answerBoard = {
            new Object[]{5,3,4,6,7,8,9,1,2},
            new Object[]{6,7,2,1,9,5,3,4,8},
            new Object[]{1,9,8,3,4,2,5,6,7},
            new Object[]{8,5,9,7,6,1,4,2,3},
            new Object[]{4,2,6,8,5,3,7,9,1},
            new Object[]{7,1,3,9,2,4,8,5,6},
            new Object[]{9,6,1,5,3,7,2,8,4},
            new Object[]{2,8,7,4,1,9,6,3,5},
            new Object[]{3,4,5,2,8,6,1,7,9}
        };
        Object[][] board = {
            new Object[]{5,3,"#","#",7,"#","#","#","#"},
            new Object[]{6,"#","#",1,9,5,"#","#","#"},
            new Object[]{"#",9,8,"#","#","#","#",6,"#"},
            new Object[]{8,"#","#","#",6,"#","#","#",3},
            new Object[]{4,"#","#",8,"#",3,"#","#",1},
            new Object[]{7,"#","#","#",2,"#","#","#",6},
            new Object[]{"#",6,"#","#","#","#",2,8,"#"},
            new Object[]{"#","#","#",4,1,9,"#","#",5},
            new Object[]{"#","#","#","#",8,"#","#",7,9}
        };
        printBoard(board);
        while(true){
            if(board != answerBoard){
                //user input row
                Scanner myObj = new Scanner(System.in);
                System.out.println("Enter Row");
                int userRow = myObj.nextInt();
                //user input col
                Scanner myObj2 = new Scanner(System.in);
                System.out.println("Enter Column");
                String userCol = myObj2.nextLine();
                //user input num
                Scanner myObj3 = new Scanner(System.in);
                System.out.println("Enter New Number");
                int userNum = myObj3.nextInt();
    
                board = updateBoard(board, userRow, userCol, userNum);
                printBoard(board);
            } else {
                System.out.println("YOU WIN!");
                break;
            }
        }
     }
}
