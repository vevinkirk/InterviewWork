package arraysandstrings;
import sorts.*;
import java.util.Arrays;


public class HelloWorld {

  public static  int[] mergeSort(int[] nums) {
    int[] helper = new int[nums.length];
    mergeSort(nums, helper, 0, nums.length - 1);
    return nums;
  }

  private static void mergeSort(int[] nums, int[] helper, int low, int high) {
    if (low < high) {
      int mid = low + (high - low) / 2;
      mergeSort(nums, helper, low, mid);
      mergeSort(nums, helper, mid + 1, high);
      merge(nums, helper, low, mid, high);
    }
  }

  private static void merge(int[] nums, int[] helper, int low, int mid, int high) {
    for (int i = low; i <= high; i++) {
      helper[i] = nums[i];
    }
    int helperLeft = low;
    int helperRight = mid + 1;
    int cur = low;
    // iterate through helper array. Compare the left and right half,
    // copying back the smaller element from the two halves into the
    // original array.
    while (helperLeft <= mid && helperRight <= high) {
      if (helper[helperLeft] <= helper[helperRight]) {
        nums[cur] = helper[helperLeft];
        helperLeft++;
      } else {
        nums[cur] = helper[helperRight];
        helperRight++;
      }
      cur++;
    }
    // copy the rest of the left side of the array into the target array.
    // The right side doesn't need to be copied because it's already there.
    int remaining = mid - helperLeft;
    for (int i = 0; i <= remaining; i++) {
      nums[cur + i] = helper[helperLeft + i];
    }
  }

     public static void main(String []args) {

        int[] a = new int[] { 1, 2, 3,6,7,8,4,2,1,1,1,1,1,1,12,4323,423,2,31,3,4,34,3,1,3,21,3,1,23,1,23,1,3,23};
        int[] b = new int[] { 3, 4, 5,3,42,5,2,1,2,3,12,3,1,2,3,23,5,4,5,444,43,6,7,535,4554,33,42,43443,45432,4};
        int[] r = new int[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);

        // prints 1, 2, 3, 4, 5 on sep. lines

        System.out.println(Arrays.toString(mergeSort(r)));
     }
}
