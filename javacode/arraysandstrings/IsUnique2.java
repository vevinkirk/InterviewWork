class IsUnique{
  //bitshifting
  boolean isUnique1 (String s){
    int checker = 0;
    for(int i =0;i<s.length();i++){
      int val = s.charAt(i) - 'a';
      if((checker & (1 << val)) > 0){
        return false;
      }
      checker |= (1 << val);
    }
    return true;
  }

  //using different data structure
  boolean isUnique2(String s){
    boolean[] char_set = new boolean[128];
    for(int i = 0 ; i < s.length();i++){
      int val = s.charAt(i);
      if(char_set[val]){
        return false;
      }
      char_set[val] = true;
    }
    return true;
  }

  //checking every character
  boolean isUnique3(String s){
    int i,j;
    for( i = 0;i<s.length();i++){
        for( j = i+1;j<s.length();j++){
          if(s.charAt(i) == s.charAt(j)){
            return false;
          }
        }
    }

    return true;
  }

  public static void main(String[] args) {
    IsUnique iu = new IsUnique();
    String s = "abcdefghijklmnopqrstuvwxyza";
    System.out.println(iu.isUnique1(s));
    System.out.println(iu.isUnique2(s));
    System.out.println(iu.isUnique3(s));
  }
}
