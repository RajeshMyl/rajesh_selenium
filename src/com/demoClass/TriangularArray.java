package com.demoClass;
import java.util.*;
 
public class TriangularArray {
  public static void main(String[] args) {
    int[][] triangle = arraytriangle(5);
    System.out.println(Arrays.deepToString(triangle));
  }
 
  public static int[][] arraytriangle(int lines){
    int[][] tri = new int[lines][];
    int x = 1;
    for (int i = 0; i < lines; i++){
      tri[i] = new int[i+1];
      for (int j = 0; j <= i; j++){
        tri[i][j] = x;
        System.out.print(x + " ");
        x++;
      }
      System.out.println();
    }
    return tri;
  }
}