package com.string;

class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        boolean pal = true;
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                pal = false;
        System.out.println(pal);
        char[] a = s.toCharArray();
        boolean pal2 = true;
        for (int k = 0; k < a.length / 2; k++)
            if (a[k] != a[a.length - 1 - k])
                pal2 = false;
        System.out.println(pal2);
    }
}

