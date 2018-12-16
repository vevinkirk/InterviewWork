class test2{
public String helper(String s1, String s2) {
    StringBuilder sb = new StringBuilder();
    int mLen = min(s1.length(), s2.length());
    for (int i = 0;i < mLen; i++) {
        if(s1.charAt(i) != s2.charAt(i)) {
            break;
        }
        sb.append(i);
   }
   return sb.toString();
}

public String LPS(String arr[], int low, int high) {
    if(low == high) return arr[low];
    if(high > low) {
        int mid = low + (high - low) / 2;
        String s1 = LPS(arr, low, mid);
        String s2 = LPS(arr, mid + 1, high);
	return (helper(s1, s2));
    }
    return null;
}
}
