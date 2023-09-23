package core.basesyntax.model;

import java.util.Arrays;

public enum Operation {
    BALANCE("b"),
    SUPPLY("s"),
    PURCHASE("p"),
    RETURN("r");

    private String code;

    Operation(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Operation getOperationByCode(String code) {
        return Arrays.stream(Operation.values())
                .filter(o -> o.getCode().equals(code))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Can`t find operation by code"));
    }
}