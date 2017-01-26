package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_393 {
    private final Production40_393 production = new Production40_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}