package sample;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        String S = "ab##";
        String T = "ad#c";

       

        
        int sIndex = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '#') {
                sIndex++;
            } 
        }

        
        int tIndex = 0;
        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            if (c == '#') {
                tIndex++;
            } 
        }

        
        if(tIndex == sIndex) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
        
     
    }
}
