package racingcar.controller;

import racingcar.model.RacingCar;
import racingcar.view.InputView;

import java.util.List;

import static racingcar.util.Constant.INITIALIZE_DISTANCE;

public class RacingCarPlay {
    InputView inputView = new InputView();
    public void start() {
        List<RacingCar> racingCars = registerRacingCars();
        int playCount = getPlayCount();
    }

    public List<RacingCar> registerRacingCars() {
        return inputView.readRacingCarNames()
                .stream()
                .map(name -> new RacingCar(name, INITIALIZE_DISTANCE))
                .toList();
    }

    public int getPlayCount() {
        return inputView.readPlayCount();
    }
}
