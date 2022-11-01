package oct31;

import java.util.HashSet;
import java.util.Set;

public class SubSequence03 {
public static void main(String[] args) {
		
		String str = "XYBYAXBY";
		System.out.println(new SubSequence03().numberOfRepeatedSubsequence(str));
		
	}
	
	Set<String> res;
	String comb1 = "";
	String comb2 = "";
	
	public int numberOfRepeatedSubsequence(String str) {
		
		res = new HashSet<>();
		
		generateSubsequence(str, 0);
		
		System.out.println(res);
		return res.size();
		
	}	
	private void generateSubsequence(String str, int index) {
			
		if (comb1.length() > 1) {
			containsSequence(comb1, str.substring(index-1));
		}
				
		for (int i=index; i<str.length(); i++) {
			
			comb1 += str.charAt(i);			
			generateSubsequence(str, i+1);
			comb1 = comb1.substring(0,comb1.length()-1);
			
		}
		
	}
	
	private boolean containsSequence(String a, String str) {

		int len = a.length();
		int index = -1;
		boolean isMatch = true;
				
		for (int i=0; i<len; i++) {
			str = str.substring(index+1);
			index = str.indexOf(a.charAt(i));
			if (index == -1) {
				isMatch = false;
				break;
			}
		}
		
		if (isMatch) {
			res.add(a);
			return true;
		}
		
		return false;
		
	}
}
