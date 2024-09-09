package chap2_team12.challenge;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ResultLogs {
    private final List<ResultLog> resultLogs = new ArrayList<>();


    public void save(Operand first, Operand second, BigDecimal result, String operator) {
        resultLogs.add(new ResultLog(first, second, result, operator));
    }

    public List<ResultLog> filter(Predicate<ResultLog> predicate) {
        return resultLogs.stream()
                .filter(predicate)
                .toList();
    }

    public List<ResultLog> getAllLogs() {
        return resultLogs;
    }
}
