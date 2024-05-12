//3110. Score of a String-ASCII

package sample;

public class ScoreofString {
	public static void main(String[] args) {
	        String s = "hello";//'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111
	        int score = calculateScore(s);
	        System.out.println("The score of the string \"" + s + "\" is: " + score);
	    }

	    public static int calculateScore(String s) {
	        int score = 0;
	        
	        for (int i = 1; i < s.length(); i++) {
	            char currentChar = s.charAt(i);
	            char prevChar = s.charAt(i - 1);
	            score = score+Math.abs(currentChar - prevChar);//abs->absolute
	        }
	        
	        return score;
	    }
	}



