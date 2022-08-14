package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
       StringBuilder string = new StringBuilder(str);
    	string.append(characters);
    	return string.toString();
    }
    
    public static String reverse(String str) {
        StringBuilder string = new StringBuilder(str);
        string.reverse();
        return string.toString();
    }
    
    public static String insert(String str, int index, char newChar) {
        StringBuilder string = new StringBuilder(str);
        string.insert(index, newChar);
        return string.toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
        StringBuilder string = new StringBuilder(str);
        string.delete(startIndex, endIndex);
        return string.toString();
    }
}