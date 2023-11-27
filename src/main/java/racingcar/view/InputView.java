package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.Parser;
import racingcar.view.constant.ViewMessage;

import java.util.Arrays;
import java.util.List;

import static racingcar.util.Constant.SEPARATOR_COMMA;

public class InputView {

    public List<String> readRacingCarNames() {
        ViewMessage.ASK_RACING_CAR_NAMES.print();

        return Arrays.stream(Console.readLine().split(SEPARATOR_COMMA))
                .map(Parser::parseName)
                .toList();
    }
}
