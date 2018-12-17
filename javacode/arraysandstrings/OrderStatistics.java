import java.io.*;
import java.util.*;

class Solution{

  public static void main(String[] args){
    /*ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello,World!");
    strings.add("Welcome to Codepad");
    strings.add("This pad is running java8");

    for(String string : strings){
      System.out.println(string);
    }*/
    int[] input = {3,2,5,6};
    System.out.println(min(input));
  }

  public static int min(int[] arr, int n){
    int[] RightArray = {};
    int[] LeftArray = {};
      
    for(int i=0;i<arr.length;i++){
       if(arr[i] < min){
         min2 = min;
         min = arr[i];
       }
       else if(arr[i] < min2){
         min2 = arr[i];
       }
    }
    return min2;
  }
}




/*
1  6  3  9  2  5

1st smallest number = 1
2nd smallest number = 2
nth orders statistic  = nth smallest in the smallest

*/
