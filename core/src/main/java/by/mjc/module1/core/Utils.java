package by.mjc.module1.core;

import by.mjc.module1.util.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... strs) {
        if (strs == null || strs.length == 0) {
            return false;
        }
        for (String str : strs) {
            if (!StringUtils.isPositiveNumber(str)) {
                return false;
            }
        }
        return true;
    }
}
