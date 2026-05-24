void main() {
    String s = "abcde";
    String t = "cdeab";
    System.out.println(rotateString(s, t));
    System.out.println(rotateString2(s, t));
}

boolean rotateString(String s, String goal) {
    if (s.length() != goal.length()) return false;

    int n = s.length();
    // Try each starting offset
    for (int k = 0; k < n; k++) {
        boolean match = true;
        // Compare characters using modular arithmetic
        for (int j = 0; j < n; j++) {
            if (s.charAt((k + j) % n) != goal.charAt(j)) {
                match = false;
                break;
            }
        }
        if (match) return true;
    }

    return false;
}

boolean rotateString2(String s, String goal) {
    if (s.length() != goal.length()) return false;

    String doubled = s + s;
    return doubled.contains(goal);
}