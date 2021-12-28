package by.mjc.module1.util;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isCreatable(str)
                && new BigDecimal(str).compareTo(BigDecimal.ZERO) > 0;
    }
}
