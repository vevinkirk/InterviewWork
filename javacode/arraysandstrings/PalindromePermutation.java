package arraysandstrings;

public class PalindromePermutation {
	public boolean isPerm(String s) {
		if (s == null) {
			return false;
		}
		int countOdd = 0;
		int[] counts = new int[26];
		for (char c : s.toCharArray()) {
			// 'a' to 'z'
			if (c >= 'a' && c <= 'z') {
				counts[c - 'a']++;
				if (counts[c - 'a'] % 2 == 1) {
					countOdd++;
				} else {
					countOdd--;
				}
			}
		}
		return countOdd < 2;
	}

	public static void main(String[] args) {
		PalindromePermutation pp = new PalindromePermutation();
		System.out.println(pp.isPerm("tactd coa"));
	}
}
