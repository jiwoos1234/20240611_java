package p04_Array;

import java.util.Arrays;

public class Ex02applicate {
  public static void main(String[] args) {
    int[] score = new int[10];
    for (int i = 0; i < 10; i++) {
      score[i] = (int) (Math.random() * 30 + 70);
    }
//    System.out.println(Arrays.toString(score));
    prArr(score);
    maxArr(score);
    minArr(score);
    sumArr(score);
    avgArr(score);
  }

  public static void minArr(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println(" Min: " + min);
  }

  public static void sumArr(int[] arr) {
    int sum = arr[0];
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println(" Sum: " + sum);
  }


  public static void avgArr(int[] arr) {
    int avg = 0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {

      sum = sum + arr[i];
      avg = sum / arr.length;

    }
    System.out.println(" Avg: " + avg);
  }


  public static void maxArr(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(" Max: " + max);
  }

  public static void prArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (i != 0) System.out.print(",");
      System.out.print(arr[i]);
    }
  }
}
