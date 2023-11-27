package racingcar.model;

import racingcar.view.constant.ErrorMessage;

import static racingcar.util.Constant.*;

public class RacingCar {
    private final CarName name;
    private int distance;

    public RacingCar(CarName name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public CarName getName() {
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
        return name.getCarName() + SEPARATOR_COLON + DISTANCE.repeat(distance);
    }
}
