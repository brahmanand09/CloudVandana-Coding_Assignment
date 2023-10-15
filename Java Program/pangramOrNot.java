
public class pangramOrNot {
	
	public static boolean isPangram(String str) {
        str = str.toLowerCase();
        
        boolean[] isPresent = new boolean[26];
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                isPresent[c - 'a'] = true;
            }
        }
        
        for (boolean letterPresent : isPresent) {
            if (!letterPresent) {
                return false;
            }
        }
        return true;
    }
	    
    public static void main(String[] args) {
	    String input = "The quick brown fox jumps over the lazy dog";
	    boolean isPangram = isPangram(input);
	        
	    if (isPangram) {
	        System.out.println("The input is a pangram.");
	    } else {
	        System.out.println("The input is not a pangram.");
        }
	}
}

