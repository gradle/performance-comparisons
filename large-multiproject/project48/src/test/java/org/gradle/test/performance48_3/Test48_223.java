package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_223 {
    private final Production48_223 production = new Production48_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}