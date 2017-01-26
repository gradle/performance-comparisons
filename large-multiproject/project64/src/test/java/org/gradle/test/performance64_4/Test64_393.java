package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_393 {
    private final Production64_393 production = new Production64_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}