package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.controller.RacingCarPlay;

public class Application {
    public static void main(String[] args) {
        RacingCarPlay racingCarPlay = new RacingCarPlay();
        racingCarPlay.start();
        Console.close();
    }
}
