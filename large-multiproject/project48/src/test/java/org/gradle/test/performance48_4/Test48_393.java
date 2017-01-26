package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_393 {
    private final Production48_393 production = new Production48_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}