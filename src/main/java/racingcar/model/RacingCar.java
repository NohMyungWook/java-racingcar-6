package racingcar.model;

import racingcar.view.constant.ErrorMessage;

import static racingcar.util.Constant.*;

public class RacingCar {
    private final String name;
    private int distance;

    public RacingCar(String name, int distance) {
        validateCarName(name);
        this.name = name;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public boolean canMoveForward(int dice) {
        return dice >= CAN_MOVE_DICE;
    }

    public void moveForward() {
        distance ++;
    }

    public boolean isMaxDistance(int distance) {
        return this.distance == distance;
    }

    public String getNameAndDistance() {
        return name + SEPARATOR_COLON + DISTANCE.repeat(distance);
    }

    private void validateCarName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.TOO_LONG_CAR_NAME.getErrorMessage());
        }
    }
}
