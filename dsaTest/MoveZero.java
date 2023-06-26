public class MoveZero { // MoveZeroes
          public void moveZeroes(int[] nums) {
                    int n = nums.length;
                    int i = 0; // Pointer for iterating over the array

                    // Move all the nonzero elements to the front of the array
                    for (int num : nums) {
                              if (num != 0) {
                                        nums[i] = num;
                                        i++;
                              }
                    }

                    // Fill the remaining positions with zeros
                    while (i < n) {
                              nums[i] = 0;
                              i++;
                    }
          }

          public static void main(String[] args) {
                    int[] nums = { 0, 1, 0, 3, 12 };

                    MoveZero solution = new MoveZero();
                    solution.moveZeroes(nums);

                    System.out.print("Result: ");
                    for (int num : nums) {
                              System.out.print(num + " ");
                    }
                    System.out.println();
          }
}
