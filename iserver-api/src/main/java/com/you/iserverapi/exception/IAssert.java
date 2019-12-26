package com.you.iserverapi.exception;

import java.util.Collection;
import java.util.regex.Pattern;

public class IAssert {
    public static void notNull(Object o, String message) {
        if (o == null || o.equals("")) {
            throw new IParamException(message);
        }
    }

    public static void isTrue(Boolean flag, String message) {
        if (!flag) {
            throw new IParamException(message);
        }
    }

    public static void notEmpty(Collection<?> collection, String message) {
        if (collection == null || collection.isEmpty()) {
            throw new IParamException(message);
        }
    }

    public static void match(Pattern regx, String input, String message) {
        if (!regx.matcher(input).find()) {
            throw new IParamException(message);
        }
    }

    public static void isNull(Object input, String message) {
        if (input != null) {
            throw new IParamException(message);
        }
    }
    public static void isEmpty(Collection<?> collection, String message) {
        if (collection != null && !collection.isEmpty()) {
            throw new IParamException(message);
        }
    }


}
