package racingcar.view.constant;

public enum ViewMessage {
    ASK_RACING_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    ASK_PLAY_COUNT("시도할 회수는 몇회인가요?"),
    RESULT("실행 결과"),
    WINNER("최종 우승자: %s"),
    LINE_SEPARATOR(System.lineSeparator())
    ;

    private final String message;

    ViewMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.print(message);
    }

    public void printLine() {
        System.out.println(message);
    }
}
