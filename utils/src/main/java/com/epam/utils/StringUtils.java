package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return Integer.valueOf(str) % 2 == 0 ? true : false;
    }
}
