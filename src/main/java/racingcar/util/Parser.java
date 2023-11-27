package racingcar.util;

import racingcar.view.constant.ErrorMessage;

public class Parser {
    public static String parseName(String name) {
        try {
            return name.trim();
        } catch (Exception e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getErrorMessage());
        }
    }
}
