void main() {
    String s = "aaaabb";
    int result = longestPalindrome(s);
    System.out.println("Length of the longest palindrome that can be built: " + result);
}
public int longestPalindrome(String s) {
    if (s.length() == 1) return 1;
    if (s.length() == 2) return s.charAt(0) == s.charAt(1) ? 2 : 1;
    int result = 0;
    Map<String , Integer> mapChar = new HashMap<>();
    for (int i = 0; i <s.length(); i++) {
        mapChar.put(String.valueOf(s.charAt(i)), mapChar.getOrDefault(String.valueOf(s.charAt(i)), 0) + 1);
    }
    boolean hasOdd = false;
    for (int value : mapChar.values()) {
        if (value % 2 == 0) {
            result += value;
        } else {
            result += value - 1; // lấy phần chẵn
            hasOdd = true;       // đánh dấu còn ký tự lẻ
        }
    }

    return result + (hasOdd ? 1 : 0);
}