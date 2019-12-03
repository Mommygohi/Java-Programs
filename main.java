import java.util.Arrays;
/*https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwiA4dzbmJrmAhUYqp4KHVBeBZwQjRx6BAgBEAQ&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FSudoku&psig=AOvVaw0xLMkM8x6KcDDKMkpJyFO0&ust=1575487038527341*/
public class sodoku{
     public static void main(String []args){
        Object[][] board = {
            new Object[]{5,3,"@","@",7,"@","@","@","@"},
            new Object[]{6,"@","@",1,9,5,"@","@","@"},
            new Object[]{"@",9,8,"@","@","@","@",6,"@"},
            new Object[]{8,"@","@","@",6,"@","@","@",3},
            new Object[]{1,2,3,4,5,6,7,8,9},
            new Object[]{1,2,3,4,5,6,7,8,9},
            new Object[]{1,2,3,4,5,6,7,8,9},
            new Object[]{1,2,3,4,5,6,7,8,9},
            new Object[]{1,2,3,4,5,6,7,8,9}
        };
        for(int i = 0; i < board.length; i++){
            String line = "";
            for(int j = 0; j < board[i].length; j++){
                line += board[i][j] + " ";
            }
            System.out.println(line);
        }
     }
}
