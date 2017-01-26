package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_429 {
    private final Production48_429 production = new Production48_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}