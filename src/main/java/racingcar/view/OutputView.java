package racingcar.view;

import racingcar.view.constant.ViewMessage;

import java.util.List;

import static racingcar.util.Constant.WINNER_COMMA;

public class OutputView {
    public void printPlayResult() {
        ViewMessage.LINE_SEPARATOR.print();
        ViewMessage.RESULT.printLine();
    }

    public void printWinner(List<String> winnerCars) {
        ViewMessage.WINNER.renderAndPrint(String.join(WINNER_COMMA, winnerCars));
    }
}
