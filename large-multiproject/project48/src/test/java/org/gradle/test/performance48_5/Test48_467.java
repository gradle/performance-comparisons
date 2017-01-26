package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_467 {
    private final Production48_467 production = new Production48_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}