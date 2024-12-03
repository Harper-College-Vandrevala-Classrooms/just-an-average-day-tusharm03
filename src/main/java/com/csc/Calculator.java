package com.csc;
import java.util.Arrays;
public class Calculator {

  public int maximumUsingStream(int[] nums) {
      if (nums == null || nums.length == 0) {
          throw new IllegalArgumentException("Array must not be empty");
      }
      return Arrays.stream(nums).max().orElseThrow();
  }

  public int minimumUsingStream(int[] nums) {
      if (nums == null || nums.length == 0) {
          throw new IllegalArgumentException("Array must not be empty");
      }
      return Arrays.stream(nums).min().orElseThrow();
  }

  public int sumUsingStream(int[] nums) {
      return Arrays.stream(nums).sum(); // Safe even for empty arrays, returns 0.
  }

  public double averageUsingStream(int[] nums) {
      if (nums == null || nums.length == 0) {
          throw new IllegalArgumentException("Array must not be empty");
      }
      return Arrays.stream(nums).average().orElseThrow();
  }

    public int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int minimumUsingForLoop(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public double averageUsingForLoop(int[] nums) {
        return (double) sumUsingForLoop(nums) / nums.length;
    }

}
