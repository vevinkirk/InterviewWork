package treesandgraphs;

import java.util.LinkedList;
import java.util.Queue;

public class MinimalTree{
  public Treenode createMinimalBST(int array[]){
    return createMinimalBST(array,0,array.length-1);
  }
  private Treenode createMinimalBST(int arr[],int start,int end){
    if(end<start){
      return null;
    }
    int mid = (start+end)/2;
    Treenode n = new Treenode(arr[mid]);
    n.left = createMinimalBST(arr,start,mid-1);
    n.right = createMinimalBST(arr,mid+1,end);
    return n;
  }
}
