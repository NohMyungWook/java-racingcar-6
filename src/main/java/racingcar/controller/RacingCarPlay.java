package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.CarName;
import racingcar.model.RacingCar;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.constant.ViewMessage;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

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

        showWinner(racingCars);
    }

    public List<RacingCar> registerRacingCars() {
        return inputView.readRacingCarNames()
                .stream()
                .map(name -> new RacingCar(new CarName(name), INITIALIZE_DISTANCE))
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

    public void showWinner(List<RacingCar> racingCars) {
        int maxDistance = racingCars.stream()
                .max(Comparator.comparing(RacingCar::getDistance))
                .orElseThrow(NoSuchElementException::new)
                .getDistance();

        List<String> winners = racingCars.stream()
                .filter(racingCar -> racingCar.isMaxDistance(maxDistance))
                .map(RacingCar::getName)
                .map(CarName::getCarName)
                .toList();

        outputView.printWinner(winners);
    }
}
