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

public int missingNumberBit(int[] nums) {
    int length = nums.length;
    int xor = 0;
    for (int i = 0; i < length; i++) {
        xor ^= (i + 1) ^ nums[i];  // (i + 1) đóng vai trò là số chua có
    }

    return xor; // Kết quả cuối cùng sẽ là số thiếu
}