void main() {
    int output = missingNumber(new int[]{0, 1});
    System.out.println(output);
}

public int missingNumber(int[] nums) {
    int length = nums.length;
    Arrays.sort(nums);
    for (int i = 0 ; i < length ; i++) {
        if (nums[i] != i) {
            return i;
        }
    }
    return nums.length;
}