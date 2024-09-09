package chap2_team12.challenge;

import java.math.BigDecimal;
import java.util.Objects;

public class Operand {

    private final BigDecimal value;

    public Operand(String inputValue) {
        validate(inputValue);
        this.value = BigDecimal.valueOf(Double.parseDouble(inputValue));
    }

    public BigDecimal getValue() {
        return this.value;
    }

    private void validate(String inputValue) {
        try {
            Double.parseDouble(inputValue);
        } catch (NumberFormatException exception2) {
            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operand operand = (Operand) o;

        return value.equals(operand.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
