
public class Leetcode_WordSearch {
/*
 * Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
 */
	 public static boolean exist(char[][] board, String word) {
	       
	        for(int r=0;r<board.length;r++){
	            for(int c=0;c<board[0].length;c++){
	                if(checkExists(board, r, c, word, 0)){
	                        return true;
	                }
	            }
	        }
	        return false;
	    }

	    private static boolean checkExists(char[][] board, int r, int c, String word, int l){
	        if(r < 0 || c < 0 || r>= board.length || c>=board[0].length) return false;
	        if(board[r][c] != word.charAt(l)) return false;
	        if(l == word.length()-1 && board[r][c] == word.charAt(l)) {
	           return true;
	        }
	        char orig = board[r][c];
	        board[r][c]='#';
	        boolean wordExists = checkExists(board,r+1,c,word,l+1) || checkExists(board,r-1,c,word,l+1) || checkExists(board,r,c+1,word,l+1) || checkExists(board,r,c-1,word,l+1);
	        board[r][c]=orig;
	        return wordExists;
	    }
}
