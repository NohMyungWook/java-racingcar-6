package racingcar.model;

import racingcar.view.constant.ErrorMessage;

import java.util.regex.Pattern;

import static racingcar.util.Constant.*;

public class CarName {
    private final String carName;

    public CarName(String carName) {
        validateBlank(carName);
        validateKoreanAndNumberAndSpecialCharacter(carName);
        validateLength(carName);
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    private void validateBlank(String name) {
        if (name.isBlank())
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getErrorMessage());
    }

    private void validateLength(String name) {
        if (name.length() > MAX_NAME_LENGTH)
            throw new IllegalArgumentException(ErrorMessage.TOO_LONG_CAR_NAME.getErrorMessage());
    }

    private void validateKoreanAndNumberAndSpecialCharacter(String name) {
        if (Pattern.matches(HAS_KOREAN_AND_NUMBER_AND_SPECIAL_CHARACTER, name))
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getErrorMessage());
    }
}
