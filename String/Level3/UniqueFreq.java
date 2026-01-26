package com.string;

class UniqueFreq {
    public static void main(String[] args) {
        String s = "banana";

        for (int i = 0; i < s.length(); i++) {
            boolean first = true;
            for (int j = 0; j < i; j++)
                if (s.charAt(i) == s.charAt(j))
                    first = false;

            if (first) {
                int count = 0;
                for (int k = 0; k < s.length(); k++)
                    if (s.charAt(i) == s.charAt(k))
                        count++;

                System.out.println(s.charAt(i) + " : " + count);
            }
        }
    }
}

