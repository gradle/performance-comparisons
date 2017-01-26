package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_393 {
    private final Production8_393 production = new Production8_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}