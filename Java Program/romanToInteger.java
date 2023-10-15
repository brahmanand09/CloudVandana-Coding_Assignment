public class romanToInteger {
	public static int romanToInt(String s) {
	    int result = 0;
	        
	    for (int i = 0; i < s.length(); i++) {
	        char currentChar = s.charAt(i);
	        int currentValue = getValue(currentChar);

	        if (i < s.length() - 1) {
	            char nextChar = s.charAt(i + 1);
	            int nextValue = getValue(nextChar);

	            if (currentValue < nextValue) {
	                result -= currentValue;
	            } else {
	                result += currentValue;
	            }
	        } else {
	            result += currentValue;
	        }
	    }
	        
	    return result;
	}

	public static int getValue(char romanChar) {
	    switch (romanChar) {
	        case 'I': return 1;
	        case 'V': return 5;
	        case 'X': return 10;
	        case 'L': return 50;
            case 'C': return 100;
			case 'D': return 500;
	        case 'M': return 1000;
	        default: return 0;
        }
	}

	public static void main(String[] args) {
	    String romanNumeral = "VII";
	    int result = romanToInt(romanNumeral);
        System.out.println("Integer value of " + romanNumeral + " is " + result);
	}
}


