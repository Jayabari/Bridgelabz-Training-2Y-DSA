package com.string;

class UniqueChars {
    public static void main(String[] args) {
        String s = "programming";
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (Exception e) {}
        char[] temp = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                temp[k++] = s.charAt(i);
        }
        for (int i = 0; i < k; i++)
            System.out.print(temp[i] + " ");
    }
}

