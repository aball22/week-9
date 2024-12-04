package org.example.week9.d5.e1;

public class StringManipulator {
    private String str;

    public StringManipulator(String str) {
        this.str = str;
    }
    final String reverseString() {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
