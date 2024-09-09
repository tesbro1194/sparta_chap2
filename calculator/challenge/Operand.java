package chap2_team12.calculator.challenge;

import java.util.Objects;

public class Operand {

    private final Number value;

    public Operand(String inputValue) {
        validate(inputValue);
        this.value = parseValue(inputValue);
    }

    public Operand(Double inputValue) {
        this.value = inputValue;
    }

    public double getValue() {
        return this.value.doubleValue();
    }

    private Number parseValue(String inputValue) {
        return Double.parseDouble(inputValue);
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
