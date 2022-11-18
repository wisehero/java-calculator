package service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculateUIServiceTest {

    CalculatorUIService calculatorUIService = new CalculatorUIService();

    @Test
    @DisplayName("메뉴 선택 테스트 (숫자 입력)")
    void inputNumber() {
        // given
        calculatorUIService.showInterface();
    }
}
