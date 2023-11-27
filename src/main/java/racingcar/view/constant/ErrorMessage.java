package racingcar.view.constant;

public enum ErrorMessage {
    INVALID_INPUT("올바른 입력값이 아닙니다."),
    TOO_LONG_CAR_NAME("자동차의 이름은 5자 이하여야 합니다."),
    ;

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
