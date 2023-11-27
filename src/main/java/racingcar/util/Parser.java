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

    public static int parseNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.NOT_A_NUMBER.getErrorMessage());
        }
    }
}
