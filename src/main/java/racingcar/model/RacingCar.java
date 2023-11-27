package racingcar.model;

import racingcar.view.constant.ErrorMessage;

public class RacingCar {
    private final String name;
    private final int distance;

    public RacingCar(String name, int distance) {
        validateCarName(name);
        this.name = name;
        this.distance = distance;
    }

    private void validateCarName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.TOO_LONG_CAR_NAME.getErrorMessage());
        }
    }
}
