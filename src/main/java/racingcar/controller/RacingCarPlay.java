package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.RacingCar;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.constant.ViewMessage;

import java.util.List;

import static racingcar.util.Constant.*;

public class RacingCarPlay {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    public void start() {
        List<RacingCar> racingCars = registerRacingCars();
        int playCount = getPlayCount();

        outputView.printPlayResult();
        for (int startIndex = START_INDEX; startIndex < playCount; startIndex++) {
            playRacing(racingCars);
        }
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

    public void playRacing(List<RacingCar> racingCars) {
        racingCars.stream()
                .filter(racingCar -> racingCar.canMoveForward(Randoms.pickNumberInRange(MINIMUM_DICE, MAXIMUM_DICE)))
                .forEach(RacingCar::moveForward);

        printInterimResult(racingCars);
        ViewMessage.LINE_SEPARATOR.print();
    }

    public void printInterimResult(List<RacingCar> racingCars) {
        racingCars.stream()
                .map(RacingCar::getNameAndDistance)
                .forEach(System.out::println);
    }
}
